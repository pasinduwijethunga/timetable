package Views;

import Controllers.LectureController;
import java.awt.Color;

public class ViewLecturer extends javax.swing.JInternalFrame {

    LectureController lecturerController = new LectureController();
    
    String lecturerId = null;
    
    public ViewLecturer() {
        
        initComponents();
               
        lecturerController.loadLecturerTable(lecturerTable);
        contentPanel.setVisible(true);
        confirmPanel.setVisible(false);
        
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
        
            lecturerController.loadLecturerTable(lecturerTable);
        
        }
        
        else if(message.length == 2) {
        
            message1Label.setText(message[0]);
            message2Label.setText(message[1]);
            message1Label.setVisible(true);
            message2Label.setVisible(true);
            
            if(message[0] == null) {
            
                lecturerController.loadLecturerTable(lecturerTable);
        
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
        removeButton = new javax.swing.JButton();
        lecturerScrollPane = new javax.swing.JScrollPane();
        lecturerTable = new javax.swing.JTable();

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
        titleLabel.setText("     View Lecturer Details");
        titleLabel.setOpaque(true);
        titleLabel.setPreferredSize(new java.awt.Dimension(1366, 40));
        contentPanel.add(titleLabel);
        titleLabel.setBounds(0, 0, 1366, 40);

        removeButton.setBackground(new java.awt.Color(255, 102, 102));
        removeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removeButton.setText("Remove");
        removeButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        removeButton.setBorderPainted(false);
        removeButton.setFocusable(false);
        removeButton.setPreferredSize(new java.awt.Dimension(150, 40));
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        contentPanel.add(removeButton);
        removeButton.setBounds(1090, 520, 150, 40);

        lecturerScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        lecturerScrollPane.setOpaque(false);

        lecturerTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lecturerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        lecturerTable.setGridColor(new java.awt.Color(0, 0, 153));
        lecturerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lecturerTableMouseClicked(evt);
            }
        });
        lecturerScrollPane.setViewportView(lecturerTable);

        contentPanel.add(lecturerScrollPane);
        lecturerScrollPane.setBounds(110, 70, 1130, 430);

        getContentPane().add(contentPanel);
        contentPanel.setBounds(0, 0, 1366, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        
        String message[] = new String[2];
        
        if(lecturerId != null) {
        
            message[1] = "Are you want remove this lecturer?";
            setConfirmDialog(message);
                    
        }
        
        else {
        
            message[0] = "Invalid information.";
            message[1] = "Please check and try again.";
            setAlertDialog(message);
            
        }
    }//GEN-LAST:event_removeButtonActionPerformed

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

        String message[] = lecturerController.deleteLecturer(lecturerId);
        setAlertDialog(message);

    }//GEN-LAST:event_yesButtonActionPerformed

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed

        confirmPanel.setVisible(false);
        contentPanel.setVisible(true);

    }//GEN-LAST:event_noButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed

        confirmPanel.setVisible(false);
        contentPanel.setVisible(true);

    }//GEN-LAST:event_okButtonActionPerformed

    private void lecturerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecturerTableMouseClicked

        lecturerId = null;
        
        int r = lecturerTable.getSelectedRow();
        lecturerId = lecturerTable.getValueAt(r, 1).toString();

    }//GEN-LAST:event_lecturerTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JPanel confirmPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JScrollPane lecturerScrollPane;
    private javax.swing.JTable lecturerTable;
    private javax.swing.JLabel message1Label;
    private javax.swing.JLabel message2Label;
    private javax.swing.JLabel msgTitleLabel;
    private javax.swing.JButton noButton;
    private javax.swing.JButton okButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JButton yesButton;
    // End of variables declaration//GEN-END:variables
}
