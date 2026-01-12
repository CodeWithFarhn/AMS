package ManagementClasses;

import EntityClasses.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Database.DatabaseConnection;
import EntityClasses.Course;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Security.PasswordUtil;

/**
 * Manages user authentication (login/logout).
 */
public class AuthenticationManagement {
    private static final Logger logger = LoggerFactory.getLogger(AuthenticationManagement.class);

    /**
     * Authenticates a user based on username, password, and role.
     *
     * @param username        the username
     * @param password        the raw password
     * @param roleName        the role name (Student, Teacher, Admin)
     * @param assignedCourses a list of courses (may be used for context, though
     *                        logic fetches from DB)
     * @return a User object if authentication is successful, null otherwise
     * @throws SQLException if a database access error occurs
     */
    public static User login(String username, String password, String roleName, List<Course> assignedCourses)
            throws SQLException {
        Connection conn = DatabaseConnection.getConnection();

        // Parse role to ensure validity
        EntityClasses.Role roleEnum;
        try {
            roleEnum = EntityClasses.Role.fromString(roleName);
        } catch (IllegalArgumentException e) {
            logger.warn("Invalid role selected: {}", roleName);
            return null;
        }

        String query = "SELECT userId, username, password, email FROM Users WHERE username = ? AND role = ?;";
        PreparedStatement prepStat = conn.prepareStatement(query);
        prepStat.setString(1, username);
        prepStat.setString(2, roleEnum.toString());
        ResultSet rs = prepStat.executeQuery();

        if (rs.next()) {
            String storedHash = rs.getString("password");

            // Verify Password
            if (!PasswordUtil.verifyPassword(password, storedHash)) {
                logger.warn("Invalid password for user: {}", username);
                return null;
            }

            int userId = rs.getInt("userId");
            String email = rs.getString("email");

            logger.info("User logged in successfully: {} ({})", username, roleEnum);

            switch (roleEnum) {
                case STUDENT:
                    StudentManagement stdManag = new StudentManagement();
                    int stdId = stdManag.getStudentIdByUserId(userId);
                    List<Course> registeredCourses = getCourses(stdId);
                    return new EntityClasses.Student(userId, username, password, email, registeredCourses);

                case TEACHER:
                    TeacherManagement teachManag = new TeacherManagement();
                    int teachId = teachManag.getTeacherIdByUserId(userId);
                    CourseManagement courseManag = new CourseManagement();
                    List<Course> assignedCourse = courseManag.getCoursesTeacher(teachId);
                    return new EntityClasses.Teacher(userId, username, password, email, assignedCourse);

                case ADMIN:
                    return new EntityClasses.Admin(userId, username, password, email);

                default:
                    logger.error("Role not implemented: {}", roleEnum);
                    return null;
            }
        } else {
            logger.warn("Invalid username, password, or role for user: {}", username);
        }
        return null;
    }

    /**
     * Logs out the current user.
     *
     * @param currentUser the current User object (set to null)
     */
    public static void logout(User currentUser) {
        currentUser = null;
        logger.info("User logged out successfully.");
    }

    /**
     * Helper method to fetch registered courses for a student during login.
     *
     * @param stdId the student ID
     * @return a list of registered courses
     */
    public static List<Course> getCourses(int stdId) {
        List<Course> courses = new ArrayList<>();
        try {
            CourseManagement coursemanag = new CourseManagement();
            courses = coursemanag.getRegisteredCourses(stdId);
        } catch (Exception e) {
            logger.error("Error getting student courses: {}", e.getMessage());
        }
        return courses;
    }
}