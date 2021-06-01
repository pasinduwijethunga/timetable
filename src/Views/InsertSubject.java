package Views;

import Common.Validation;
import Controllers.SubjectController;
import Models.SubjectModel;
import java.awt.Color;

public class InsertSubject extends javax.swing.JInternalFrame {

    SubjectController subjectController = new SubjectController();
    SubjectModel subjectModel = new SubjectModel();
    Validation validation = new Validation();
    
    int pageType = 0;
       
    String subjectCode;
    String subjectName;
    String offeredYear;
    String offeredSemester;
    int noOfLecHours = 0;
    int noOfTutHours = 0;
    int noOfLabHours = 0;
    int noOfEvaHours = 0;
    
    public InsertSubject() {
        
        initComponents();
                
    }
    
    public InsertSubject(int pageType) {
        
        this.pageType = pageType;
        
        initComponents();
        
        initializePage(pageType);
        
    }
    
    public void initializePage(int pageType) {
        
        switch(pageType) {
            
            case 0:
                subjectCodeComboBox.setVisible(false);
                subjectCodeTextField.setVisible(true);
                offeredYearComboBox.setVisible(true);
                offeredSemesterComboBox.setVisible(true);
                
                subjectNameTextField.setEditable(true);
                offeredYearTextField.setEditable(true);
                offeredSemesterField.setEditable(true);
                noOfLecHoursTextField.setEditable(true);
                noOfTutHoursTextField.setEditable(true);
                noOfLabHoursTextField.setEditable(true);
                noOfEvaHoursTextField.setEditable(true);
                
                titleLabel.setText("     Insert Subject Details");
                insertButton.setText("Insert");
                break;
                
            case 1:
                subjectCodeComboBox.setVisible(true);
                subjectCodeTextField.setVisible(false);
                offeredYearComboBox.setVisible(true);
                offeredSemesterComboBox.setVisible(true);
                
                subjectNameTextField.setEditable(true);
                offeredYearTextField.setEditable(true);
                offeredSemesterField.setEditable(true);
                noOfLecHoursTextField.setEditable(true);
                noOfTutHoursTextField.setEditable(true);
                noOfLabHoursTextField.setEditable(true);
                noOfEvaHoursTextField.setEditable(true);
                
                titleLabel.setText("     Edit Subject Details");
                insertButton.setText("Edit");
                break;
                
            default:
                subjectCodeComboBox.setVisible(true);
                subjectCodeTextField.setVisible(false);
                offeredYearComboBox.setVisible(false);
                offeredSemesterComboBox.setVisible(false);
                
                subjectNameTextField.setEditable(false);
                offeredYearTextField.setEditable(false);
                offeredSemesterField.setEditable(false);
                noOfLecHoursTextField.setEditable(false);
                noOfTutHoursTextField.setEditable(false);
                noOfLabHoursTextField.setEditable(false);
                noOfEvaHoursTextField.setEditable(false);
                
                titleLabel.setText("     Remove Subject Details");
                insertButton.setText("Remove");
                break;
                
        }
        
        clearFields();
        
        confirmPanel.setVisible(false);
        contentPanel.setVisible(true);
        
        subjectCodePanel.setBackground(new Color(255, 255, 255));
        subjectNamePanel.setBackground(new Color(255, 255, 255));
        offeredYearPanel.setBackground(new Color(255, 255, 255));
        offeredSemesterPanel.setBackground(new Color(255, 255, 255));
        
    }

    public void setSubjectDetails(String subjectCode) {
        
        String subjectDetails[] = subjectController.getSubjectInfromationforUpdate(subjectCode);
        
        subjectNameTextField.setText(subjectDetails[0]);
        offeredYearComboBox.setSelectedItem(subjectDetails[1]);
        offeredSemesterComboBox.setSelectedItem(subjectDetails[2]);
        offeredYearTextField.setText(subjectDetails[1]);
        offeredSemesterField.setText(subjectDetails[2]);
        noOfLecHoursTextField.setText(subjectDetails[3]);
        noOfTutHoursTextField.setText(subjectDetails[4]);
        noOfLabHoursTextField.setText(subjectDetails[5]);
        noOfEvaHoursTextField.setText(subjectDetails[6]);
        
    }
    
    public void clearFields() {
        
        subjectController.loadSubjectCombo(subjectCodeComboBox);
        subjectController.loadOfferedYearCombo(offeredYearComboBox);
        subjectController.loadOfferedSemesterCombo(offeredSemesterComboBox);
            
        subjectCodeTextField.setText("");
        subjectCodeComboBox.setSelectedItem("Select Subject Code");
        subjectNameTextField.setText("");
        offeredYearComboBox.setSelectedItem("Select Offered Year");
        offeredYearTextField.setText("");
        offeredSemesterComboBox.setSelectedItem("Select Offered Semester");
        offeredSemesterField.setText("");
        noOfLecHoursTextField.setText("");
        noOfTutHoursTextField.setText("");
        noOfLabHoursTextField.setText("");
        noOfEvaHoursTextField.setText("");
        
    }
    
    public void clearVariable() {
 
        subjectCode = "";
        subjectName = "";
        offeredYear = "";
        offeredSemester = "";
        noOfLecHours = 0;
        noOfTutHours = 0;
        noOfLabHours = 0;
        noOfEvaHours = 0;
        
    }
    
    public void getValues() {
    
        clearVariable();
        
        subjectCode = "";

        if(pageType == 0) {

            subjectCode = subjectCodeTextField.getText().trim();

        }

        else {

            subjectCode = subjectCodeComboBox.getSelectedItem().toString().trim();

        }
        
        subjectName = subjectNameTextField.getText().trim();
        offeredYear = offeredYearComboBox.getSelectedItem().toString().trim();
        offeredSemester = offeredSemesterComboBox.getSelectedItem().toString().trim();
        
        String lecHours = noOfLecHoursTextField.getText().trim();
        String tutHours = noOfTutHoursTextField.getText().trim();
        String labHours = noOfLabHoursTextField.getText().trim();
        String evaHours = noOfEvaHoursTextField.getText().trim();
        
        if(lecHours != null && !lecHours.isEmpty()) {
        
            noOfLecHours = Integer.parseInt(lecHours);
            
        }
        
        else {
        
            noOfLecHours = 0;
            
        }
        
        if(tutHours != null && !tutHours.isEmpty()) {
        
            noOfTutHours = Integer.parseInt(tutHours);
            
        }
        
        else {
        
            noOfTutHours = 0;
            
        }
        
        if(labHours != null && !labHours.isEmpty()) {
        
            noOfLabHours = Integer.parseInt(labHours);
            
        }
        
        else {
        
            noOfLabHours = 0;
            
        }
        
        if(evaHours != null && !evaHours.isEmpty()) {
        
            noOfEvaHours = Integer.parseInt(evaHours);
            
        }
        
        else {
        
            noOfEvaHours = 0;
            
        }
    }
    
    public boolean validateField() {
    
        getValues();
        
        boolean valid = true;
        
        if(pageType == 1) {
        
            if(!(validation.validateEmpty(subjectCode, "Select Subject Code"))) {

                subjectCodePanel.setBackground(new Color(255, 153, 153)); 
                valid = false;

            }
        }
        
        if(!(validation.validateEmpty(subjectName, null))) {
        
            subjectNamePanel.setBackground(new Color(255, 153, 153));          
            valid = false;
            
        }
        
        if(!(validation.validateEmpty(offeredYear, "Select Offered Year"))) {
        
            offeredSemesterPanel.setBackground(new Color(255, 153, 153));          
            valid = false;
            
        }
        
        if(!(validation.validateEmpty(offeredSemester, "Select Offered Semester"))) {
        
            offeredSemesterPanel.setBackground(new Color(255, 153, 153));          
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
        subjectCodePanel = new javax.swing.JPanel();
        subjectCodeTextField = new javax.swing.JTextField();
        subjectCodeComboBox = new javax.swing.JComboBox<>();
        subjectNamePanel = new javax.swing.JPanel();
        subjectNameTextField = new javax.swing.JTextField();
        offeredYearPanel = new javax.swing.JPanel();
        offeredYearComboBox = new javax.swing.JComboBox<>();
        offeredYearTextField = new javax.swing.JTextField();
        offeredSemesterPanel = new javax.swing.JPanel();
        offeredSemesterComboBox = new javax.swing.JComboBox<>();
        offeredSemesterField = new javax.swing.JTextField();
        noOfLecHoursPanel = new javax.swing.JPanel();
        noOfLecHoursTextField = new javax.swing.JTextField();
        noOfTutHoursPanel = new javax.swing.JPanel();
        noOfTutHoursTextField = new javax.swing.JTextField();
        noOfLabHoursPanel = new javax.swing.JPanel();
        noOfLabHoursTextField = new javax.swing.JTextField();
        noOfEvaHoursPanel = new javax.swing.JPanel();
        noOfEvaHoursTextField = new javax.swing.JTextField();
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
        titleLabel.setText("     Insert Subject Details");
        titleLabel.setOpaque(true);
        titleLabel.setPreferredSize(new java.awt.Dimension(1366, 40));
        contentPanel.add(titleLabel);
        titleLabel.setBounds(0, 0, 1366, 40);

        subjectCodePanel.setBackground(new java.awt.Color(255, 255, 255));
        subjectCodePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Subject Code", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        subjectCodePanel.setPreferredSize(new java.awt.Dimension(450, 80));
        subjectCodePanel.setLayout(null);

        subjectCodeTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subjectCodeTextField.setPreferredSize(new java.awt.Dimension(420, 34));
        subjectCodePanel.add(subjectCodeTextField);
        subjectCodeTextField.setBounds(15, 30, 420, 34);

        subjectCodeComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subjectCodeComboBox.setMaximumRowCount(10);
        subjectCodeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Subject Code" }));
        subjectCodeComboBox.setBorder(null);
        subjectCodeComboBox.setFocusable(false);
        subjectCodeComboBox.setPreferredSize(new java.awt.Dimension(420, 34));
        subjectCodeComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                subjectCodeComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        subjectCodeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectCodeComboBoxActionPerformed(evt);
            }
        });
        subjectCodePanel.add(subjectCodeComboBox);
        subjectCodeComboBox.setBounds(15, 30, 420, 34);

        contentPanel.add(subjectCodePanel);
        subjectCodePanel.setBounds(180, 80, 450, 80);

        subjectNamePanel.setBackground(new java.awt.Color(255, 255, 255));
        subjectNamePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Subject Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        subjectNamePanel.setPreferredSize(new java.awt.Dimension(450, 80));

        subjectNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subjectNameTextField.setPreferredSize(new java.awt.Dimension(420, 34));
        subjectNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                subjectNameTextFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout subjectNamePanelLayout = new javax.swing.GroupLayout(subjectNamePanel);
        subjectNamePanel.setLayout(subjectNamePanelLayout);
        subjectNamePanelLayout.setHorizontalGroup(
            subjectNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subjectNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        subjectNamePanelLayout.setVerticalGroup(
            subjectNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subjectNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        contentPanel.add(subjectNamePanel);
        subjectNamePanel.setBounds(180, 190, 450, 80);

        offeredYearPanel.setBackground(new java.awt.Color(255, 255, 255));
        offeredYearPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Offered Year", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        offeredYearPanel.setPreferredSize(new java.awt.Dimension(450, 80));
        offeredYearPanel.setLayout(null);

        offeredYearComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        offeredYearComboBox.setMaximumRowCount(10);
        offeredYearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Offered Year" }));
        offeredYearComboBox.setBorder(null);
        offeredYearComboBox.setFocusable(false);
        offeredYearComboBox.setPreferredSize(new java.awt.Dimension(420, 34));
        offeredYearComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                offeredYearComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        offeredYearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offeredYearComboBoxActionPerformed(evt);
            }
        });
        offeredYearPanel.add(offeredYearComboBox);
        offeredYearComboBox.setBounds(15, 30, 420, 34);

        offeredYearTextField.setEditable(false);
        offeredYearTextField.setBackground(new java.awt.Color(255, 255, 255));
        offeredYearTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        offeredYearTextField.setPreferredSize(new java.awt.Dimension(420, 34));
        offeredYearPanel.add(offeredYearTextField);
        offeredYearTextField.setBounds(15, 30, 420, 34);

        contentPanel.add(offeredYearPanel);
        offeredYearPanel.setBounds(180, 300, 450, 80);

        offeredSemesterPanel.setBackground(new java.awt.Color(255, 255, 255));
        offeredSemesterPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Offered Semester", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        offeredSemesterPanel.setPreferredSize(new java.awt.Dimension(450, 80));
        offeredSemesterPanel.setLayout(null);

        offeredSemesterComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        offeredSemesterComboBox.setMaximumRowCount(10);
        offeredSemesterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Offered Semester" }));
        offeredSemesterComboBox.setBorder(null);
        offeredSemesterComboBox.setFocusable(false);
        offeredSemesterComboBox.setPreferredSize(new java.awt.Dimension(420, 34));
        offeredSemesterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offeredSemesterComboBoxActionPerformed(evt);
            }
        });
        offeredSemesterPanel.add(offeredSemesterComboBox);
        offeredSemesterComboBox.setBounds(15, 30, 420, 34);

        offeredSemesterField.setEditable(false);
        offeredSemesterField.setBackground(new java.awt.Color(255, 255, 255));
        offeredSemesterField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        offeredSemesterField.setPreferredSize(new java.awt.Dimension(420, 34));
        offeredSemesterPanel.add(offeredSemesterField);
        offeredSemesterField.setBounds(15, 30, 420, 34);

        contentPanel.add(offeredSemesterPanel);
        offeredSemesterPanel.setBounds(180, 410, 450, 80);

        noOfLecHoursPanel.setBackground(new java.awt.Color(255, 255, 255));
        noOfLecHoursPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Number of Lecturer Hours", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        noOfLecHoursPanel.setPreferredSize(new java.awt.Dimension(450, 80));
        noOfLecHoursPanel.setLayout(null);

        noOfLecHoursTextField.setBackground(new java.awt.Color(255, 255, 255));
        noOfLecHoursTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        noOfLecHoursTextField.setPreferredSize(new java.awt.Dimension(420, 34));
        noOfLecHoursTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                noOfLecHoursTextFieldKeyTyped(evt);
            }
        });
        noOfLecHoursPanel.add(noOfLecHoursTextField);
        noOfLecHoursTextField.setBounds(15, 30, 420, 34);

        contentPanel.add(noOfLecHoursPanel);
        noOfLecHoursPanel.setBounds(740, 80, 450, 80);

        noOfTutHoursPanel.setBackground(new java.awt.Color(255, 255, 255));
        noOfTutHoursPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Number of Tutorial  Hours", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        noOfTutHoursPanel.setPreferredSize(new java.awt.Dimension(450, 80));
        noOfTutHoursPanel.setLayout(null);

        noOfTutHoursTextField.setBackground(new java.awt.Color(255, 255, 255));
        noOfTutHoursTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        noOfTutHoursTextField.setPreferredSize(new java.awt.Dimension(420, 34));
        noOfTutHoursTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                noOfTutHoursTextFieldKeyTyped(evt);
            }
        });
        noOfTutHoursPanel.add(noOfTutHoursTextField);
        noOfTutHoursTextField.setBounds(15, 30, 420, 34);

        contentPanel.add(noOfTutHoursPanel);
        noOfTutHoursPanel.setBounds(740, 190, 450, 80);

        noOfLabHoursPanel.setBackground(new java.awt.Color(255, 255, 255));
        noOfLabHoursPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Number of Lab Hours", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        noOfLabHoursPanel.setPreferredSize(new java.awt.Dimension(450, 80));
        noOfLabHoursPanel.setLayout(null);

        noOfLabHoursTextField.setBackground(new java.awt.Color(255, 255, 255));
        noOfLabHoursTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        noOfLabHoursTextField.setPreferredSize(new java.awt.Dimension(420, 34));
        noOfLabHoursTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                noOfLabHoursTextFieldKeyTyped(evt);
            }
        });
        noOfLabHoursPanel.add(noOfLabHoursTextField);
        noOfLabHoursTextField.setBounds(15, 30, 420, 34);

        contentPanel.add(noOfLabHoursPanel);
        noOfLabHoursPanel.setBounds(740, 300, 450, 80);

        noOfEvaHoursPanel.setBackground(new java.awt.Color(255, 255, 255));
        noOfEvaHoursPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Number of Evaluation Hours", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        noOfEvaHoursPanel.setPreferredSize(new java.awt.Dimension(450, 80));

        noOfEvaHoursTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        noOfEvaHoursTextField.setPreferredSize(new java.awt.Dimension(420, 34));
        noOfEvaHoursTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                noOfEvaHoursTextFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout noOfEvaHoursPanelLayout = new javax.swing.GroupLayout(noOfEvaHoursPanel);
        noOfEvaHoursPanel.setLayout(noOfEvaHoursPanelLayout);
        noOfEvaHoursPanelLayout.setHorizontalGroup(
            noOfEvaHoursPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfEvaHoursPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(noOfEvaHoursTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        noOfEvaHoursPanelLayout.setVerticalGroup(
            noOfEvaHoursPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfEvaHoursPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(noOfEvaHoursTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        contentPanel.add(noOfEvaHoursPanel);
        noOfEvaHoursPanel.setBounds(740, 410, 450, 80);

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

    private void subjectNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subjectNameTextFieldKeyTyped
        
        subjectNamePanel.setBackground(new Color(255, 255, 255));
        
    }//GEN-LAST:event_subjectNameTextFieldKeyTyped

    private void offeredYearComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_offeredYearComboBoxPopupMenuWillBecomeInvisible
    }//GEN-LAST:event_offeredYearComboBoxPopupMenuWillBecomeInvisible

    private void subjectCodeComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_subjectCodeComboBoxPopupMenuWillBecomeInvisible
        
        String selectedSubjectCode = subjectCodeComboBox.getSelectedItem().toString();
            
        if(!selectedSubjectCode.equals("Select Subject Code")) {
            
            setSubjectDetails(selectedSubjectCode);
        
        }
    }//GEN-LAST:event_subjectCodeComboBoxPopupMenuWillBecomeInvisible

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        
        if(pageType == 1) {
            
            String selectedSubjectCode = subjectCodeComboBox.getSelectedItem().toString();
            
            if(!selectedSubjectCode.equals("Select Subject Code")) {

                setSubjectDetails(selectedSubjectCode);

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
                    subjectModel = new SubjectModel(subjectCode, subjectName, offeredYear, offeredSemester, noOfLecHours, noOfTutHours, noOfLabHours, noOfEvaHours);
                    message[1] = "Are you want insert this recode?";
                    setConfirmDialog(message);
                    break;
                
                case 1:
                    subjectModel = new SubjectModel(subjectCode, subjectName, offeredYear, offeredSemester, noOfLecHours, noOfTutHours, noOfLabHours, noOfEvaHours);
                    message[1] = "Are you want update this recode?";
                    setConfirmDialog(message);
                    break;
                
                default:
                    message[1] = "Are you want remove this subject?";
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
                message = subjectController.insertSubject(subjectModel);
                break;
             
            case 1:
                message = subjectController.updateSubject(subjectModel);
                break;
                
            case 2:
                message = subjectController.deleteSubject(subjectCode);
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

    private void subjectCodeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectCodeComboBoxActionPerformed
        
        subjectCodePanel.setBackground(new Color(255, 255, 255));
        subjectNamePanel.setBackground(new Color(255, 255, 255));
        offeredYearPanel.setBackground(new Color(255, 255, 255));
        offeredSemesterPanel.setBackground(new Color(255, 255, 255));
        
    }//GEN-LAST:event_subjectCodeComboBoxActionPerformed

    private void offeredYearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offeredYearComboBoxActionPerformed
        
        offeredYearPanel.setBackground(new Color(255, 255, 255));
        
    }//GEN-LAST:event_offeredYearComboBoxActionPerformed

    private void offeredSemesterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offeredSemesterComboBoxActionPerformed
        
        offeredSemesterPanel.setBackground(new Color(255, 255, 255));
        
    }//GEN-LAST:event_offeredSemesterComboBoxActionPerformed

    private void noOfLecHoursTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noOfLecHoursTextFieldKeyTyped
        
        char enter = evt.getKeyChar();
        
        if(!(Character.isDigit(enter))) {
            
            String letter = String.valueOf(enter);
            
            if(!(letter.equalsIgnoreCase("."))) {
            
                evt.consume();
            
            }
        }
    }//GEN-LAST:event_noOfLecHoursTextFieldKeyTyped

    private void noOfTutHoursTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noOfTutHoursTextFieldKeyTyped
        
        char enter = evt.getKeyChar();
        
        if(!(Character.isDigit(enter))) {
            
            String letter = String.valueOf(enter);
            
            if(!(letter.equalsIgnoreCase("."))) {
            
                evt.consume();
            
            }
        }
    }//GEN-LAST:event_noOfTutHoursTextFieldKeyTyped

    private void noOfLabHoursTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noOfLabHoursTextFieldKeyTyped
        
        char enter = evt.getKeyChar();
        
        if(!(Character.isDigit(enter))) {
            
            String letter = String.valueOf(enter);
            
            if(!(letter.equalsIgnoreCase("."))) {
            
                evt.consume();
            
            }
        }
    }//GEN-LAST:event_noOfLabHoursTextFieldKeyTyped

    private void noOfEvaHoursTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noOfEvaHoursTextFieldKeyTyped
        
        char enter = evt.getKeyChar();
        
        if(!(Character.isDigit(enter))) {
            
            String letter = String.valueOf(enter);
            
            if(!(letter.equalsIgnoreCase("."))) {
            
                evt.consume();
            
            }
        }
    }//GEN-LAST:event_noOfEvaHoursTextFieldKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JPanel confirmPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel message1Label;
    private javax.swing.JLabel message2Label;
    private javax.swing.JLabel msgTitleLabel;
    private javax.swing.JButton noButton;
    private javax.swing.JPanel noOfEvaHoursPanel;
    private javax.swing.JTextField noOfEvaHoursTextField;
    private javax.swing.JPanel noOfLabHoursPanel;
    private javax.swing.JTextField noOfLabHoursTextField;
    private javax.swing.JPanel noOfLecHoursPanel;
    private javax.swing.JTextField noOfLecHoursTextField;
    private javax.swing.JPanel noOfTutHoursPanel;
    private javax.swing.JTextField noOfTutHoursTextField;
    private javax.swing.JComboBox<String> offeredSemesterComboBox;
    private javax.swing.JTextField offeredSemesterField;
    private javax.swing.JPanel offeredSemesterPanel;
    private javax.swing.JComboBox<String> offeredYearComboBox;
    private javax.swing.JPanel offeredYearPanel;
    private javax.swing.JTextField offeredYearTextField;
    private javax.swing.JButton okButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JComboBox<String> subjectCodeComboBox;
    private javax.swing.JPanel subjectCodePanel;
    private javax.swing.JTextField subjectCodeTextField;
    private javax.swing.JPanel subjectNamePanel;
    private javax.swing.JTextField subjectNameTextField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JButton yesButton;
    // End of variables declaration//GEN-END:variables
}
