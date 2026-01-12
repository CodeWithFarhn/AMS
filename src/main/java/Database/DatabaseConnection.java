package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatabaseConnection {
    // Using relative path. Assumes AMS.accdb is in the project root (working
    // directory).
    private static String URL;
    private static final Logger logger = LoggerFactory.getLogger(DatabaseConnection.class);

    static {
        try (java.io.InputStream input = DatabaseConnection.class.getClassLoader()
                .getResourceAsStream("application.properties")) {
            java.util.Properties prop = new java.util.Properties();
            if (input == null) {
                logger.warn("Sorry, unable to find application.properties. Using default database URL.");
                URL = "jdbc:ucanaccess://./AMS.accdb;newDatabaseVersion=V2010";
            } else {
                prop.load(input);
                URL = prop.getProperty("db.url");
            }
        } catch (java.io.IOException ex) {
            ex.printStackTrace();
            URL = "jdbc:ucanaccess://./AMS.accdb;newDatabaseVersion=V2010";
        }
    }

    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        // Ensure the path works regardless of how it's run, or fail gracefully
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL);
            }
        } catch (SQLException e) {
            System.err.println("Database Connection Failed! Ensure 'AMS.accdb' is in the project root.");
            throw e;
        }
        return connection;
    }

    public static void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
