package EntityClasses;

import java.util.List;

/**
 * Represents a Student user in the system.
 * Extends the User class and includes a list of registered courses.
 */
public class Student extends User {
    private List<Course> registeredCourses;

    /**
     * Default constructor.
     */
    public Student() {
    }

    /**
     * Constructs a new Student with the specified details.
     *
     * @param userId            the unique identifier for the student
     * @param username          the username
     * @param password          the hashed password
     * @param email             the email address
     * @param registeredCourses the list of courses the student is registered for
     */
    public Student(int userId, String username, String password, String email, List<Course> registeredCourses) {
        super(userId, username, password, email, Role.STUDENT);
        this.registeredCourses = registeredCourses;
    }

    /**
     * Gets the list of registered courses.
     * 
     * @return a list of Course objects
     */
    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    /**
     * Sets the list of registered courses.
     * 
     * @param registeredCourses the list of courses to set
     */
    public void setRegisteredCourses(List<Course> registeredCourses) {
        this.registeredCourses = registeredCourses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "userId=" + getUserId() +
                ", username='" + getUsername() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}
