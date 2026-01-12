package EntityClasses;

import java.util.List;

/**
 * Represents a Teacher user in the system.
 * Extends the User class and includes a list of courses taught by the teacher.
 */
public class Teacher extends User {
    private List<Course> assignedCourses;

    /**
     * Default constructor.
     */
    public Teacher() {
    }

    /**
     * Constructs a new Teacher with the specified details.
     *
     * @param userId          the unique identifier for the teacher
     * @param username        the username
     * @param password        the hashed password
     * @param email           the email address
     * @param assignedCourses the list of courses assigned to the teacher
     */
    public Teacher(int userId, String username, String password, String email, List<Course> assignedCourses) {
        super(userId, username, password, email, Role.TEACHER);
        this.assignedCourses = assignedCourses;
    }

    /**
     * Gets the list of assigned courses.
     * 
     * @return a list of Course objects
     */
    public List<Course> getAssignedCourses() {
        return assignedCourses;
    }

    /**
     * Sets the list of assigned courses.
     * 
     * @param assignedCourses the list of courses to set
     */
    public void setAssignedCourses(List<Course> assignedCourses) {
        this.assignedCourses = assignedCourses;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "userId=" + getUserId() +
                ", username='" + getUsername() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}