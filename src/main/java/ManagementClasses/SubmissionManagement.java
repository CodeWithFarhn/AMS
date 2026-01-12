package ManagementClasses;

import EntityClasses.Submission;
import EntityClasses.Grade;
import java.sql.SQLException;
import java.util.List;

/**
 * Manages operations related to Submissions.
 * Facade for SubmissionDAO.
 */
public class SubmissionManagement {
    private DAO.SubmissionDAO submissionDAO = new DAO.SubmissionDAO();

    /**
     * Submits a new assignment.
     *
     * @param submission the Submission object to add
     * @throws SQLException if a database access error occurs
     */
    public void submitAssignment(Submission submission) throws SQLException {
        submissionDAO.addSubmission(submission);
    }

    /**
     * Deletes a submission.
     *
     * @param submissionId the ID of the submission to delete
     * @throws SQLException if a database access error occurs
     */
    public void deleteSubmission(int submissionId) throws SQLException {
        submissionDAO.deleteSubmission(submissionId);
    }

    /**
     * Retrieves the grade for a submission.
     *
     * @param submissionId the ID of the submission
     * @return the Grade object
     * @throws SQLException if a database access error occurs
     */
    public Grade getGrade(int submissionId) throws SQLException {
        return submissionDAO.getGrade(submissionId);
    }

    /**
     * Grades a submission.
     *
     * @param submissionId the ID of the submission
     * @param grade        the grade to assign
     * @throws SQLException if a database access error occurs
     */
    public void gradeSubmission(int submissionId, String grade) throws SQLException {
        submissionDAO.updateGrade(submissionId, grade);
    }

    /**
     * Retrieves submissions by a specific student.
     *
     * @param studentId the student ID
     * @return a list of Submission objects
     * @throws SQLException if a database access error occurs
     */
    public List<Submission> getSubmissionsByStudent(int studentId) throws SQLException {
        return submissionDAO.getSubmissionsByStudent(studentId);
    }

    /**
     * Retrieves all student submissions for a specific assignment (for teachers).
     *
     * @param assignmentId the assignment ID
     * @return a list of Submission objects
     * @throws SQLException if a database access error occurs
     */
    public List<Submission> getStudentSubmissions(int assignmentId) throws SQLException {
        return submissionDAO.getSubmissionsByAssignment(assignmentId);
    }
}
