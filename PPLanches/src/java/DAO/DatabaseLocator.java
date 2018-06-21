package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class DatabaseLocator {
    
    private static DatabaseLocator instance = new DatabaseLocator();
    public static DatabaseLocator getInstance(){
        return instance;
    }

    private DatabaseLocator() {
    }
    
    public Connection getConnection() throws SQLException,
            ClassNotFoundException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "");
        
        return conn;
    }
            
    
    
    
}
