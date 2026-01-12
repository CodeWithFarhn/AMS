package EntityClasses;

/**
 * Represents a Course in the system.
 * Contains information about the course name and the assigned teacher.
 */
public class Course {
    private int courseId;
    private String courseName;
    private int teachId;

    /**
     * Constructs a new Course with the specified details.
     *
     * @param courseId   the unique identifier for the course
     * @param courseName the name of the course
     * @param teachId    the ID of the teacher assigned to the course
     */
    public Course(int courseId, String courseName, int teachId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teachId = teachId;
    }

    /**
     * Gets the course ID.
     * 
     * @return the course ID
     */
    public int getCourseId() {
        return courseId;
    }

    /**
     * Sets the course ID.
     * 
     * @param courseId the course ID to set
     */
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    /**
     * Gets the course name.
     * 
     * @return the course name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Sets the course name.
     * 
     * @param courseName the course name to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Gets the ID of the assigned teacher.
     * 
     * @return the teacher ID
     */
    public int getTeachId() {
        return teachId;
    }

    /**
     * Sets the ID of the assigned teacher.
     * 
     * @param teachId the teacher ID to set
     */
    public void setTeachId(int teachId) {
        this.teachId = teachId;
    }

    @Override
    public String toString() {
        return courseName;
    }
}
