package EntityClasses;

/**
 * Represents a Grade assigned to a submission.
 * This class maps a submission ID to a grade value.
 */
public class Grade {
    private int submissionId;
    private String grade;

    /**
     * Constructs a new Grade object.
     *
     * @param submissionID the ID of the submission being graded
     * @param grade        the grade value
     */
    public Grade(int submissionID, String grade) {
        this.submissionId = submissionID;
        this.grade = grade;
    }

    /**
     * Gets the submission ID.
     * 
     * @return the submission ID
     */
    public int getSubmissionID() {
        return submissionId;
    }

    /**
     * Sets the submission ID.
     * 
     * @param submissionId the submission ID to set
     */
    public void setSubmissionID(int submissionId) {
        this.submissionId = submissionId;
    }

    /**
     * Gets the grade value.
     * 
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Sets the grade value.
     * 
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }
}
