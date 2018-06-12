package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    
    private static DataBase instance = new DataBase();
    public static DataBase getInstance(){
        return instance;
    }

    private DataBase() {
    }
    
    public Connection getConnection() throws SQLException,
            ClassNotFoundException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn =
                DriverManager.getConnection("jdbc:mysql://localhost/pplanches", "root", "");
        
        return conn;
    }
            
    
    
    
}
