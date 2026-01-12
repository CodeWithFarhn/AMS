package EntityClasses;

/**
 * Represents a Student's Submission for an Assignment.
 * Contains details such as submission date, file path, and assigned grade.
 */
public class Submission {
    private Integer submissionId;
    private int assignmentId;
    private int studentId;
    private String submissionDate;
    private String filePath;
    private String grade;

    /**
     * Constructs a new Submission with the specified details.
     *
     * @param submissionId   the unique identifier for the submission
     * @param assignmentId   the ID of the assignment being submitted
     * @param studentId      the ID of the student making the submission
     * @param submissionDate the date of submission
     * @param filePath       the path to the submitted file
     * @param grade          the grade assigned (can be null if not graded)
     */
    public Submission(Integer submissionId, int assignmentId, int studentId, String submissionDate, String filePath,
            String grade) {
        this.submissionId = submissionId;
        this.assignmentId = assignmentId;
        this.studentId = studentId;
        this.submissionDate = submissionDate;
        this.filePath = filePath;
        this.grade = grade;
    }

    /**
     * Gets the submission ID.
     * 
     * @return the submission ID
     */
    public int getSubmissionId() {
        return submissionId;
    }

    /**
     * Sets the submission ID.
     * 
     * @param submissionId the submission ID to set
     */
    public void setSubmissionId(int submissionId) {
        this.submissionId = submissionId;
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
    public void setAssignment(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    /**
     * Gets the student ID.
     * 
     * @return the student ID
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * Sets the student ID.
     * 
     * @param studentId the student ID to set
     */
    public void setStudent(int studentId) {
        this.studentId = studentId;
    }

    /**
     * Gets the submission date.
     * 
     * @return the submission date
     */
    public String getSubmissionDate() {
        return submissionDate;
    }

    /**
     * Sets the submission date.
     * 
     * @param submissionDate the submission date to set
     */
    public void setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
    }

    /**
     * Gets the file path of the submission.
     * 
     * @return the file path
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets the file path of the submission.
     * 
     * @param filePath the file path to set
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Gets the grade assigned to this submission.
     * 
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Sets the grade for this submission.
     * 
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }
}