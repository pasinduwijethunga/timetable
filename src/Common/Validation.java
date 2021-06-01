package Common;

import DBConnection.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validation {

    Connection con = DBConnect.connect();;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public boolean validateEmpty(String value, String text) {
    
        boolean valid = false;
        
        if((value == null) || (value.isEmpty()) || (value.equals(text))) {
        
            valid = false;
            
        }
        
        else {
        
            valid = true;
            
        }
        
        return valid;
                
    }
}