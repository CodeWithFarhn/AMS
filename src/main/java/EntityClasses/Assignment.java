package EntityClasses;

/**
 * Represents an Assignment in the system.
 * Contains details such as title, description, deadline, and associated course.
 */
public class Assignment {
    private int assignmentId;
    private int courseId;
    private String title;
    private String description;
    private String deadline;
    private String filePath;

    /**
     * Constructs a new Assignment with the specified details.
     *
     * @param assignmentId the unique identifier for the assignment
     * @param courseId     the ID of the course this assignment belongs to
     * @param title        the title of the assignment
     * @param description  the description or instructions for the assignment
     * @param deadline     the submission deadline
     * @param filePath     the path to any attached file
     */
    public Assignment(int assignmentId, int courseId, String title, String description, String deadline,
            String filePath) {
        this.assignmentId = assignmentId;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.courseId = courseId;
        this.filePath = filePath;
    }

    /**
     * Gets the assignment ID.
     * 
     * @return the assignment ID
     */
    public int getAssignmentId() {
        return assignmentId;
    }

    /**
     * Sets the assignment ID.
     * 
     * @param assignmentId the assignment ID to set
     */
    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    /**
     * Gets the assignment title.
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the assignment title.
     * 
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the assignment description.
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the assignment description.
     * 
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the assignment deadline.
     * 
     * @return the deadline
     */
    public String getDeadline() {
        return deadline;
    }

    /**
     * Sets the assignment deadline.
     * 
     * @param deadline the deadline to set
     */
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    /**
     * Gets the course ID associated with this assignment.
     * 
     * @return the course ID
     */
    public int getCourseId() {
        return courseId;
    }

    /**
     * Sets the course ID associated with this assignment.
     * 
     * @param course the course ID to set
     */
    public void setCourseId(int course) {
        this.courseId = course;
    }

    /**
     * Gets the file path of the attachment.
     * 
     * @return the file path
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets the file path of the attachment.
     * 
     * @param filePath the file path to set
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}