package DAO;

import Database.DatabaseConnection;
import EntityClasses.Submission;
import EntityClasses.Grade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object for handling Submission-related database operations.
 */
public class SubmissionDAO {

    /**
     * Adds a new submission to the database.
     *
     * @param submission the Submission object to add
     * @throws SQLException if a database access error occurs
     */
    public void addSubmission(Submission submission) throws SQLException {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "INSERT INTO Submissions (assId, stdId, subDate, subfilepath) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, submission.getAssignmentId());
            stmt.setInt(2, submission.getStudentId());
            stmt.setString(3, submission.getSubmissionDate());
            stmt.setString(4, submission.getFilePath());
            stmt.executeUpdate();
        }
    }

    /**
     * Deletes a submission from the database.
     *
     * @param submissionId the ID of the submission to delete
     * @throws SQLException if a database access error occurs
     */
    public void deleteSubmission(int submissionId) throws SQLException {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "DELETE FROM Submissions WHERE subId = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, submissionId);
            stmt.executeUpdate();
        }
    }

    /**
     * Retrieves the grade for a specific submission.
     *
     * @param submissionId the ID of the submission
     * @return a Grade object if found, or null
     * @throws SQLException if a database access error occurs
     */
    public Grade getGrade(int submissionId) throws SQLException {
        Grade grade = null;
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "SELECT * FROM Submissions WHERE subId = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, submissionId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String gradeValue = rs.getString("grade");
                grade = new Grade(submissionId, gradeValue);
            }
        }
        return grade;
    }

    /**
     * Updates the grade for a specific submission.
     *
     * @param submissionId the ID of the submission
     * @param grade        the grade value to set
     * @throws SQLException if a database access error occurs
     */
    public void updateGrade(int submissionId, String grade) throws SQLException {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "UPDATE Submissions SET grade = ? WHERE subId = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, grade);
            stmt.setInt(2, submissionId);
            stmt.executeUpdate();
        }
    }

    /**
     * Retrieves all submissions made by a specific student.
     *
     * @param studentId the ID of the student
     * @return a list of Submission objects
     * @throws SQLException if a database access error occurs
     */
    public List<Submission> getSubmissionsByStudent(int studentId) throws SQLException {
        List<Submission> submissions = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "SELECT * FROM Submissions sub WHERE sub.stdId = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, studentId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int submissionID = rs.getInt("subId");
                int assignmentID = rs.getInt("assId");
                String submissionDate = rs.getString("subDate");
                String filePath = rs.getString("subfilepath");
                String grade = rs.getString("grade");
                Submission submission = new Submission(submissionID, assignmentID, studentId, submissionDate, filePath,
                        grade);
                submissions.add(submission);
            }
        }
        return submissions;
    }

    /**
     * Retrieves all submissions for a specific assignment.
     *
     * @param assignmentId the ID of the assignment
     * @return a list of Submission objects
     * @throws SQLException if a database access error occurs
     */
    public List<Submission> getSubmissionsByAssignment(int assignmentId) throws SQLException {
        List<Submission> submissions = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "SELECT * FROM Submissions WHERE assId = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, assignmentId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int submissionId = rs.getInt("subId");
                int studentID = rs.getInt("stdId");
                String submissionDate = rs.getString("subDate");
                String grade = rs.getString("grade");
                String filePath = rs.getString("subfilepath");
                Submission submission = new Submission(submissionId, assignmentId, studentID, submissionDate, filePath,
                        grade);
                submissions.add(submission);
            }
        }
        return submissions;
    }
}
