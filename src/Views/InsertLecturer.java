package Views;

import Common.Validation;
import Controllers.LectureController;
import Models.LecturerModel;
import java.awt.Color;

public class InsertLecturer extends javax.swing.JInternalFrame {

    LectureController lecturerController = new LectureController();
    LecturerModel lecturerModel = new LecturerModel();
    Validation validation = new Validation();
    
    int pageType = 0;
       
    String lecturerId;
    String name;
    String faculty;
    String building;
    String center;
    String department;
    String category;
    String level;
    String rank;
    
    public InsertLecturer() {
        
        initComponents();
                
    }
    
    public InsertLecturer(int pageType) {
        
        this.pageType = pageType;
        
        initComponents();
        
        initializePage(pageType);
        
    }
    
    public void initializePage(int pageType) {
        
        switch(pageType) {
            
            case 0:
                lecturerIdComboBox.setVisible(false);
                lecturerIdTextField.setVisible(true);
                facultyTextField.setVisible(false);
                buildingTextField.setVisible(false);
                centerTextField.setVisible(false);
                departmentTextField.setVisible(false);
                categoryTextField.setVisible(false);
                facultyComboBox.setVisible(true);
                buildingComboBox.setVisible(true);
                centerComboBox.setVisible(true);
                departmentComboBox.setVisible(true);
                categoryComboBox.setVisible(true);
                levelComboBox.setVisible(true);
                
                nameTextField.setEditable(true);
                rankTextField.setEditable(true);
                
                titleLabel.setText("     Insert Lecturer Details");
                insertButton.setText("Insert");
                break;
                
            case 1:
                lecturerIdComboBox.setVisible(true);
                lecturerIdTextField.setVisible(false);
                facultyTextField.setVisible(false);
                buildingTextField.setVisible(false);
                centerTextField.setVisible(false);
                departmentTextField.setVisible(false);
                categoryTextField.setVisible(false);
                facultyComboBox.setVisible(true);
                buildingComboBox.setVisible(true);
                centerComboBox.setVisible(true);
                departmentComboBox.setVisible(true);
                categoryComboBox.setVisible(true);
                levelComboBox.setVisible(true);
                
                nameTextField.setEditable(true);
                rankTextField.setEditable(true);
                
                titleLabel.setText("     Edit Lecturer Details");
                insertButton.setText("Edit");
                break;
                
            default:
                lecturerIdComboBox.setVisible(true);
                lecturerIdTextField.setVisible(false);
                facultyTextField.setVisible(true);
                buildingTextField.setVisible(true);
                centerTextField.setVisible(true);
                departmentTextField.setVisible(true);
                categoryTextField.setVisible(true);
                facultyComboBox.setVisible(false);
                buildingComboBox.setVisible(false);
                centerComboBox.setVisible(false);
                departmentComboBox.setVisible(false);
                categoryComboBox.setVisible(false);
                levelComboBox.setVisible(false);
                
                nameTextField.setEditable(false);
                rankTextField.setEditable(false);
                
                titleLabel.setText("     Remove Lecturer Details");
                insertButton.setText("Remove");
                break;
                
        }
        
        clearFields();
        
        confirmPanel.setVisible(false);
        contentPanel.setVisible(true);
        
        lecturerIdPanel.setBackground(new Color(255, 255, 255));
        namePanel.setBackground(new Color(255, 255, 255));
        
    }

    public void setLecturerDetails(String lecturerId) {
        
        String lecturerDetails[] = lecturerController.getLecturerInfromationforUpdate(lecturerId);
        
        lecturerController.loadDepartmentCombo(departmentComboBox, lecturerDetails[1]);
        
        nameTextField.setText(lecturerDetails[0]);
        facultyComboBox.setSelectedItem(lecturerDetails[1]);
        buildingComboBox.setSelectedItem(lecturerDetails[2]);
        centerComboBox.setSelectedItem(lecturerDetails[3]);
        departmentComboBox.setSelectedItem(lecturerDetails[4]);
        categoryComboBox.setSelectedItem(lecturerDetails[5]);
        levelComboBox.setSelectedItem(lecturerDetails[6]);
        rankTextField.setText(lecturerDetails[7]);
        
        facultyTextField.setText(lecturerDetails[1]);
        buildingTextField.setText(lecturerDetails[2]);
        centerTextField.setText(lecturerDetails[3]);
        departmentTextField.setText(lecturerDetails[4]);
        categoryTextField.setText(lecturerDetails[5] + " - " + lecturerDetails[6]);
        
    }
    
    public void clearFields() {
        
        lecturerController.loadLecturerCombo(lecturerIdComboBox);
        lecturerController.loadFacultyCombo(facultyComboBox);
        lecturerController.loadBuildingCombo(buildingComboBox);
        lecturerController.loadCenterCombo(centerComboBox);
        lecturerController.loadCategoryCombo(categoryComboBox);
        lecturerController.loadLevelCombo(levelComboBox);
            
        departmentComboBox.removeAllItems();
        departmentComboBox.addItem("Select Department");
        departmentComboBox.addItem("Pleace select faculty first...");
        
        lecturerIdTextField.setText("");
        lecturerIdComboBox.setSelectedItem("Select Lecturer ID");
        nameTextField.setText("");
        facultyComboBox.setSelectedItem("Select Faculty");
        facultyTextField.setText("");
        buildingComboBox.setSelectedItem("Select Building");
        buildingTextField.setText("");
        centerComboBox.setSelectedItem("Select Center");
        centerTextField.setText("");
        departmentComboBox.setSelectedItem("Select Department");
        departmentTextField.setText("");
        categoryComboBox.setSelectedItem("Select Category");
        categoryTextField.setText("");
        levelComboBox.setSelectedItem("Select Level");
        rankTextField.setText("");
        
    }
    
    public void clearVariable() {
 
        lecturerId = "";
        name = "";
        faculty = "";
        building = "";
        center = "";
        department = "";
        category = "";
        level = "";
        rank = "";
        
    }
    
    public void getValues() {
    
        clearVariable();
        
        lecturerId = "";

        if(pageType == 0) {

            lecturerId = lecturerIdTextField.getText().trim();

        }

        else {

            lecturerId = lecturerIdComboBox.getSelectedItem().toString().trim();

        }
        
        name = nameTextField.getText().trim();
        faculty = facultyComboBox.getSelectedItem().toString().trim();
        building = buildingComboBox.getSelectedItem().toString().trim();
        center = centerComboBox.getSelectedItem().toString().trim();
        department = departmentComboBox.getSelectedItem().toString().trim();
        category = categoryComboBox.getSelectedItem().toString().trim();
        level = levelComboBox.getSelectedItem().toString().trim();
        rank = rankTextField.getText().trim();
        
    }
    
    public boolean validateField() {
    
        getValues();
        
        boolean valid = true;
         
        if(pageType == 1) {
        
            if(!(validation.validateEmpty(lecturerId, "Select Lecturer ID"))) {

                lecturerIdPanel.setBackground(new Color(255, 153, 153)); 
                valid = false;

            }
        }
        
        if(!(validation.validateEmpty(name, null))) {
        
            namePanel.setBackground(new Color(255, 153, 153));          
            valid = false;
            
        }
        
        return valid;
        
    }
    
    public void setAlertDialog(String message[]) {
    
        confirmPanel.setVisible(false);
        
        msgTitleLabel.setText("Message");
        
        yesButton.setVisible(false);
        noButton.setVisible(false);
        okButton.setVisible(true);
              
        if(message.length == 1) {

            message2Label.setText(message[0]);
            message1Label.setVisible(false);
            message2Label.setVisible(true);
        
            clearFields();
            
        }
        
        else if(message.length == 2) {
        
            message1Label.setText(message[0]);
            message2Label.setText(message[1]);
            message1Label.setVisible(true);
            message2Label.setVisible(true);
            
            if(message[0] == null) {
            
                clearFields();
            
            }
        }
        
        contentPanel.setVisible(false);
        confirmPanel.setVisible(true);
      
    }

    public void setConfirmDialog(String message[]) {
     
        confirmPanel.setVisible(false);
        
        msgTitleLabel.setText("Confirm Your Action");
        
        yesButton.setVisible(true);
        noButton.setVisible(true);
        okButton.setVisible(false);
              
        if(message.length == 1) {

            message2Label.setText(message[0]);
            message1Label.setVisible(false);
            message2Label.setVisible(true);
        
        }
        
        else if(message.length == 2) {
        
            message1Label.setText(message[0]);
            message2Label.setText(message[1]);
            message1Label.setVisible(true);
            message2Label.setVisible(true);
            
        }
        
        contentPanel.setVisible(false);
        confirmPanel.setVisible(true);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        msgTitleLabel = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        message1Label = new javax.swing.JLabel();
        message2Label = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        yesButton = new javax.swing.JButton();
        noButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        lecturerIdPanel = new javax.swing.JPanel();
        lecturerIdTextField = new javax.swing.JTextField();
        lecturerIdComboBox = new javax.swing.JComboBox<>();
        namePanel = new javax.swing.JPanel();
        nameTextField = new javax.swing.JTextField();
        facultyPanel = new javax.swing.JPanel();
        facultyComboBox = new javax.swing.JComboBox<>();
        facultyTextField = new javax.swing.JTextField();
        buildingPanel = new javax.swing.JPanel();
        buildingComboBox = new javax.swing.JComboBox<>();
        buildingTextField = new javax.swing.JTextField();
        centerPanel = new javax.swing.JPanel();
        centerComboBox = new javax.swing.JComboBox<>();
        centerTextField = new javax.swing.JTextField();
        departmentPanel = new javax.swing.JPanel();
        departmentComboBox = new javax.swing.JComboBox<>();
        departmentTextField = new javax.swing.JTextField();
        categoryPanel = new javax.swing.JPanel();
        categoryComboBox = new javax.swing.JComboBox<>();
        levelComboBox = new javax.swing.JComboBox<>();
        categoryTextField = new javax.swing.JTextField();
        rankPanel = new javax.swing.JPanel();
        rankTextField = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        insertButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1366, 647));
        getContentPane().setLayout(null);

        confirmPanel.setBackground(new java.awt.Color(255, 255, 255));
        confirmPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 5, true));
        confirmPanel.setPreferredSize(new java.awt.Dimension(350, 200));
        confirmPanel.setLayout(null);

        titlePanel.setBackground(new java.awt.Color(255, 255, 255));
        titlePanel.setForeground(new java.awt.Color(255, 255, 255));
        titlePanel.setPreferredSize(new java.awt.Dimension(340, 30));
        titlePanel.setLayout(null);

        msgTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        msgTitleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        msgTitleLabel.setText("Confirm your action");
        msgTitleLabel.setIconTextGap(8);
        msgTitleLabel.setPreferredSize(new java.awt.Dimension(200, 30));
        titlePanel.add(msgTitleLabel);
        msgTitleLabel.setBounds(4, 0, 280, 30);

        closeLabel.setBackground(new java.awt.Color(255, 255, 255));
        closeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLabel.setText("X");
        closeLabel.setOpaque(true);
        closeLabel.setPreferredSize(new java.awt.Dimension(30, 30));
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeLabelMouseExited(evt);
            }
        });
        titlePanel.add(closeLabel);
        closeLabel.setBounds(310, 0, 30, 30);

        confirmPanel.add(titlePanel);
        titlePanel.setBounds(5, 5, 340, 30);

        message1Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        message1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message1Label.setText("jLabel2");
        message1Label.setPreferredSize(new java.awt.Dimension(290, 25));
        confirmPanel.add(message1Label);
        message1Label.setBounds(30, 60, 290, 25);

        message2Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        message2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message2Label.setText("jLabel2");
        message2Label.setPreferredSize(new java.awt.Dimension(290, 25));
        confirmPanel.add(message2Label);
        message2Label.setBounds(30, 90, 290, 25);

        buttonPanel.setBackground(new java.awt.Color(204, 204, 204));
        buttonPanel.setPreferredSize(new java.awt.Dimension(340, 42));
        buttonPanel.setLayout(null);

        yesButton.setBackground(new java.awt.Color(153, 153, 153));
        yesButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yesButton.setForeground(new java.awt.Color(255, 255, 255));
        yesButton.setText("YES");
        yesButton.setBorderPainted(false);
        yesButton.setFocusPainted(false);
        yesButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        yesButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        yesButton.setPreferredSize(new java.awt.Dimension(169, 40));
        yesButton.setSelected(true);
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(yesButton);
        yesButton.setBounds(0, 2, 169, 40);

        noButton.setBackground(new java.awt.Color(153, 153, 153));
        noButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noButton.setForeground(new java.awt.Color(255, 255, 255));
        noButton.setText("NO");
        noButton.setBorderPainted(false);
        noButton.setFocusPainted(false);
        noButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        noButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        noButton.setPreferredSize(new java.awt.Dimension(169, 40));
        noButton.setSelected(true);
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(noButton);
        noButton.setBounds(171, 2, 169, 40);

        okButton.setBackground(new java.awt.Color(153, 153, 153));
        okButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        okButton.setForeground(new java.awt.Color(255, 255, 255));
        okButton.setText("OK");
        okButton.setBorderPainted(false);
        okButton.setFocusPainted(false);
        okButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        okButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        okButton.setPreferredSize(new java.awt.Dimension(340, 40));
        okButton.setSelected(true);
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(okButton);
        okButton.setBounds(0, 2, 340, 40);

        confirmPanel.add(buttonPanel);
        buttonPanel.setBounds(5, 153, 340, 42);

        getContentPane().add(confirmPanel);
        confirmPanel.setBounds(510, 190, 350, 200);

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setPreferredSize(new java.awt.Dimension(1366, 620));
        contentPanel.setLayout(null);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        titleLabel.setText("     Insert Lecturer Details");
        titleLabel.setOpaque(true);
        titleLabel.setPreferredSize(new java.awt.Dimension(1366, 40));
        contentPanel.add(titleLabel);
        titleLabel.setBounds(0, 0, 1366, 40);

        lecturerIdPanel.setBackground(new java.awt.Color(255, 255, 255));
        lecturerIdPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Lecturer ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        lecturerIdPanel.setPreferredSize(new java.awt.Dimension(450, 80));
        lecturerIdPanel.setLayout(null);

        lecturerIdTextField.setBackground(new java.awt.Color(255, 255, 255));
        lecturerIdTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lecturerIdTextField.setPreferredSize(new java.awt.Dimension(420, 34));
        lecturerIdPanel.add(lecturerIdTextField);
        lecturerIdTextField.setBounds(15, 30, 420, 34);

        lecturerIdComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lecturerIdComboBox.setMaximumRowCount(10);
        lecturerIdComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Lecturer ID" }));
        lecturerIdComboBox.setBorder(null);
        lecturerIdComboBox.setFocusable(false);
        lecturerIdComboBox.setPreferredSize(new java.awt.Dimension(420, 34));
        lecturerIdComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                lecturerIdComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        lecturerIdComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecturerIdComboBoxActionPerformed(evt);
            }
        });
        lecturerIdPanel.add(lecturerIdComboBox);
        lecturerIdComboBox.setBounds(15, 30, 420, 34);

        contentPanel.add(lecturerIdPanel);
        lecturerIdPanel.setBounds(180, 80, 450, 80);

        namePanel.setBackground(new java.awt.Color(255, 255, 255));
        namePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        namePanel.setPreferredSize(new java.awt.Dimension(450, 80));

        nameTextField.setBackground(new java.awt.Color(255, 255, 255));
        nameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameTextField.setPreferredSize(new java.awt.Dimension(420, 34));
        nameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTextFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout namePanelLayout = new javax.swing.GroupLayout(namePanel);
        namePanel.setLayout(namePanelLayout);
        namePanelLayout.setHorizontalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        namePanelLayout.setVerticalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        contentPanel.add(namePanel);
        namePanel.setBounds(180, 190, 450, 80);

        facultyPanel.setBackground(new java.awt.Color(255, 255, 255));
        facultyPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Faculty", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        facultyPanel.setPreferredSize(new java.awt.Dimension(450, 80));
        facultyPanel.setLayout(null);

        facultyComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        facultyComboBox.setMaximumRowCount(10);
        facultyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Faculty" }));
        facultyComboBox.setBorder(null);
        facultyComboBox.setFocusable(false);
        facultyComboBox.setPreferredSize(new java.awt.Dimension(420, 34));
        facultyComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                facultyComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        facultyPanel.add(facultyComboBox);
        facultyComboBox.setBounds(15, 30, 420, 34);

        facultyTextField.setEditable(false);
        facultyTextField.setBackground(new java.awt.Color(255, 255, 255));
        facultyTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        facultyTextField.setPreferredSize(new java.awt.Dimension(420, 34));
        facultyPanel.add(facultyTextField);
        facultyTextField.setBounds(15, 30, 420, 34);

        contentPanel.add(facultyPanel);
        facultyPanel.setBounds(180, 300, 450, 80);

        buildingPanel.setBackground(new java.awt.Color(255, 255, 255));
        buildingPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Building", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        buildingPanel.setPreferredSize(new java.awt.Dimension(450, 80));
        buildingPanel.setLayout(null);

        buildingComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buildingComboBox.setMaximumRowCount(10);
        buildingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Building" }));
        buildingComboBox.setBorder(null);
        buildingComboBox.setFocusable(false);
        buildingComboBox.setPreferredSize(new java.awt.Dimension(420, 34));
        buildingPanel.add(buildingComboBox);
        buildingComboBox.setBounds(15, 30, 420, 34);

        buildingTextField.setEditable(false);
        buildingTextField.setBackground(new java.awt.Color(255, 255, 255));
        buildingTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buildingTextField.setPreferredSize(new java.awt.Dimension(420, 34));
        buildingPanel.add(buildingTextField);
        buildingTextField.setBounds(15, 30, 420, 34);

        contentPanel.add(buildingPanel);
        buildingPanel.setBounds(180, 410, 450, 80);

        centerPanel.setBackground(new java.awt.Color(255, 255, 255));
        centerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Center", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        centerPanel.setPreferredSize(new java.awt.Dimension(450, 80));
        centerPanel.setLayout(null);

        centerComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        centerComboBox.setMaximumRowCount(10);
        centerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Center" }));
        centerComboBox.setBorder(null);
        centerComboBox.setFocusable(false);
        centerComboBox.setPreferredSize(new java.awt.Dimension(420, 34));
        centerPanel.add(centerComboBox);
        centerComboBox.setBounds(15, 30, 420, 34);

        centerTextField.setEditable(false);
        centerTextField.setBackground(new java.awt.Color(255, 255, 255));
        centerTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        centerTextField.setPreferredSize(new java.awt.Dimension(420, 34));
        centerPanel.add(centerTextField);
        centerTextField.setBounds(15, 30, 420, 34);

        contentPanel.add(centerPanel);
        centerPanel.setBounds(740, 80, 450, 80);

        departmentPanel.setBackground(new java.awt.Color(255, 255, 255));
        departmentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Department", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        departmentPanel.setPreferredSize(new java.awt.Dimension(450, 80));
        departmentPanel.setLayout(null);

        departmentComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        departmentComboBox.setMaximumRowCount(10);
        departmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department" }));
        departmentComboBox.setBorder(null);
        departmentComboBox.setFocusable(false);
        departmentComboBox.setPreferredSize(new java.awt.Dimension(420, 34));
        departmentPanel.add(departmentComboBox);
        departmentComboBox.setBounds(15, 30, 420, 34);

        departmentTextField.setEditable(false);
        departmentTextField.setBackground(new java.awt.Color(255, 255, 255));
        departmentTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        departmentTextField.setPreferredSize(new java.awt.Dimension(420, 34));
        departmentPanel.add(departmentTextField);
        departmentTextField.setBounds(15, 30, 420, 34);

        contentPanel.add(departmentPanel);
        departmentPanel.setBounds(740, 190, 450, 80);

        categoryPanel.setBackground(new java.awt.Color(255, 255, 255));
        categoryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Category", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        categoryPanel.setPreferredSize(new java.awt.Dimension(450, 80));
        categoryPanel.setLayout(null);

        categoryComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        categoryComboBox.setMaximumRowCount(10);
        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category" }));
        categoryComboBox.setBorder(null);
        categoryComboBox.setFocusable(false);
        categoryComboBox.setPreferredSize(new java.awt.Dimension(236, 34));
        categoryPanel.add(categoryComboBox);
        categoryComboBox.setBounds(15, 30, 236, 34);

        levelComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        levelComboBox.setMaximumRowCount(10);
        levelComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Level" }));
        levelComboBox.setBorder(null);
        levelComboBox.setFocusable(false);
        levelComboBox.setPreferredSize(new java.awt.Dimension(166, 34));
        categoryPanel.add(levelComboBox);
        levelComboBox.setBounds(269, 30, 166, 34);

        categoryTextField.setEditable(false);
        categoryTextField.setBackground(new java.awt.Color(255, 255, 255));
        categoryTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        categoryTextField.setPreferredSize(new java.awt.Dimension(420, 34));
        categoryPanel.add(categoryTextField);
        categoryTextField.setBounds(15, 30, 420, 34);

        contentPanel.add(categoryPanel);
        categoryPanel.setBounds(740, 300, 450, 80);

        rankPanel.setBackground(new java.awt.Color(255, 255, 255));
        rankPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Rank", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        rankPanel.setPreferredSize(new java.awt.Dimension(450, 80));

        rankTextField.setBackground(new java.awt.Color(255, 255, 255));
        rankTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rankTextField.setPreferredSize(new java.awt.Dimension(420, 34));

        javax.swing.GroupLayout rankPanelLayout = new javax.swing.GroupLayout(rankPanel);
        rankPanel.setLayout(rankPanelLayout);
        rankPanelLayout.setHorizontalGroup(
            rankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rankPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rankTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        rankPanelLayout.setVerticalGroup(
            rankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rankPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rankTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        contentPanel.add(rankPanel);
        rankPanel.setBounds(740, 410, 450, 80);

        resetButton.setBackground(new java.awt.Color(255, 102, 102));
        resetButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetButton.setText("Reset");
        resetButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        resetButton.setBorderPainted(false);
        resetButton.setFocusable(false);
        resetButton.setPreferredSize(new java.awt.Dimension(150, 40));
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        contentPanel.add(resetButton);
        resetButton.setBounds(870, 520, 150, 40);

        insertButton.setBackground(new java.awt.Color(51, 204, 0));
        insertButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insertButton.setText("Insert");
        insertButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        insertButton.setBorderPainted(false);
        insertButton.setFocusable(false);
        insertButton.setPreferredSize(new java.awt.Dimension(150, 40));
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });
        contentPanel.add(insertButton);
        insertButton.setBounds(1040, 520, 150, 40);

        getContentPane().add(contentPanel);
        contentPanel.setBounds(0, 0, 1366, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextFieldKeyTyped
        
        namePanel.setBackground(new Color(255, 255, 255));
        char enter = evt.getKeyChar();
        
        if(Character.isDigit(enter)) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_nameTextFieldKeyTyped

    private void facultyComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_facultyComboBoxPopupMenuWillBecomeInvisible
        
        String facultyName = facultyComboBox.getSelectedItem().toString();
        
        if(!facultyName.equals("Select Faculty")) {
            
            lecturerController.loadDepartmentCombo(departmentComboBox, facultyName);
        
        }
        
        else {
           
            departmentComboBox.removeAllItems();
            departmentComboBox.addItem("Select Department");
            departmentComboBox.addItem("Pleace select faculty first...");
        
        }
    }//GEN-LAST:event_facultyComboBoxPopupMenuWillBecomeInvisible

    private void lecturerIdComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_lecturerIdComboBoxPopupMenuWillBecomeInvisible
        
        String selectedLecturerId = lecturerIdComboBox.getSelectedItem().toString();
            
        if(!selectedLecturerId.equals("Select Lecturer ID")) {
            
            setLecturerDetails(selectedLecturerId);
        
        }
    }//GEN-LAST:event_lecturerIdComboBoxPopupMenuWillBecomeInvisible

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        
        if(pageType == 1) {
            
            String selectedLecturerId = lecturerIdComboBox.getSelectedItem().toString();
            
            if(!selectedLecturerId.equals("Select Lecturer ID")) {
            
                setLecturerDetails(selectedLecturerId);
                
            }
            
            else {
            
                clearFields();
                
            }            
        }
        
        else {
        
            clearFields();
            
        }
    }//GEN-LAST:event_resetButtonActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        
        boolean valid = validateField();
        String message[] = new String[2];
        
        if(valid) {
                    
            switch(pageType) {
                
                case 0:
                    lecturerModel = new LecturerModel(lecturerId, name, faculty, building, center, department, category, level, rank);
                    message[1] = "Are you want insert this recode?";
                    setConfirmDialog(message);
                    break;
                
                case 1:
                    lecturerModel = new LecturerModel(lecturerId, name, faculty, building, center, department, category, level, rank);
                    message[1] = "Are you want update this recode?";
                    setConfirmDialog(message);
                    break;
                
                default:
                    message[1] = "Are you want remove this lecturer?";
                    setConfirmDialog(message);
                    break;
            
            }
        } 
        
        else {
        
            message[0] = "Invalid information.";
            message[1] = "Please check and try again.";
            setAlertDialog(message);
                
        }
    }//GEN-LAST:event_insertButtonActionPerformed

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked

        confirmPanel.setVisible(false);
        contentPanel.setVisible(true);

    }//GEN-LAST:event_closeLabelMouseClicked

    private void closeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseEntered

        closeLabel.setBackground(new Color(255, 0, 0));

    }//GEN-LAST:event_closeLabelMouseEntered

    private void closeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseExited

        closeLabel.setBackground(new Color(255, 255, 255));

    }//GEN-LAST:event_closeLabelMouseExited

    private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed

        String message[] = null;
        
        switch(pageType) {
        
            case 0:
                message = lecturerController.insertLecturer(lecturerModel);
                break;
             
            case 1:
                message = lecturerController.updateLecturer(lecturerModel);
                break;
                
            case 2:
                message = lecturerController.deleteLecturer(lecturerId);
                break;
                
        }
        
        setAlertDialog(message);

    }//GEN-LAST:event_yesButtonActionPerformed

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed

        confirmPanel.setVisible(false);
        contentPanel.setVisible(true);
        clearVariable();

    }//GEN-LAST:event_noButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed

        confirmPanel.setVisible(false);
        contentPanel.setVisible(true);

    }//GEN-LAST:event_okButtonActionPerformed

    private void lecturerIdComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecturerIdComboBoxActionPerformed
        
        lecturerIdPanel.setBackground(new Color(255, 255, 255));
        namePanel.setBackground(new Color(255, 255, 255));
        
    }//GEN-LAST:event_lecturerIdComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> buildingComboBox;
    private javax.swing.JPanel buildingPanel;
    private javax.swing.JTextField buildingTextField;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JComboBox<String> categoryComboBox;
    private javax.swing.JPanel categoryPanel;
    private javax.swing.JTextField categoryTextField;
    private javax.swing.JComboBox<String> centerComboBox;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JTextField centerTextField;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JPanel confirmPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JComboBox<String> departmentComboBox;
    private javax.swing.JPanel departmentPanel;
    private javax.swing.JTextField departmentTextField;
    private javax.swing.JComboBox<String> facultyComboBox;
    private javax.swing.JPanel facultyPanel;
    private javax.swing.JTextField facultyTextField;
    private javax.swing.JButton insertButton;
    private javax.swing.JComboBox<String> lecturerIdComboBox;
    private javax.swing.JPanel lecturerIdPanel;
    private javax.swing.JTextField lecturerIdTextField;
    private javax.swing.JComboBox<String> levelComboBox;
    private javax.swing.JLabel message1Label;
    private javax.swing.JLabel message2Label;
    private javax.swing.JLabel msgTitleLabel;
    private javax.swing.JPanel namePanel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton noButton;
    private javax.swing.JButton okButton;
    private javax.swing.JPanel rankPanel;
    private javax.swing.JTextField rankTextField;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JButton yesButton;
    // End of variables declaration//GEN-END:variables
}
