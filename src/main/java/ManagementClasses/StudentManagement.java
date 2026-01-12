package ManagementClasses;

import EntityClasses.Student;
import DAO.StudentDAO;
import java.sql.SQLException;
import java.util.List;

/**
 * Manages operations related to Students.
 * Facade for StudentDAO.
 */
public class StudentManagement {
    private StudentDAO studentDAO = new StudentDAO();

    /**
     * Default constructor.
     */
    public StudentManagement() {
    }

    /**
     * Adds a new student.
     *
     * @param newStd the Student object to add
     * @throws SQLException if a database access error occurs
     */
    public void addStudent(Student newStd) throws SQLException {
        studentDAO.addStudent(newStd);
    }

    /**
     * Updates a student's information.
     *
     * @param student the Student object with updated details
     * @throws SQLException if a database access error occurs
     */
    public void updateStudent(Student student) throws SQLException {
        studentDAO.updateStudent(student);
    }

    /**
     * Updates a student's information (Overloaded).
     * Created for legacy support or convenience.
     *
     * @param stdId       the student ID
     * @param newUsername the new username
     * @param newPassword the new password
     * @param newEmail    the new email
     * @throws SQLException if a database access error occurs
     */
    public void updateStudent(int stdId, String newUsername, String newPassword, String newEmail) throws SQLException {
        Student student = new Student(stdId, newUsername, newPassword, newEmail, null);
        studentDAO.updateStudent(student);
    }

    /**
     * Deletes a student.
     *
     * @param stdId the ID of the student to remove
     * @throws SQLException if a database access error occurs
     */
    public void removeStudent(int stdId) throws SQLException {
        studentDAO.removeStudent(stdId);
    }

    /**
     * Retrieves all registered students.
     *
     * @return a list of Student objects
     * @throws SQLException if a database access error occurs
     */
    public List<Student> viewRegisteredStudents() throws SQLException {
        return studentDAO.getAllStudents();
    }

    /**
     * Retrieves the student ID associated with a user ID.
     *
     * @param userId the user ID
     * @return the student ID
     * @throws SQLException if a database access error occurs
     */
    public int getStudentIdByUserId(int userId) throws SQLException {
        return studentDAO.getStudentIdByUserId(userId);
    }
}
