package Controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import DBConnection.DBConnect;
import Models.SubjectModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class SubjectController {

    Connection con = DBConnect.connect();;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public void loadSubjectCombo(JComboBox jComboBox) {

        try {

            String sql = "SELECT DISTINCT subjectCode FROM subject";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            jComboBox.removeAllItems();
            jComboBox.addItem("Select Subject Code");

            while(rs.next()) {

                jComboBox.addItem(rs.getString("subjectCode"));
                
            }
        } 
        
        catch(Exception e) {

            System.out.println("Subject Code not load correctly... " + e);

        }
    }
    
    public void loadOfferedYearCombo(JComboBox jComboBox) {

        try {

            jComboBox.removeAllItems();
            jComboBox.addItem("Select Offered Year");

            for(int i = 2000; i < 3000; i++) {

                jComboBox.addItem(String.valueOf(i));
                
            }
        } 
        
        catch(Exception e) {

            System.out.println("Offered Year not load correctly... " + e);

        }
    }
    
    public void loadOfferedSemesterCombo(JComboBox jComboBox) {

        try {

            jComboBox.removeAllItems();
            jComboBox.addItem("Select Offered Semester");
            jComboBox.addItem("1st Year 1st Semester");
            jComboBox.addItem("1st Year 2st Semester");
            jComboBox.addItem("2st Year 1st Semester");
            jComboBox.addItem("2st Year 2st Semester");
            jComboBox.addItem("3st Year 1st Semester");
            jComboBox.addItem("3st Year 2st Semester");
            jComboBox.addItem("4st Year 1st Semester");
            jComboBox.addItem("4st Year 2st Semester");
            
        } 
        
        catch(Exception e) {

            System.out.println("Offered Semester not load correctly... " + e);

        }
    }
    
    public void loadSubjectTable(JTable jTable) {

        try {
            
            int count = 0;
            
            String sql1 = "SELECT COUNT(subjectCode) AS count FROM subject";
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();

            while(rs.next()) {
            
                count = Integer.parseInt(rs.getString("count"));
                                
            }
            
            String DataArray[][] = new String[count][9];
            
            String sql2 = "SELECT subjectCode, subjectName, offeredYear, offeredSemester, noOfLecHours, noOfTutHours, noOfLabHours, noOfEvaHours FROM subject";
            pst = con.prepareStatement(sql2);
            rs = pst.executeQuery();
            
            int i = 0;
            
            while(rs.next()) {
               
                DataArray[i][0] = String.valueOf(i + 1);
                DataArray[i][1] = rs.getString("subjectCode");
                DataArray[i][2] = rs.getString("subjectName");
                DataArray[i][3] = rs.getString("offeredYear");
                DataArray[i][4] = rs.getString("offeredSemester");
                DataArray[i][5] = rs.getString("noOfLecHours");
                DataArray[i][6] = rs.getString("noOfTutHours");
                DataArray[i][7] = rs.getString("noOfLabHours");
                DataArray[i][8] = rs.getString("noOfEvaHours");
                
                i++;
                
            }
            
            String col[] = {"#", "Subject Code", "Subject Name", "Offered Year", "Offered Semester", "No of Lec Hours", "No of Tut Hours", "No of Lab Hours", "No of Eva Hours"};

            DefaultTableModel model = new DefaultTableModel(DataArray, col) {

                public boolean isCellEditable(int x, int y) {

                    return false;

                }
            };

            jTable.setModel(model);

            TableColumn no = jTable.getColumnModel().getColumn(0);
            no.setMaxWidth(50);
            no.setMinWidth(50);
            
            jTable.getColumnModel().getColumn(1);
            jTable.getColumnModel().getColumn(2);
            jTable.getColumnModel().getColumn(3);
            jTable.getColumnModel().getColumn(4);
            jTable.getColumnModel().getColumn(5);
            jTable.getColumnModel().getColumn(6);
            jTable.getColumnModel().getColumn(7);
            jTable.getColumnModel().getColumn(8);
            
        } 
        
        catch(Exception e) {
            
            System.out.println("Subject Information not load correctly... " + e);
            
        }        
    }
    
    public String[] getSubjectInfromationforUpdate(String subjectCode) {

        String subjectArray[] = new String[7];
        
        try {
              
            String sql = "SELECT subjectName, offeredYear, offeredSemester, noOfLecHours, noOfTutHours, noOfLabHours, noOfEvaHours FROM subject WHERE subjectCode = '" + subjectCode + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()) {
           
                subjectArray[0] = rs.getString("subjectName");
                subjectArray[1] = rs.getString("offeredYear");
                subjectArray[2] = rs.getString("offeredSemester");
                subjectArray[3] = rs.getString("noOfLecHours");
                subjectArray[4] = rs.getString("noOfTutHours");
                subjectArray[5] = rs.getString("noOfLabHours");
                subjectArray[6] = rs.getString("noOfEvaHours");
                
            }
        } 
        
        catch(Exception e) {
            
            subjectArray = null;
            System.out.println("Subject Information not load correctly... " + e);
            
        }       
        
        return subjectArray;
        
    }
       
    public String[] insertSubject(SubjectModel subjectModel) {
    
        String message[] = new String[2];
        boolean success = false;
        
        try {
            
            String sql = "INSERT INTO subject(subjectCode, subjectName, offeredYear, offeredSemester, noOfLecHours, noOfTutHours, noOfLabHours, noOfEvaHours) VALUES('" + subjectModel.getSubjectCode() + "', '" + subjectModel.getSubjectName() + "', '" + subjectModel.getOfferedYear() + "', '" + subjectModel.getOfferedSemester() + "', '" + subjectModel.getNoOfLecHours() + "', '" + subjectModel.getNoOfTutHours() + "','" + subjectModel.getNoOfLabHours() + "', '" + subjectModel.getNoOfEveHours() + "')";
            pst = con.prepareStatement(sql);
            pst.execute();
             
            success = true;
            
        } 
        
        catch(Exception e) {
        
            success = false;
            System.out.println("Can't save subject details proparly... " + e);
            
        }
               
        if(success) {
        
            message[1] = "Subject details insert successfully.";
                
        }
        
        else {
        
            message[0] = "Subject details insert fail.";
            message[1] = "Please check details and try again.";
                
        }
        
        return message;
        
    }

    public String[] updateSubject(SubjectModel subjectModel) {
    
        String message[] = new String[2];
        boolean success = false;
        
        try {
            
            String sql = "UPDATE subject SET subjectName = '" + subjectModel.getSubjectName() + "', offeredYear = '" + subjectModel.getOfferedYear() + "', offeredSemester = '" + subjectModel.getOfferedSemester() + "', noOfLecHours = '" + subjectModel.getNoOfLecHours() + "', noOfTutHours = '" + subjectModel.getNoOfTutHours() + "', noOfLabHours = '" + subjectModel.getNoOfLabHours() + "', noOfEvaHours = '" + subjectModel.getNoOfEveHours() + "' WHERE subjectCode = '" + subjectModel.getSubjectCode() + "'";
            pst = con.prepareStatement(sql);
            pst.execute();
                 
            success = true;
            
        } 
        
        catch(Exception e) {
        
            success = false;
            System.out.println("Can't update subject details proparly... " + e);
            
        }
                        
        if(success) {
        
            message[1] = "Subject details edit successfully.";
                
        }
        
        else {
        
            message[0] = "Subject details edit fail.";
            message[1] = "Please check details and try again.";
                
        }
        
        return message;
        
    }
    
    public String[] deleteSubject(String subjectCode) {
    
        String message[] = new String[2];
        boolean success = false;
        
        try {
            
            String sql = "DELETE FROM subject WHERE subjectCode = '" + subjectCode + "'";
            pst = con.prepareStatement(sql);
            pst.execute();
                  
            success = true;
            
        } 
        
        catch(Exception e) {
        
            success = false;
            System.out.println("Can't delete subject details proparly... " + e);
            
        }
                        
        if(success) {
        
            message[1] = "Subject details remove successfully.";
                
        }
        
        else {
        
            message[0] = "Subject remove fail.";
            message[1] = "Please check details and try again.";
                
        }
        
        return message;
        
    }
}
