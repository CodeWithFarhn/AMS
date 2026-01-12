package ManagementClasses;

import DAO.TeacherDAO;
import EntityClasses.Teacher;
import EntityClasses.User;
import java.sql.SQLException;
import java.util.List;

/**
 * Manages operations related to Teachers.
 * Facade for TeacherDAO.
 */
public class TeacherManagement {
    private TeacherDAO teacherDAO = new TeacherDAO();

    /**
     * Default constructor.
     */
    public TeacherManagement() {
    }

    /**
     * Adds a new teacher.
     *
     * @param newTeacher the Teacher object to add
     * @throws SQLException if a database access error occurs
     */
    public void addTeacher(Teacher newTeacher) throws SQLException {
        teacherDAO.addTeacher(newTeacher);
    }

    /**
     * Updates a teacher's information.
     *
     * @param teacher the Teacher object with updated details
     * @throws SQLException if a database access error occurs
     */
    public void updateTeacher(Teacher teacher) throws SQLException {
        teacherDAO.updateTeacher(teacher);
    }

    /**
     * Removes a teacher.
     *
     * @param teacherId the ID of the teacher to remove
     * @throws SQLException if a database access error occurs
     */
    public void removeTeacher(int teacherId) throws SQLException {
        teacherDAO.removeTeacher(teacherId);
    }

    /**
     * Retrieves all teachers.
     *
     * @return a list of User objects representing teachers
     * @throws SQLException if a database access error occurs
     */
    public List<User> getTeachers() throws SQLException {
        return teacherDAO.getAllTeachers();
    }

    /**
     * Retrieves the teacher ID associated with a user ID.
     *
     * @param userId the user ID
     * @return the teacher ID
     * @throws SQLException if a database access error occurs
     */
    public int getTeacherIdByUserId(int userId) throws SQLException {
        return teacherDAO.getTeacherIdByUserId(userId);
    }
}
