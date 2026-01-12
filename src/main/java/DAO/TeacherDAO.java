package DAO;

import EntityClasses.Teacher;
import EntityClasses.Course;
import EntityClasses.User;
import Database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Security.PasswordUtil;

/**
 * Data Access Object for handling Teacher-related database operations.
 */
public class TeacherDAO {

    /**
     * Adds a new teacher to the database.
     * This involves creating a User record, a Teacher record, and updating course
     * assignments.
     *
     * @param newTeacher the Teacher object to add
     * @throws SQLException if a database access error occurs
     */
    public void addTeacher(Teacher newTeacher) throws SQLException {
        Connection connection = null;
        try {
            connection = DatabaseConnection.getConnection();
            connection.setAutoCommit(false);

            String userQuery = "INSERT INTO Users (username, password, email, role) VALUES (?, ?, ?, ?)";
            PreparedStatement userStmt = connection.prepareStatement(userQuery,
                    PreparedStatement.RETURN_GENERATED_KEYS);
            userStmt.setString(1, newTeacher.getUsername());
            userStmt.setString(2, PasswordUtil.hashPassword(newTeacher.getPassword()));
            userStmt.setString(3, newTeacher.getEmail());
            userStmt.setString(4, EntityClasses.Role.TEACHER.toString());
            userStmt.executeUpdate();

            ResultSet generatedKeys = userStmt.getGeneratedKeys();
            if (!generatedKeys.next()) {
                throw new SQLException("Failed to insert user, no ID obtained.");
            }
            int userId = generatedKeys.getInt(1);
            newTeacher.setUserId(userId);

            String teacherQuery = "INSERT INTO Teachers (userId) VALUES (?)";
            PreparedStatement teacherStmt = connection.prepareStatement(teacherQuery,
                    PreparedStatement.RETURN_GENERATED_KEYS);
            teacherStmt.setInt(1, userId);
            teacherStmt.executeUpdate();

            ResultSet teacherKeys = teacherStmt.getGeneratedKeys();
            if (!teacherKeys.next()) {
                throw new SQLException("Failed to insert teacher, no ID obtained.");
            }
            int teacherId = teacherKeys.getInt(1);

            // Update teachId in Courses
            if (newTeacher.getAssignedCourses() != null && !newTeacher.getAssignedCourses().isEmpty()) {
                String updateCourseQuery = "UPDATE Courses SET teachId = ? WHERE courseId = ?";
                PreparedStatement updateCourseStmt = connection.prepareStatement(updateCourseQuery);
                for (Course course : newTeacher.getAssignedCourses()) {
                    updateCourseStmt.setInt(1, teacherId);
                    updateCourseStmt.setInt(2, course.getCourseId());
                    updateCourseStmt.addBatch();
                }
                updateCourseStmt.executeBatch();
            }
            connection.commit();
        } catch (SQLException e) {
            if (connection != null)
                connection.rollback();
            throw e;
        } finally {
            if (connection != null)
                connection.close();
        }
    }

    /**
     * Updates an existing teacher's information.
     *
     * @param teacher the Teacher object with updated details
     * @throws SQLException if a database access error occurs
     */
    public void updateTeacher(Teacher teacher) throws SQLException {
        Connection connection = null;
        try {
            connection = DatabaseConnection.getConnection();
            connection.setAutoCommit(false);

            String userUpdateQuery = "UPDATE Users SET username = ?, password = ?, email = ? WHERE userId = ?";
            PreparedStatement userStmt = connection.prepareStatement(userUpdateQuery);
            userStmt.setString(1, teacher.getUsername());
            userStmt.setString(2, PasswordUtil.hashPassword(teacher.getPassword()));
            userStmt.setString(3, teacher.getEmail());
            userStmt.setInt(4, teacher.getUserId());
            userStmt.executeUpdate();

            connection.commit();
        } catch (SQLException e) {
            if (connection != null)
                connection.rollback();
            throw e;
        } finally {
            if (connection != null)
                connection.close();
        }
    }

    /**
     * Removes a teacher from the database.
     * Also unassigns any courses taught by this teacher.
     *
     * @param teacherId the ID of the teacher to remove
     * @throws SQLException if a database access error occurs
     */
    public void removeTeacher(int teacherId) throws SQLException {
        Connection connection = null;
        try {
            connection = DatabaseConnection.getConnection();
            connection.setAutoCommit(false);

            String getUserIdQuery = "SELECT userId FROM Teacher WHERE teachId = ?";
            PreparedStatement getUserIdStmt = connection.prepareStatement(getUserIdQuery);
            getUserIdStmt.setInt(1, teacherId);
            ResultSet rs = getUserIdStmt.executeQuery();
            int userId = -1;
            if (rs.next()) {
                userId = rs.getInt("userId");
            }

            String unassignCoursesQuery = "UPDATE Courses SET teachId = NULL WHERE teachId = ?";
            PreparedStatement unassignCoursesStmt = connection.prepareStatement(unassignCoursesQuery);
            unassignCoursesStmt.setInt(1, teacherId);
            unassignCoursesStmt.executeUpdate();

            String deleteTeacherQuery = "DELETE FROM Teacher WHERE teachId = ?";
            PreparedStatement deleteTeacherStmt = connection.prepareStatement(deleteTeacherQuery);
            deleteTeacherStmt.setInt(1, teacherId);
            deleteTeacherStmt.executeUpdate();

            if (userId != -1) {
                String deleteUserQuery = "DELETE FROM Users WHERE userId = ?";
                PreparedStatement deleteUserStmt = connection.prepareStatement(deleteUserQuery);
                deleteUserStmt.setInt(1, userId);
                deleteUserStmt.executeUpdate();
            }
            connection.commit();
        } catch (SQLException e) {
            if (connection != null)
                connection.rollback();
            throw e;
        } finally {
            if (connection != null)
                connection.close();
        }
    }

    /**
     * Retrieves all teachers from the database.
     *
     * @return a list of User objects representing teachers
     * @throws SQLException if a database access error occurs
     */
    public List<User> getAllTeachers() throws SQLException {
        List<User> teachers = new ArrayList<>();
        String query = "SELECT userId, username, password, email FROM Users WHERE role = ?";
        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, EntityClasses.Role.TEACHER.toString());
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Teacher teacher = new Teacher(
                            rs.getInt("userId"),
                            rs.getString("username"),
                            rs.getString("password"),
                            rs.getString("email"),
                            new ArrayList<>());
                    teachers.add(teacher);
                }
            }
        }
        return teachers;
    }

    /**
     * Gets the teacher ID for a given user ID.
     *
     * @param userId the user ID
     * @return the teacher ID, or -1 if not found
     * @throws SQLException if a database access error occurs
     */
    public int getTeacherIdByUserId(int userId) throws SQLException {
        String query = "SELECT teachId FROM Teacher WHERE userId = ?";
        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("teachId");
            }
        }
        return -1;
    }
}
