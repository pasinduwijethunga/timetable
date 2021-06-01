package Views;

import Common.CommonFuntions;
import java.awt.Color;

public class HomePage extends javax.swing.JFrame {

    CommonFuntions commonFuntions = new CommonFuntions();  
    
    public HomePage() {

        initComponents();

        commonFuntions.setPageSize(this);
        panelVisibility();
        
    }

    public void panelVisibility() {
    
        try {
            
            closeLabel.setVisible(false);
            pageTitlePanel.setVisible(false);
            pageDesktopPane.setVisible(false);
            welcomeText1Label.setVisible(true);
            timeTextLabel.setVisible(true);
            
            pageDesktopPane.removeAll();

            commonFuntions.setLogoIcon(this);
            commonFuntions.setDateTime(dateTimeLabel);

            if(true) {

                loginLabel.setText("Logout");

            }

            else {

                loginLabel.setText("Login");

            }
        } 
        
        catch(Exception e) {
        
            System.out.println("Not load correctly... " + e);
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        dateTimeLabel = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        pageTitlePanel = new javax.swing.JPanel();
        closeLabel = new javax.swing.JLabel();
        pageTitleBarLabel = new javax.swing.JLabel();
        pageDesktopPane = new javax.swing.JDesktopPane();
        timeTextLabel = new javax.swing.JLabel();
        welcomeText1Label = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();
        topMenuBar = new javax.swing.JMenuBar();
        instituteMenu = new javax.swing.JMenu();
        homeMenu = new javax.swing.JMenu();
        lecturersMenu = new javax.swing.JMenu();
        viewLecMenu = new javax.swing.JMenu();
        insertLecMenu = new javax.swing.JMenu();
        editLecMenu = new javax.swing.JMenu();
        removeLecMenu = new javax.swing.JMenu();
        subjectsMenu = new javax.swing.JMenu();
        viewSubMenu = new javax.swing.JMenu();
        insertSubMenu = new javax.swing.JMenu();
        editSubMenu = new javax.swing.JMenu();
        removeSubMenu = new javax.swing.JMenu();
        workingMenu = new javax.swing.JMenu();
        workingMenu1 = new javax.swing.JMenu();
        studentMenu = new javax.swing.JMenu();
        locationsMenu = new javax.swing.JMenu();
        statisticMenu = new javax.swing.JMenu();
        tagsMenu = new javax.swing.JMenu();
        generateMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ABC INSTITUTE");

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setPreferredSize(new java.awt.Dimension(1366, 768));
        contentPanel.setLayout(null);

        topPanel.setBackground(new java.awt.Color(153, 153, 153));
        topPanel.setPreferredSize(new java.awt.Dimension(1366, 50));
        topPanel.setLayout(null);

        dateTimeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dateTimeLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateTimeLabel.setText("Date Time");
        dateTimeLabel.setPreferredSize(new java.awt.Dimension(30, 30));
        topPanel.add(dateTimeLabel);
        dateTimeLabel.setBounds(10, 10, 350, 30);

        loginLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        loginLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/loginIcon.png"))); // NOI18N
        loginLabel.setText("Logout");
        loginLabel.setIconTextGap(10);
        loginLabel.setPreferredSize(new java.awt.Dimension(30, 30));
        loginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLabelMouseClicked(evt);
            }
        });
        topPanel.add(loginLabel);
        loginLabel.setBounds(1230, 10, 110, 30);

        contentPanel.add(topPanel);
        topPanel.setBounds(0, 0, 1366, 50);

        bodyPanel.setPreferredSize(new java.awt.Dimension(1366, 712));
        bodyPanel.setLayout(null);

        pageTitlePanel.setBackground(new java.awt.Color(255, 255, 255));
        pageTitlePanel.setPreferredSize(new java.awt.Dimension(1366, 25));
        pageTitlePanel.setLayout(null);

        closeLabel.setBackground(new java.awt.Color(255, 255, 255));
        closeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closeLabel.setForeground(new java.awt.Color(0, 51, 204));
        closeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLabel.setText("X");
        closeLabel.setOpaque(true);
        closeLabel.setPreferredSize(new java.awt.Dimension(35, 25));
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
        pageTitlePanel.add(closeLabel);
        closeLabel.setBounds(1332, 0, 35, 25);

        pageTitleBarLabel.setBackground(new java.awt.Color(255, 255, 255));
        pageTitleBarLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pageTitleBarLabel.setForeground(new java.awt.Color(102, 102, 102));
        pageTitleBarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        pageTitleBarLabel.setText("Lecturers > View");
        pageTitleBarLabel.setIconTextGap(8);
        pageTitleBarLabel.setOpaque(true);
        pageTitleBarLabel.setPreferredSize(new java.awt.Dimension(500, 25));
        pageTitlePanel.add(pageTitleBarLabel);
        pageTitleBarLabel.setBounds(4, 0, 800, 25);

        bodyPanel.add(pageTitlePanel);
        pageTitlePanel.setBounds(0, 0, 1366, 25);

        pageDesktopPane.setOpaque(false);
        pageDesktopPane.setPreferredSize(new java.awt.Dimension(1366, 710));

        javax.swing.GroupLayout pageDesktopPaneLayout = new javax.swing.GroupLayout(pageDesktopPane);
        pageDesktopPane.setLayout(pageDesktopPaneLayout);
        pageDesktopPaneLayout.setHorizontalGroup(
            pageDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        pageDesktopPaneLayout.setVerticalGroup(
            pageDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        bodyPanel.add(pageDesktopPane);
        pageDesktopPane.setBounds(0, 0, 1366, 710);

        timeTextLabel.setFont(new java.awt.Font("Times New Roman", 3, 55)); // NOI18N
        timeTextLabel.setForeground(new java.awt.Color(51, 0, 102));
        timeTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeTextLabel.setText("Good Morning");
        timeTextLabel.setPreferredSize(new java.awt.Dimension(1366, 100));
        bodyPanel.add(timeTextLabel);
        timeTextLabel.setBounds(0, 200, 1366, 100);

        welcomeText1Label.setFont(new java.awt.Font("Times New Roman", 3, 55)); // NOI18N
        welcomeText1Label.setForeground(new java.awt.Color(51, 0, 102));
        welcomeText1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeText1Label.setText("Welcome to ABC Institute");
        welcomeText1Label.setPreferredSize(new java.awt.Dimension(1366, 100));
        bodyPanel.add(welcomeText1Label);
        welcomeText1Label.setBounds(0, 320, 1366, 100);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mainBackground.png"))); // NOI18N
        bodyPanel.add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 1366, 710);

        contentPanel.add(bodyPanel);
        bodyPanel.setBounds(0, 50, 1366, 712);

        topMenuBar.setBackground(new java.awt.Color(255, 255, 255));
        topMenuBar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        topMenuBar.setPreferredSize(new java.awt.Dimension(1366, 35));

        instituteMenu.setForeground(new java.awt.Color(102, 102, 102));
        instituteMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        instituteMenu.setText("ABC Institute");
        instituteMenu.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        instituteMenu.setIconTextGap(8);
        instituteMenu.setPreferredSize(new java.awt.Dimension(250, 20));
        instituteMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instituteMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                instituteMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                instituteMenuMouseExited(evt);
            }
        });
        topMenuBar.add(instituteMenu);

        homeMenu.setText("Home");
        homeMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        homeMenu.setIconTextGap(10);
        homeMenu.setPreferredSize(new java.awt.Dimension(100, 30));
        homeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMenuMouseExited(evt);
            }
        });
        topMenuBar.add(homeMenu);

        lecturersMenu.setText("Lecturers");
        lecturersMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lecturersMenu.setIconTextGap(10);
        lecturersMenu.setPreferredSize(new java.awt.Dimension(100, 30));
        lecturersMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lecturersMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lecturersMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lecturersMenuMouseExited(evt);
            }
        });

        viewLecMenu.setText("View");
        viewLecMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewLecMenu.setIconTextGap(10);
        viewLecMenu.setPreferredSize(new java.awt.Dimension(100, 30));
        viewLecMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewLecMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewLecMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewLecMenuMouseExited(evt);
            }
        });
        lecturersMenu.add(viewLecMenu);

        insertLecMenu.setText("Insert");
        insertLecMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        insertLecMenu.setIconTextGap(10);
        insertLecMenu.setPreferredSize(new java.awt.Dimension(100, 30));
        insertLecMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertLecMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insertLecMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insertLecMenuMouseExited(evt);
            }
        });
        lecturersMenu.add(insertLecMenu);

        editLecMenu.setText("Edit");
        editLecMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editLecMenu.setIconTextGap(10);
        editLecMenu.setPreferredSize(new java.awt.Dimension(100, 30));
        editLecMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editLecMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editLecMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editLecMenuMouseExited(evt);
            }
        });
        lecturersMenu.add(editLecMenu);

        removeLecMenu.setText("Remove");
        removeLecMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        removeLecMenu.setIconTextGap(10);
        removeLecMenu.setPreferredSize(new java.awt.Dimension(100, 30));
        removeLecMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeLecMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeLecMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeLecMenuMouseExited(evt);
            }
        });
        lecturersMenu.add(removeLecMenu);

        topMenuBar.add(lecturersMenu);

        subjectsMenu.setText("Subjects");
        subjectsMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subjectsMenu.setIconTextGap(10);
        subjectsMenu.setPreferredSize(new java.awt.Dimension(100, 30));
        subjectsMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subjectsMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subjectsMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                subjectsMenuMouseExited(evt);
            }
        });

        viewSubMenu.setText("View");
        viewSubMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewSubMenu.setIconTextGap(10);
        viewSubMenu.setPreferredSize(new java.awt.Dimension(100, 30));
        viewSubMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewSubMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewSubMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewSubMenuMouseExited(evt);
            }
        });
        subjectsMenu.add(viewSubMenu);

        insertSubMenu.setText("Insert");
        insertSubMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        insertSubMenu.setIconTextGap(10);
        insertSubMenu.setPreferredSize(new java.awt.Dimension(100, 30));
        insertSubMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertSubMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insertSubMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insertSubMenuMouseExited(evt);
            }
        });
        subjectsMenu.add(insertSubMenu);

        editSubMenu.setText("Edit");
        editSubMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editSubMenu.setIconTextGap(10);
        editSubMenu.setPreferredSize(new java.awt.Dimension(100, 30));
        editSubMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editSubMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editSubMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editSubMenuMouseExited(evt);
            }
        });
        subjectsMenu.add(editSubMenu);

        removeSubMenu.setText("Remove");
        removeSubMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        removeSubMenu.setIconTextGap(10);
        removeSubMenu.setPreferredSize(new java.awt.Dimension(100, 30));
        removeSubMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeSubMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeSubMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeSubMenuMouseExited(evt);
            }
        });
        subjectsMenu.add(removeSubMenu);

        topMenuBar.add(subjectsMenu);

        workingMenu.setText("Working Days and Hours");
        workingMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        workingMenu.setIconTextGap(10);
        workingMenu.setPreferredSize(new java.awt.Dimension(220, 30));
        workingMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workingMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                workingMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                workingMenuMouseExited(evt);
            }
        });

        workingMenu1.setText("Working Days and Hours");
        workingMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        workingMenu1.setIconTextGap(10);
        workingMenu1.setPreferredSize(new java.awt.Dimension(220, 30));
        workingMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workingMenu1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                workingMenu1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                workingMenu1MouseExited(evt);
            }
        });
        workingMenu.add(workingMenu1);

        topMenuBar.add(workingMenu);

        studentMenu.setText("Student");
        studentMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studentMenu.setIconTextGap(10);
        studentMenu.setPreferredSize(new java.awt.Dimension(100, 30));
        studentMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studentMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studentMenuMouseExited(evt);
            }
        });
        topMenuBar.add(studentMenu);

        locationsMenu.setText("Locations");
        locationsMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        locationsMenu.setIconTextGap(10);
        locationsMenu.setPreferredSize(new java.awt.Dimension(100, 30));
        locationsMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                locationsMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locationsMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locationsMenuMouseExited(evt);
            }
        });
        topMenuBar.add(locationsMenu);

        statisticMenu.setText("Statistic");
        statisticMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        statisticMenu.setIconTextGap(10);
        statisticMenu.setPreferredSize(new java.awt.Dimension(100, 30));
        statisticMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statisticMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                statisticMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                statisticMenuMouseExited(evt);
            }
        });
        topMenuBar.add(statisticMenu);

        tagsMenu.setText("Tags");
        tagsMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tagsMenu.setIconTextGap(10);
        tagsMenu.setPreferredSize(new java.awt.Dimension(90, 30));
        tagsMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tagsMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tagsMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tagsMenuMouseExited(evt);
            }
        });
        topMenuBar.add(tagsMenu);

        generateMenu.setText("Generate Time Table");
        generateMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        generateMenu.setIconTextGap(10);
        generateMenu.setPreferredSize(new java.awt.Dimension(200, 30));
        generateMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generateMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generateMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generateMenuMouseExited(evt);
            }
        });
        topMenuBar.add(generateMenu);

        setJMenuBar(topMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLabelMouseClicked
        
    }//GEN-LAST:event_loginLabelMouseClicked

    private void instituteMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instituteMenuMouseClicked

        panelVisibility();

    }//GEN-LAST:event_instituteMenuMouseClicked

    private void instituteMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instituteMenuMouseEntered
        
        instituteMenu.setForeground(new Color(255, 0, 0));
        
    }//GEN-LAST:event_instituteMenuMouseEntered

    private void instituteMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instituteMenuMouseExited
        
        instituteMenu.setForeground(new Color(0, 0, 153));
        
    }//GEN-LAST:event_instituteMenuMouseExited

    private void homeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMenuMouseClicked
     
        panelVisibility();
   
    }//GEN-LAST:event_homeMenuMouseClicked

    private void homeMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMenuMouseEntered
        
        homeMenu.setForeground(new Color(0, 0, 153));
        
    }//GEN-LAST:event_homeMenuMouseEntered

    private void homeMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMenuMouseExited
        
        homeMenu.setForeground(new Color(0, 0, 0));
        
    }//GEN-LAST:event_homeMenuMouseExited

    private void lecturersMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecturersMenuMouseClicked
    }//GEN-LAST:event_lecturersMenuMouseClicked

    private void lecturersMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecturersMenuMouseEntered
        
        lecturersMenu.setForeground(new Color(0, 0, 153));
        
    }//GEN-LAST:event_lecturersMenuMouseEntered

    private void lecturersMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecturersMenuMouseExited
        
        lecturersMenu.setForeground(new Color(0, 0, 0));
        
    }//GEN-LAST:event_lecturersMenuMouseExited
 
    private void subjectsMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjectsMenuMouseClicked
    }//GEN-LAST:event_subjectsMenuMouseClicked

    private void subjectsMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjectsMenuMouseEntered
        
        subjectsMenu.setForeground(new Color(0, 0, 153));
        
    }//GEN-LAST:event_subjectsMenuMouseEntered

    private void subjectsMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjectsMenuMouseExited
        
        subjectsMenu.setForeground(new Color(0, 0, 0));
        
    }//GEN-LAST:event_subjectsMenuMouseExited

    private void workingMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workingMenuMouseClicked
    }//GEN-LAST:event_workingMenuMouseClicked

    private void workingMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workingMenuMouseEntered
        
        workingMenu.setForeground(new Color(0, 0, 153));
        
    }//GEN-LAST:event_workingMenuMouseEntered

    private void workingMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workingMenuMouseExited
        
        workingMenu.setForeground(new Color(0, 0, 0));
        
    }//GEN-LAST:event_workingMenuMouseExited

    private void studentMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentMenuMouseClicked
    }//GEN-LAST:event_studentMenuMouseClicked

    private void studentMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentMenuMouseEntered
        
        studentMenu.setForeground(new Color(0, 0, 153));
        
    }//GEN-LAST:event_studentMenuMouseEntered

    private void studentMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentMenuMouseExited
        
        studentMenu.setForeground(new Color(0, 0, 0));
        
    }//GEN-LAST:event_studentMenuMouseExited

    private void locationsMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locationsMenuMouseClicked
    }//GEN-LAST:event_locationsMenuMouseClicked

    private void locationsMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locationsMenuMouseEntered
        
        locationsMenu.setForeground(new Color(0, 0, 153));
        
    }//GEN-LAST:event_locationsMenuMouseEntered

    private void locationsMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locationsMenuMouseExited
        
        locationsMenu.setForeground(new Color(0, 0, 0));
        
    }//GEN-LAST:event_locationsMenuMouseExited

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
      
        panelVisibility();

    }//GEN-LAST:event_closeLabelMouseClicked

    private void closeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseEntered

        closeLabel.setBackground(new Color(255, 0, 0));

    }//GEN-LAST:event_closeLabelMouseEntered

    private void closeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseExited

        closeLabel.setBackground(new Color(255, 255, 255));

    }//GEN-LAST:event_closeLabelMouseExited

    private void statisticMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statisticMenuMouseClicked
    }//GEN-LAST:event_statisticMenuMouseClicked

    private void statisticMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statisticMenuMouseEntered
        
        statisticMenu.setForeground(new Color(0, 0, 153));
        
    }//GEN-LAST:event_statisticMenuMouseEntered

    private void statisticMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statisticMenuMouseExited
        
        statisticMenu.setForeground(new Color(0, 0, 0));
        
    }//GEN-LAST:event_statisticMenuMouseExited

    private void tagsMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tagsMenuMouseClicked
    }//GEN-LAST:event_tagsMenuMouseClicked

    private void tagsMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tagsMenuMouseEntered

        tagsMenu.setForeground(new Color(0, 0, 153));
        
    }//GEN-LAST:event_tagsMenuMouseEntered

    private void tagsMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tagsMenuMouseExited
        
        tagsMenu.setForeground(new Color(0, 0, 0));
        
    }//GEN-LAST:event_tagsMenuMouseExited

    private void generateMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateMenuMouseClicked
    }//GEN-LAST:event_generateMenuMouseClicked

    private void generateMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateMenuMouseEntered

        generateMenu.setForeground(new Color(0, 0, 153));
        
    }//GEN-LAST:event_generateMenuMouseEntered

    private void generateMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateMenuMouseExited
       
        generateMenu.setForeground(new Color(0, 0, 0));
        
    }//GEN-LAST:event_generateMenuMouseExited

    private void viewLecMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewLecMenuMouseClicked

        ViewLecturer viewLecturer = new ViewLecturer();
        pageDesktopPane.removeAll();
        pageDesktopPane.add(viewLecturer).setVisible(true);
        pageTitleBarLabel.setText("Lecturers > View");

        pageDesktopPane.setVisible(true);
        pageTitlePanel.setVisible(true);
        
    }//GEN-LAST:event_viewLecMenuMouseClicked

    private void viewLecMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewLecMenuMouseEntered
        
        viewLecMenu.setForeground(new Color(0, 0, 153));
        
    }//GEN-LAST:event_viewLecMenuMouseEntered

    private void viewLecMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewLecMenuMouseExited
        
        viewLecMenu.setForeground(new Color(0, 0, 0));
        
    }//GEN-LAST:event_viewLecMenuMouseExited

    private void editLecMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLecMenuMouseClicked
        
        InsertLecturer insertLecturer = new InsertLecturer(1);
        pageDesktopPane.removeAll();
        pageDesktopPane.add(insertLecturer).setVisible(true);
        pageTitleBarLabel.setText("Lecturers > Edit");

        pageDesktopPane.setVisible(true);
        pageTitlePanel.setVisible(true);
        
    }//GEN-LAST:event_editLecMenuMouseClicked

    private void editLecMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLecMenuMouseEntered
        
        editLecMenu.setForeground(new Color(0, 0, 153));
        
    }//GEN-LAST:event_editLecMenuMouseEntered

    private void editLecMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLecMenuMouseExited
        
        editLecMenu.setForeground(new Color(0, 0, 0));
        
    }//GEN-LAST:event_editLecMenuMouseExited

    private void insertLecMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertLecMenuMouseClicked
        
        InsertLecturer insertLecturer = new InsertLecturer(0);
        pageDesktopPane.removeAll();
        pageDesktopPane.add(insertLecturer).setVisible(true);
        pageTitleBarLabel.setText("Lecturers > Insert");

        pageDesktopPane.setVisible(true);
        pageTitlePanel.setVisible(true);
        
    }//GEN-LAST:event_insertLecMenuMouseClicked

    private void insertLecMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertLecMenuMouseEntered
        
        insertLecMenu.setForeground(new Color(0, 0, 153));
        
    }//GEN-LAST:event_insertLecMenuMouseEntered

    private void insertLecMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertLecMenuMouseExited
        
        insertLecMenu.setForeground(new Color(0, 0, 0));
        
    }//GEN-LAST:event_insertLecMenuMouseExited

    private void removeLecMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeLecMenuMouseClicked
        
        InsertLecturer insertLecturer = new InsertLecturer(2);
        pageDesktopPane.removeAll();
        pageDesktopPane.add(insertLecturer).setVisible(true);
        pageTitleBarLabel.setText("Lecturers > Remove");

        pageDesktopPane.setVisible(true);
        pageTitlePanel.setVisible(true);
        
    }//GEN-LAST:event_removeLecMenuMouseClicked

    private void removeLecMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeLecMenuMouseEntered
        
        removeLecMenu.setForeground(new Color(0, 0, 153));
        
    }//GEN-LAST:event_removeLecMenuMouseEntered

    private void removeLecMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeLecMenuMouseExited
        
        removeLecMenu.setForeground(new Color(0, 0, 0));
        
    }//GEN-LAST:event_removeLecMenuMouseExited

    private void viewSubMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewSubMenuMouseClicked
        
        ViewSubject viewSubject = new ViewSubject();
        pageDesktopPane.removeAll();
        pageDesktopPane.add(viewSubject).setVisible(true);
        pageTitleBarLabel.setText("Subjects > View");

        pageDesktopPane.setVisible(true);
        pageTitlePanel.setVisible(true);
        
    }//GEN-LAST:event_viewSubMenuMouseClicked

    private void viewSubMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewSubMenuMouseEntered
        
        viewSubMenu.setForeground(new Color(0, 0, 153));
        
    }//GEN-LAST:event_viewSubMenuMouseEntered

    private void viewSubMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewSubMenuMouseExited
        
        viewSubMenu.setForeground(new Color(0, 0, 0));
        
    }//GEN-LAST:event_viewSubMenuMouseExited

    private void insertSubMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertSubMenuMouseClicked
        
        InsertSubject insertSubject = new InsertSubject(0);
        pageDesktopPane.removeAll();
        pageDesktopPane.add(insertSubject).setVisible(true);
        pageTitleBarLabel.setText("Subjects > Insert");

        pageDesktopPane.setVisible(true);
        pageTitlePanel.setVisible(true);
        
    }//GEN-LAST:event_insertSubMenuMouseClicked

    private void insertSubMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertSubMenuMouseEntered
        
        insertSubMenu.setForeground(new Color(0, 0, 153));
        
    }//GEN-LAST:event_insertSubMenuMouseEntered

    private void insertSubMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertSubMenuMouseExited
        
        insertSubMenu.setForeground(new Color(0, 0, 0));
        
    }//GEN-LAST:event_insertSubMenuMouseExited

    private void editSubMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSubMenuMouseClicked
        
        InsertSubject insertSubject = new InsertSubject(1);
        pageDesktopPane.removeAll();
        pageDesktopPane.add(insertSubject).setVisible(true);
        pageTitleBarLabel.setText("Subjects > Edit");

        pageDesktopPane.setVisible(true);
        pageTitlePanel.setVisible(true);
        
    }//GEN-LAST:event_editSubMenuMouseClicked

    private void editSubMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSubMenuMouseEntered
        
        editSubMenu.setForeground(new Color(0, 0, 153));
        
    }//GEN-LAST:event_editSubMenuMouseEntered

    private void editSubMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSubMenuMouseExited
        
        editSubMenu.setForeground(new Color(0, 0, 0));
        
    }//GEN-LAST:event_editSubMenuMouseExited

    private void removeSubMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeSubMenuMouseClicked
        
        InsertSubject insertSubject = new InsertSubject(2);
        pageDesktopPane.removeAll();
        pageDesktopPane.add(insertSubject).setVisible(true);
        pageTitleBarLabel.setText("Subjects > Remove");

        pageDesktopPane.setVisible(true);
        pageTitlePanel.setVisible(true);
        
    }//GEN-LAST:event_removeSubMenuMouseClicked

    private void removeSubMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeSubMenuMouseEntered
        
        removeSubMenu.setForeground(new Color(0, 0, 153));
        
    }//GEN-LAST:event_removeSubMenuMouseEntered

    private void removeSubMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeSubMenuMouseExited
        
        removeSubMenu.setForeground(new Color(0, 0, 0));
        
    }//GEN-LAST:event_removeSubMenuMouseExited

    private void workingMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workingMenu1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_workingMenu1MouseClicked

    private void workingMenu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workingMenu1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_workingMenu1MouseEntered

    private void workingMenu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workingMenu1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_workingMenu1MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
        
            public void run() {
            
                new HomePage().setVisible(true);
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel dateTimeLabel;
    private javax.swing.JMenu editLecMenu;
    private javax.swing.JMenu editSubMenu;
    private javax.swing.JMenu generateMenu;
    private javax.swing.JMenu homeMenu;
    private javax.swing.JMenu insertLecMenu;
    private javax.swing.JMenu insertSubMenu;
    private javax.swing.JMenu instituteMenu;
    private javax.swing.JMenu lecturersMenu;
    private javax.swing.JMenu locationsMenu;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JDesktopPane pageDesktopPane;
    private javax.swing.JLabel pageTitleBarLabel;
    private javax.swing.JPanel pageTitlePanel;
    private javax.swing.JMenu removeLecMenu;
    private javax.swing.JMenu removeSubMenu;
    private javax.swing.JMenu statisticMenu;
    private javax.swing.JMenu studentMenu;
    private javax.swing.JMenu subjectsMenu;
    private javax.swing.JMenu tagsMenu;
    private javax.swing.JLabel timeTextLabel;
    private javax.swing.JMenuBar topMenuBar;
    private javax.swing.JPanel topPanel;
    private javax.swing.JMenu viewLecMenu;
    private javax.swing.JMenu viewSubMenu;
    private javax.swing.JLabel welcomeText1Label;
    private javax.swing.JMenu workingMenu;
    private javax.swing.JMenu workingMenu1;
    // End of variables declaration//GEN-END:variables
}
