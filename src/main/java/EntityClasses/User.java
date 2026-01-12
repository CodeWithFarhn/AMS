package EntityClasses;

/**
 * Represents a generic user in the system.
 * Serves as the base class for specific user roles like Student, Teacher, and
 * Admin.
 */
public class User {
    private int userId;
    private String username;
    private String password;
    private String email;
    private Role role;
    private static User currentUser;

    /**
     * Default constructor.
     */
    public User() {
    }

    /**
     * Constructs a new User with the specified details.
     *
     * @param userId   the unique identifier for the user
     * @param username the username for login
     * @param password the hashed password
     * @param email    the user's email address
     * @param role     the role associated with the user (ADMIN, TEACHER, STUDENT)
     */
    public User(int userId, String username, String password, String email, Role role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    /**
     * Gets the user ID.
     * 
     * @return the user ID
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the user ID.
     * 
     * @param userId the user ID to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Gets the username.
     * 
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username.
     * 
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the password.
     * 
     * @return the hashed password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     * 
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the email.
     * 
     * @return the email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     * 
     * @param email the email address to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the user's role.
     * 
     * @return the role
     */
    public Role getRole() {
        return role;
    }

    /**
     * Sets the user's role.
     * 
     * @param role the role to set
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * Gets the currently logged-in user.
     * 
     * @return the current User object
     */
    public static User getCurrentUser() {
        return currentUser;
    }

    /**
     * Sets the currently logged-in user.
     * 
     * @param user the User object to set as current
     */
    public static void setCurrentUser(User user) {
        currentUser = user;
    }
}
