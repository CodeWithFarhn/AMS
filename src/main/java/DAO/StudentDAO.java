package DAO;

import EntityClasses.Student;
import EntityClasses.Course;
import Database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Security.PasswordUtil;

/**
 * Data Access Object for handling Student-related database operations.
 */
public class StudentDAO {

    /**
     * Adds a new student to the database.
     * This involves creating a User record, a Student record, and linking initial
     * courses.
     *
     * @param newStd the Student object to add
     * @throws SQLException if a database access error occurs
     */
    public void addStudent(Student newStd) throws SQLException {
        Connection connection = null;
        try {
            connection = DatabaseConnection.getConnection();
            connection.setAutoCommit(false);

            // Step 1: Add the user to the Users table
            String userQuery = "INSERT INTO Users (username, password, email, role) VALUES (?, ?, ?, ?)";
            PreparedStatement userStmt = connection.prepareStatement(userQuery,
                    PreparedStatement.RETURN_GENERATED_KEYS);
            userStmt.setString(1, newStd.getUsername());
            // Hash the password
            userStmt.setString(2, PasswordUtil.hashPassword(newStd.getPassword()));
            userStmt.setString(3, newStd.getEmail());
            userStmt.setString(4, EntityClasses.Role.STUDENT.toString());
            userStmt.executeUpdate();

            ResultSet generatedKeys = userStmt.getGeneratedKeys();
            if (!generatedKeys.next()) {
                throw new SQLException("Failed to insert user, no ID obtained.");
            }
            int userId = generatedKeys.getInt(1);
            newStd.setUserId(userId); // Update object with generated ID

            // Step 2: Add the student to the Students table (Only link to User)
            String studentQuery = "INSERT INTO Students (userId) VALUES (?)";
            PreparedStatement studentStmt = connection.prepareStatement(studentQuery,
                    PreparedStatement.RETURN_GENERATED_KEYS);
            studentStmt.setInt(1, userId);
            studentStmt.executeUpdate();

            ResultSet studentKeys = studentStmt.getGeneratedKeys();
            if (!studentKeys.next()) {
                throw new SQLException("Failed to insert student, no ID obtained.");
            }
            int stdId = studentKeys.getInt(1);

            // Step 3: Insert courses
            if (newStd.getRegisteredCourses() != null && !newStd.getRegisteredCourses().isEmpty()) {
                String studentCoursesQuery = "INSERT INTO StudentCourses (courseId, stdId) VALUES (?, ?)"; // Removed
                                                                                                           // coursename
                PreparedStatement studentCoursesStmt = connection.prepareStatement(studentCoursesQuery);
                for (Course course : newStd.getRegisteredCourses()) {
                    studentCoursesStmt.setInt(1, course.getCourseId());
                    studentCoursesStmt.setInt(2, stdId);
                    studentCoursesStmt.addBatch();
                }
                studentCoursesStmt.executeBatch();
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
     * Updates an existing student's information.
     *
     * @param student the Student object with updated details
     * @throws SQLException if a database access error occurs
     */
    public void updateStudent(Student student) throws SQLException {
        Connection connection = null;
        try {
            connection = DatabaseConnection.getConnection();
            connection.setAutoCommit(false);

            String userUpdateQuery = "UPDATE Users SET username = ?, password = ?, email = ? WHERE userId = ?";
            PreparedStatement userStmt = connection.prepareStatement(userUpdateQuery);
            userStmt.setString(1, student.getUsername());
            userStmt.setString(2, PasswordUtil.hashPassword(student.getPassword()));
            userStmt.setString(3, student.getEmail());
            userStmt.setInt(4, student.getUserId());
            userStmt.executeUpdate();

            // Student table only holds ID now, no update needed unless linking logic
            // changes

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
     * Removes a student from the database.
     * Use with caution.
     *
     * @param studentId the ID of the student to remove
     * @throws SQLException if a database access error occurs
     */
    public void removeStudent(int studentId) throws SQLException {
        Connection connection = null;
        try {
            connection = DatabaseConnection.getConnection();
            connection.setAutoCommit(false);

            // Get userId first to delete from Users table later
            String getUserId = "SELECT userId FROM Students WHERE stdId = ?";
            PreparedStatement getUserIdStmt = connection.prepareStatement(getUserId);
            getUserIdStmt.setInt(1, studentId);
            ResultSet rs = getUserIdStmt.executeQuery();
            int userId = -1;
            if (rs.next())
                userId = rs.getInt("userId");

            // Delete from StudentCourses
            String deleteCourses = "DELETE FROM StudentCourses WHERE stdId = ?";
            PreparedStatement delCoursesStmt = connection.prepareStatement(deleteCourses);
            delCoursesStmt.setInt(1, studentId);
            delCoursesStmt.executeUpdate();

            // Delete from Students
            String deleteStudent = "DELETE FROM Students WHERE stdId = ?";
            PreparedStatement delStdStmt = connection.prepareStatement(deleteStudent);
            delStdStmt.setInt(1, studentId);
            delStdStmt.executeUpdate();

            // Delete from Users
            if (userId != -1) {
                String deleteUser = "DELETE FROM Users WHERE userId = ?";
                PreparedStatement delUserStmt = connection.prepareStatement(deleteUser);
                delUserStmt.setInt(1, userId);
                delUserStmt.executeUpdate();
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
     * Retrieves all students from the database.
     *
     * @return a list of Student objects
     * @throws SQLException if a database access error occurs
     */
    public List<Student> getAllStudents() throws SQLException {
        List<Student> students = new ArrayList<>();
        String query = "SELECT s.userId, s.stdId, u.username, u.password, u.email FROM Students s JOIN Users u ON s.userId = u.userId";
        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement stmt = connection.prepareStatement(query);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Student std = new Student(
                        rs.getInt("userId"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("email"),
                        new ArrayList<>());
                students.add(std);
            }
        }
        return students;
    }

    /**
     * Gets the student ID for a given user ID.
     *
     * @param userId the user ID
     * @return the student ID, or -1 if not found
     * @throws SQLException if a database access error occurs
     */
    public int getStudentIdByUserId(int userId) throws SQLException {
        String query = "SELECT stdId FROM Students WHERE userId = ?";
        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("stdId");
            }
        }
        return -1;
    }
}
