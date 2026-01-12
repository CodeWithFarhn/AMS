package EntityClasses;

/**
 * Represents an Administrator user in the system.
 * Extends the User class with the ADMIN role.
 */
public class Admin extends User {

    /**
     * Constructs a new Admin with the specified details.
     *
     * @param userId   the unique identifier for the admin
     * @param username the username
     * @param password the hashed password
     * @param email    the email address
     */
    public Admin(int userId, String username, String password, String email) {
        super(userId, username, password, email, Role.ADMIN);
    }
}