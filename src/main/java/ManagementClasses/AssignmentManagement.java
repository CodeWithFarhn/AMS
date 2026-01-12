package ManagementClasses;

import DAO.AssignmentDAO;
import EntityClasses.Assignment;
import java.sql.SQLException;

/**
 * Manages operations related to Assignments.
 * Interfaces with the AssignmentDAO.
 */
public class AssignmentManagement {
    private AssignmentDAO assignmentDAO = new AssignmentDAO();

    /**
     * Adds a new assignment.
     *
     * @param assignment the Assignment object to add
     * @throws SQLException if a database access error occurs
     */
    public void addAssignment(Assignment assignment) throws SQLException {
        assignmentDAO.addAssignment(assignment);
    }

    /**
     * Deletes an assignment uploaded by Teacher.
     *
     * @param assignmentId the ID of the assignment to delete
     * @throws SQLException if a database access error occurs
     */
    public void deleteAssignment(int assignmentId) throws SQLException {
        assignmentDAO.deleteAssignment(assignmentId);
    }
}
