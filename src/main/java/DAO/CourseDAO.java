package DAO;

import EntityClasses.Course;
import EntityClasses.Assignment;
import Database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object for handling Course-related database operations.
 */
public class CourseDAO {

    /**
     * Adds a new course to the database.
     *
     * @param course the Course object to add
     * @throws SQLException if a database access error occurs
     */
    public void addNewCourse(Course course) throws SQLException {
        String query = "INSERT INTO Courses (coursename, teachId) VALUES (?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, course.getCourseName());
            if (course.getTeachId() == 0) {
                preparedStatement.setNull(2, java.sql.Types.INTEGER);
            } else {
                preparedStatement.setInt(2, course.getTeachId());
            }
            preparedStatement.executeUpdate();
        }
    }

    /**
     * Updates an existing course in the database.
     *
     * @param course the Course object with updated details
     * @return true if the update was successful, false otherwise
     * @throws SQLException if a database access error occurs
     */
    public boolean updateCourse(Course course) throws SQLException {
        // Logic to check existence moved here or handled by caller/exception
        String updateQuery = "UPDATE Courses SET coursename = ?, teachId = ? WHERE courseId = ?";
        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement updateStmt = connection.prepareStatement(updateQuery)) {

            updateStmt.setString(1, course.getCourseName());
            if (course.getTeachId() == 0) {
                updateStmt.setNull(2, java.sql.Types.INTEGER);
            } else {
                updateStmt.setInt(2, course.getTeachId());
            }
            updateStmt.setInt(3, course.getCourseId());
            int rowsUpdated = updateStmt.executeUpdate();
            return rowsUpdated > 0;
        }
    }

    /**
     * Removes a course from the database, including related data.
     *
     * @param courseId the ID of the course to remove
     * @return true if the deletion was successful, false otherwise
     * @throws SQLException if a database access error occurs
     */
    public boolean removeCourse(int courseId) throws SQLException {
        String deleteStudentCoursesQuery = "DELETE FROM StudentCourses WHERE courseId = ?";
        String deleteAssignmentsQuery = "DELETE FROM Assignments WHERE courseId = ?";
        String deleteCoursesQuery = "DELETE FROM Courses WHERE courseId = ?";

        try (Connection connection = DatabaseConnection.getConnection()) {
            connection.setAutoCommit(false);

            try (PreparedStatement deleteStudentCoursesStmt = connection.prepareStatement(deleteStudentCoursesQuery);
                    PreparedStatement deleteAssignmentsStmt = connection.prepareStatement(deleteAssignmentsQuery);
                    PreparedStatement deleteCoursesStmt = connection.prepareStatement(deleteCoursesQuery)) {

                deleteStudentCoursesStmt.setInt(1, courseId);
                deleteStudentCoursesStmt.executeUpdate();

                deleteAssignmentsStmt.setInt(1, courseId);
                deleteAssignmentsStmt.executeUpdate();

                deleteCoursesStmt.setInt(1, courseId);
                int rowsAffected = deleteCoursesStmt.executeUpdate();

                if (rowsAffected == 0) {
                    connection.rollback();
                    return false;
                }
                connection.commit();
                return true;
            } catch (SQLException e) {
                connection.rollback();
                throw e;
            }
        }
    }

    /**
     * Retrieves a list of courses registered by a specific student.
     *
     * @param studentId the ID of the student
     * @return a list of registered Course objects
     * @throws SQLException if a database access error occurs
     */
    public List<Course> getRegisteredCourses(int studentId) throws SQLException {
        List<Course> registeredCourses = new ArrayList<>();
        String query = "SELECT c.courseId, c.coursename, c.teachId " +
                "FROM Courses c " +
                "INNER JOIN StudentCourses sc ON c.courseId = sc.courseId " +
                "WHERE sc.stdId = ?;";

        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, studentId);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Course course = new Course(
                        rs.getInt("courseId"),
                        rs.getString("coursename"),
                        rs.getInt("teachId"));
                registeredCourses.add(course);
            }
        }
        return registeredCourses;
    }

    /**
     * Retrieves a list of courses taught by a specific teacher.
     *
     * @param teacherId the ID of the teacher
     * @return a list of Course objects taught by the teacher
     * @throws SQLException if a database access error occurs
     */
    public List<Course> getCoursesByTeacher(int teacherId) throws SQLException {
        List<Course> courses = new ArrayList<>();
        String query = "SELECT * FROM Courses WHERE teachId = ?";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, teacherId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Course course = new Course(
                        rs.getInt("courseId"),
                        rs.getString("coursename"),
                        rs.getInt("teachId"));
                courses.add(course);
            }
        }
        return courses;
    }

    /**
     * Retrieves a list of assignments for a specific course.
     *
     * @param courseId the ID of the course
     * @return a list of Assignment objects for the course
     * @throws SQLException if a database access error occurs
     */
    public List<Assignment> getAssignmentsForCourse(int courseId) throws SQLException {
        List<Assignment> assignments = new ArrayList<>();
        String query = "SELECT * FROM Assignment WHERE courseID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, courseId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // Assuming Assignment constructor order
                Assignment assignment = new Assignment(
                        rs.getInt("assId"),
                        courseId,
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getString("duedate"),
                        rs.getString("filePath"));
                assignments.add(assignment);
            }
        }
        return assignments;
    }
}
