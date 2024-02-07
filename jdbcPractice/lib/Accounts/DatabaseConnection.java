package jdbcPractice.lib.Accounts;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

public class DatabaseConnection {
    private static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306"; 

 private static final String USERNAME = "root"; 

private static final String PASSWORD = "root"; 

 

public static Connection getConnection() throws SQLException { 

// create a connection to database 

return DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD); 

 } 

} 
