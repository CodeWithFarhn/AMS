package EntityClasses;

/**
 * Enumeration representing the different roles a user can have in the system.
 */
public enum Role {
    /** Role for students. */
    STUDENT("Student"),
    /** Role for teachers. */
    TEACHER("Teacher"),
    /** Role for administrators. */
    ADMIN("Admin");

    private final String displayName;

    /**
     * Constructs a Role with a display name.
     * 
     * @param displayName the name to display in UI
     */
    Role(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Gets the display name of the role.
     * 
     * @return the display name
     */
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }

    /**
     * Helper method to find a Role by its display name or constant name.
     *
     * @param text the text to search for
     * @return the matching Role
     * @throws IllegalArgumentException if no matching role is found
     */
    public static Role fromString(String text) {
        for (Role role : Role.values()) {
            if (role.displayName.equalsIgnoreCase(text) || role.name().equalsIgnoreCase(text)) {
                return role;
            }
        }
        throw new IllegalArgumentException("No constant with text " + text + " found");
    }
}
