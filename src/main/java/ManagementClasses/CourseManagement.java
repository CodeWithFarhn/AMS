package ManagementClasses;

import DAO.CourseDAO;
import EntityClasses.Course;
import EntityClasses.Assignment;
import java.sql.SQLException;
import java.util.List;

/**
 * Manages operations related to Courses.
 * Bridges the GUI and DAO layers for course management.
 */
public class CourseManagement {
    private CourseDAO courseDAO = new CourseDAO();

    /**
     * Adds a new course.
     *
     * @param courseID   the course ID
     * @param courseName the course name
     * @param teachId    the assigned teacher's ID
     * @throws SQLException if a database access error occurs
     */
    public void addNewCourse(int courseID, String courseName, int teachId) throws SQLException {
        Course newCourse = new Course(courseID, courseName, teachId);
        courseDAO.addNewCourse(newCourse);
    }

    /**
     * Updates an existing course.
     *
     * @param courseID   the course ID
     * @param courseName the new course name
     * @param teachID    the new assigned teacher's ID
     * @return true if successful
     * @throws SQLException if a database access error occurs
     */
    public boolean updateCourse(int courseID, String courseName, int teachID) throws SQLException {
        Course course = new Course(courseID, courseName, teachID);
        return courseDAO.updateCourse(course);
    }

    /**
     * Removes a course.
     *
     * @param courseId the ID of the course to remove
     * @return true if successful
     * @throws SQLException if a database access error occurs
     */
    public boolean removeCourse(int courseId) throws SQLException {
        return courseDAO.removeCourse(courseId);
    }

    /**
     * Retrieves courses registered by a student.
     *
     * @param studentId the student ID
     * @return a list of registered courses
     * @throws Exception if an error occurs
     */
    public List<Course> getRegisteredCourses(int studentId) throws Exception {
        return courseDAO.getRegisteredCourses(studentId);
    }

    /**
     * Retrieves courses taught by a teacher.
     *
     * @param TeacherId the teacher ID
     * @return a list of taught courses
     * @throws SQLException if a database access error occurs
     */
    public List<Course> getCoursesTeacher(int TeacherId) throws SQLException {
        return courseDAO.getCoursesByTeacher(TeacherId);
    }

    /**
     * Retrieves assignments for a specific course.
     *
     * @param course the Course object
     * @return a list of assignments
     * @throws SQLException if a database access error occurs
     */
    public List<Assignment> getAssignmentsForCourse(Course course) throws SQLException {
        return courseDAO.getAssignmentsForCourse(course.getCourseId());
    }
}
