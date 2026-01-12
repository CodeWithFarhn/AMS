package DAO;

import Database.DatabaseConnection;
import EntityClasses.Assignment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Data Access Object for handling Assignment-related database operations.
 */
public class AssignmentDAO {

    /**
     * Adds a new assignment to the database.
     *
     * @param assignment the Assignment object to add
     * @throws SQLException if a database access error occurs
     */
    public void addAssignment(Assignment assignment) throws SQLException {
        Connection connection = null;
        try {
            connection = DatabaseConnection.getConnection();
            String query = "INSERT INTO Assignments (title, description, duedate, filepath, courseId) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, assignment.getTitle());
            stmt.setString(2, assignment.getDescription());
            stmt.setString(3, assignment.getDeadline());
            stmt.setString(4, assignment.getFilePath());
            stmt.setInt(5, assignment.getCourseId());
            stmt.executeUpdate();
        } finally {
            if (connection != null)
                connection.close();
        }
    }

    /**
     * Deletes an assignment from the database.
     *
     * @param assignmentId the ID of the assignment to delete
     * @throws SQLException if a database access error occurs
     */
    public void deleteAssignment(int assignmentId) throws SQLException {
        Connection connection = null;
        try {
            connection = DatabaseConnection.getConnection();
            String query = "DELETE FROM Assignments WHERE assId = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, assignmentId);
            stmt.executeUpdate();
        } finally {
            if (connection != null)
                connection.close();
        }
    }
}
