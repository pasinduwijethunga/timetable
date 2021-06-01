package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
    
    public static Connection connect() {
        
        Connection conn = null;
        
        try {
           
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/institutedb","root","");
                      
        } 
        catch(Exception e) {
            
            System.out.println("Database not connect properly. Please check it before run the system.");
        
        }
                
        return conn;
        
    }
}
