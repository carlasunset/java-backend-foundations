package Section20_JDBC_Database_Access.first_connection.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    // Static connection shared by the application
    // It avoids creating multiple connections unnecessarily

    private static Connection connection = null;

    /**
     * Returns a database connection.
     * If the connection does not exist yet, it creates a new one.
     * This is an example of lazy initialization.
     */

    public static Connection getConnection(){
        if (connection == null){
            try{
                Properties properties = loadProperties(); // Load database properties from db.properties file
                String url = properties.getProperty("dburl"); // Get database URL from properties
                connection = DriverManager.getConnection(url, properties); // Create the connection using DriverManager
            } catch (SQLException e){
                // Wrap checked SQLException into a runtime exception
                throw new DbException(e.getMessage());
            }
        }
        return connection;
    }

    /**
     * Closes the database connection if it is open.
     * This method should be called when the application finishes using the database.
     */

    public static void closeConnection(){
        try {
            if (connection != null) {
                connection.close();
            }

        } catch (SQLException e) {
            // Convert SQL exception into application-specific exception
            throw new DbException(e.getMessage());
        }
    }

    /**
     * Loads database configuration from the db.properties file.
     * This method isolates file reading logic from the connection logic.
     */

    private static Properties loadProperties(){
        // Try-with-resources ensures the FileInputStream is closed automatically
        try(FileInputStream fileInputStream = new FileInputStream("src/resources/db.properties")){
            Properties properties = new Properties();
            properties.load(fileInputStream);
            return properties;

        } catch (IOException e){
            // IOException is converted into a runtime exception
            throw new DbException(e.getMessage());
        }
    }

}
