package GUIForms;

import EntityClasses.*;
import javax.swing.JOptionPane;
import ManagementClasses.*;
import java.sql.SQLException;
import java.util.List;

public class SignIn extends javax.swing.JFrame {
    User user;
    StudentManagement stdManag;
    TeacherManagement teachManag;
    AdminManagement adminManag;
    private String userName;
    private String password;
    private String role;
    List<Course> assignedCourses;

    public SignIn() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        T2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        R = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel1.setText("                               Welcome To Assignment Management System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                .addContainerGap()));

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel2.setText("           Please Login To Continue");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel4.setText("UserName:");

        T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel5.setText("Password:");

        T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel6.setText("UserType:");

        R.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Teacher", "Admin" }));
        R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        jButton1.setText("  Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 225,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(T1)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(T2)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel6,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 74,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        51, Short.MAX_VALUE)
                                                                .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(160, 160, 160)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 265,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(24, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 261,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6)
                                                        .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(36, 36, 36)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(52, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_T1ActionPerformed

    }// GEN-LAST:event_T1ActionPerformed

    private void T2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_T2ActionPerformed

    }// GEN-LAST:event_T2ActionPerformed

    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(SignIn.class);

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // Method to verify User login Details on Login
        userName = T1.getText();
        password = T2.getText();
        role = (String) R.getSelectedItem();

        logger.debug("Attempting login - Username: {}, Role: {}", userName, role);

        try {
            user = AuthenticationManagement.login(userName, password, role, assignedCourses);
            if (user != null) {
                logger.info("Successfully Logged in as {}", userName);
                User.setCurrentUser(user);
                castUser(user);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials. Please try again.");
            }
        } catch (SQLException e) {
            logger.error("Error while logging in", e);
            JOptionPane.showMessageDialog(this, "An error occurred while logging in. Please try again.");
        }
    }// GEN-LAST:event_jButton1ActionPerformed

    private void RActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_RActionPerformed

    }// GEN-LAST:event_RActionPerformed

    // Main to cast user object before redirecting to their form.
    public void castUser(User user) {
        try {
            if (user instanceof EntityClasses.Teacher) {
                EntityClasses.Teacher teacher = (EntityClasses.Teacher) user;
                new TeacherForm(teacher).setVisible(true);
                this.dispose();
            } else if (user instanceof EntityClasses.Student) {
                EntityClasses.Student student = (EntityClasses.Student) user;
                new StudentForm(student).setVisible(true);
                this.dispose();
            } else if (user instanceof EntityClasses.Admin) {
                EntityClasses.Admin admin = (EntityClasses.Admin) user;
                new AdminForm(admin).setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            logger.error("Error while casting User object", e);
        }
    }

    // Main method.
    public static void main(String args[]) {
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new SignIn().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> R;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
