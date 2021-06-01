package Controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import DBConnection.DBConnect;
import Models.LecturerModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class LectureController {

    Connection con = DBConnect.connect();;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public void loadLecturerCombo(JComboBox jComboBox) {

        try {

            String sql = "SELECT DISTINCT lecturerId FROM lecturer";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            jComboBox.removeAllItems();
            jComboBox.addItem("Select Lecturer ID");

            while(rs.next()) {

                jComboBox.addItem(rs.getString("lecturerId"));
                
            }
        } 
        
        catch(Exception e) {

            System.out.println("Lecturer Id not load correctly... " + e);

        }
    }
    
    public void loadFacultyCombo(JComboBox jComboBox) {

        try {

            String sql = "SELECT DISTINCT facultyName FROM faculty";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            jComboBox.removeAllItems();
            jComboBox.addItem("Select Faculty");

            while(rs.next()) {

                jComboBox.addItem(rs.getString("facultyName"));
                
            }
        } 
        
        catch(Exception e) {

            System.out.println("Faculty not load correctly... " + e);

        }
    }
    
    public void loadBuildingCombo(JComboBox jComboBox) {

        try {

            String sql = "SELECT DISTINCT buildingName FROM building";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            jComboBox.removeAllItems();
            jComboBox.addItem("Select Building");

            while(rs.next()) {

                jComboBox.addItem(rs.getString("buildingName"));
                
            }
        } 
        
        catch(Exception e) {

            System.out.println("Building not load correctly... " + e);

        }
    }
    
    public void loadCenterCombo(JComboBox jComboBox) {

        try {

            String sql = "SELECT DISTINCT centerName FROM center";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            jComboBox.removeAllItems();
            jComboBox.addItem("Select Center");

            while(rs.next()) {

                jComboBox.addItem(rs.getString("centerName"));
                
            }
        } 
        
        catch(Exception e) {

            System.out.println("Center not load correctly... " + e);

        }
    }
    
    public void loadDepartmentCombo(JComboBox jComboBox, String faculty) {
        
        try {

            String sql = "SELECT DISTINCT D.departmentName FROM department D, faculty F WHERE F.facultyName = '" + faculty + "' AND D.faculty = F.facultyId";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            jComboBox.removeAllItems();
            jComboBox.addItem("Select Department");

            while(rs.next()) {

                jComboBox.addItem(rs.getString("departmentName"));

            }
        } 
        
        catch(Exception e) {

            System.out.println("Department not load correctly... " + e);
            
        }
    }
    
    public void loadCategoryCombo(JComboBox jComboBox) {

        try {

            String sql = "SELECT DISTINCT categoryName FROM category";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            jComboBox.removeAllItems();
            jComboBox.addItem("Select Category");

            while(rs.next()) {

                jComboBox.addItem(rs.getString("categoryName"));
                
            }
        } 
        
        catch(Exception e) {

            System.out.println("Category not load correctly... " + e);

        }
    }
    
    public void loadLevelCombo(JComboBox jComboBox) {

        try {

            String sql = "SELECT DISTINCT levelName FROM level";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            jComboBox.removeAllItems();
            jComboBox.addItem("Select Level");

            while(rs.next()) {

                jComboBox.addItem(rs.getString("levelName"));
                
            }
        } 
        
        catch(Exception e) {

            System.out.println("Level not load correctly... " + e);

        }
    }
        
    public void loadLecturerTable(JTable jTable) {

        try {
            
            int count = 0;
            
            String sql1 = "SELECT COUNT(lecturerId) AS count FROM lecturer";
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();

            while(rs.next()) {
            
                count = Integer.parseInt(rs.getString("count"));
                                
            }
            
            String DataArray[][] = new String[count][10];
            
            String sql2 = "SELECT L.lecturerId, L.name, F.facultyName, B.buildingName, C.centerName, D.departmentName, CA.categoryName, LE.levelName, L.rank "
                    + "FROM lecturer L, faculty F, building B, center C, department D, category CA, level LE "
                    + "WHERE L.faculty = F.facultyId AND L.building = B.buildingId AND L.center = C.centerId AND L.department = D.departmentId AND L.category = CA.categoryId AND L.level = LE.level";
            pst = con.prepareStatement(sql2);
            rs = pst.executeQuery();
            
            int i = 0;
            
            while(rs.next()) {
               
                DataArray[i][0] = String.valueOf(i + 1);
                DataArray[i][1] = rs.getString("lecturerId");
                DataArray[i][2] = rs.getString("name");
                DataArray[i][3] = rs.getString("facultyName");
                DataArray[i][4] = rs.getString("buildingName");
                DataArray[i][5] = rs.getString("centerName");
                DataArray[i][6] = rs.getString("departmentName");
                DataArray[i][7] = rs.getString("categoryName");
                DataArray[i][8] = rs.getString("levelName");
                DataArray[i][9] = rs.getString("rank");
                
                i++;
                
            }
            
            String col[] = {"#", "Lecturer Id", "Name", "Faculty", "Building", "Center", "Department", "Category", "Level", "Rank"};

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
            jTable.getColumnModel().getColumn(9);
            
        } 
        
        catch(Exception e) {
            
            System.out.println("Lecturer Information not load correctly... " + e);
            
        }        
    }
    
    public String[] getLecturerInfromationforUpdate(String lecturerId) {

        String lecturerArray[] = new String[8];
        
        try {
              
            String sql = "SELECT L.name, F.facultyName, B.buildingName, C.centerName, D.departmentName, CA.categoryName, LE.levelName, L.rank "
                    + "FROM lecturer L, faculty F, building B, center C, department D, category CA, level LE "
                    + "WHERE L.faculty = F.facultyId AND L.building = B.buildingId AND L.center = C.centerId AND L.department = D.departmentId AND L.category = CA.categoryId AND L.level = LE.level AND lecturerId = '" + lecturerId + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()) {
           
                lecturerArray[0] = rs.getString("name");
                lecturerArray[1] = rs.getString("facultyName");
                lecturerArray[2] = rs.getString("buildingName");
                lecturerArray[3] = rs.getString("centerName");
                lecturerArray[4] = rs.getString("departmentName");
                lecturerArray[5] = rs.getString("categoryName");
                lecturerArray[6] = rs.getString("levelName");
                lecturerArray[7] = rs.getString("rank");
                
            }
        } 
        
        catch(Exception e) {
            
            lecturerArray = null;
            System.out.println("Lecturer Information not load correctly... " + e);
            
        }       
        
        return lecturerArray;
        
    }
       
    public String[] insertLecturer(LecturerModel lecturerModel) {
    
        String message[] = new String[2];
        boolean success = false;
        
        try {
            
            String faculty = "";
            String building = "";
            String center = "";
            String department = "";
            String category = "";
            int level = -1;
            
            String sql1 = "SELECT F.facultyId, B.buildingId, C.centerId, D.departmentId, CA.categoryId, LE.level "
                    + "FROM faculty F, building B, center C, department D, category CA, level LE "
                    + "WHERE F.facultyName = '" + lecturerModel.getFaculty() + "' AND B.buildingName = '" + lecturerModel.getBulding() + "' AND C.centerName = '" + lecturerModel.getCenter() + "' AND D.departmentName = '" + lecturerModel.getDepartment() + "' AND CA.categoryName = '" + lecturerModel.getCategory() + "' AND LE.levelName = '" + lecturerModel.getLevel() + "'";
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();
                        
            while(rs.next()) {
               
                faculty = rs.getString("facultyId");
                building = rs.getString("buildingId");
                center = rs.getString("centerId");
                department = rs.getString("departmentId");
                category = rs.getString("categoryId");
                level = Integer.parseInt(rs.getString("level"));
                                
            }
            
            String sql2 = "INSERT INTO lecturer(lecturerId, name, faculty, building, center, department, category, level, rank) "
                    + "VALUES('" + lecturerModel.getLecturerId() + "', '" + lecturerModel.getName() + "', '" + faculty + "', '" + building + "', '" + center + "', '" + department + "','" + category + "', '" + level + "', '" + lecturerModel.getRank() + "')";
            pst = con.prepareStatement(sql2);
            pst.execute();
             
            success = true;
            
        } 
        
        catch(Exception e) {
        
            success = false;
            System.out.println("Can't save lecturer details proparly... " + e);
            
        }
               
        if(success) {
        
            message[1] = "Lecturer details insert successfully.";
                
        }
        
        else {
        
            message[0] = "Lecturer details insert fail.";
            message[1] = "Please check details and try again.";
                
        }
        
        return message;
        
    }

    public String[] updateLecturer(LecturerModel lecturerModel) {
    
        String message[] = new String[2];
        boolean success = false;
        
        try {
            
            String faculty = "";
            String building = "";
            String center = "";
            String department = "";
            String category = "";
            int level = -1;
            
            String sql1 = "SELECT F.facultyId, B.buildingId, C.centerId, D.departmentId, CA.categoryId, LE.level "
                    + "FROM faculty F, building B, center C, department D, category CA, level LE "
                    + "WHERE F.facultyName = '" + lecturerModel.getFaculty() + "' AND B.buildingName = '" + lecturerModel.getBulding() + "' AND C.centerName = '" + lecturerModel.getCenter() + "' AND D.departmentName = '" + lecturerModel.getDepartment() + "' AND CA.categoryName = '" + lecturerModel.getCategory() + "' AND LE.levelName = '" + lecturerModel.getLevel() + "'";
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();
                        
            while(rs.next()) {
               
                faculty = rs.getString("facultyId");
                building = rs.getString("buildingId");
                center = rs.getString("centerId");
                department = rs.getString("departmentId");
                category = rs.getString("categoryId");
                level = Integer.parseInt(rs.getString("level"));
                                
            }
            
            String sql2 = "UPDATE lecturer "
                    + "SET name = '" + lecturerModel.getName() + "', faculty = '" + faculty + "', building = '" + building + "', center = '" + center + "', department = '" + department + "', category = '" + category + "', level = '" + level + "', rank = '" + lecturerModel.getRank() + "' "
                    + "WHERE lecturerId = '" + lecturerModel.getLecturerId() + "'";
            pst = con.prepareStatement(sql2);
            pst.execute();
                 
            success = true;
            
        } 
        
        catch(Exception e) {
        
            success = false;
            System.out.println("Can't update lecturer details proparly... " + e);
            
        }
                        
        if(success) {
        
            message[1] = "Lecturer details edit successfully.";
                
        }
        
        else {
        
            message[0] = "Lecturer details edit fail.";
            message[1] = "Please check details and try again.";
                
        }
        
        return message;
        
    }
    
    public String[] deleteLecturer(String lecturerId) {
    
        String message[] = new String[2];
        boolean success = false;
        
        try {
            
            String sql = "DELETE FROM lecturer WHERE lecturerId = '" + lecturerId + "'";
            pst = con.prepareStatement(sql);
            pst.execute();
                  
            success = true;
            
        } 
        
        catch(Exception e) {
        
            success = false;
            System.out.println("Can't delete lecturer details proparly... " + e);
            
        }
                        
        if(success) {
        
            message[1] = "Lecturer details remove successfully.";
                
        }
        
        else {
        
            message[0] = "Lecturer remove fail.";
            message[1] = "Please check details and try again.";
                
        }
        
        return message;
        
    }
}
