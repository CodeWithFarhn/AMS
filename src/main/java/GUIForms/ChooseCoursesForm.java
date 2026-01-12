package GUIForms;

import Database.DatabaseConnection;
import EntityClasses.Course;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class ChooseCoursesForm extends javax.swing.JFrame {
        private static AdminForm adminForm;
        static EntityClasses.Admin admin;

        public ChooseCoursesForm(EntityClasses.Admin admin, AdminForm adminForm) {
                ChooseCoursesForm.adminForm = adminForm;
                ChooseCoursesForm.admin = admin;
                initComponents();
        }

        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                mainPanel = new javax.swing.JPanel();
                jButton1 = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                jScrollPane2 = new javax.swing.JScrollPane();
                CHECKPANEL = new javax.swing.JPanel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                addWindowListener(new java.awt.event.WindowAdapter() {
                        public void windowOpened(java.awt.event.WindowEvent evt) {
                                formWindowOpened(evt);
                        }
                });

                jPanel1.setBackground(new java.awt.Color(0, 102, 153));

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back1.png"))); // NOI18N

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                46, Short.MAX_VALUE)
                                                                .addContainerGap()));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                40, Short.MAX_VALUE)
                                                                .addContainerGap()));

                jPanel2.setBackground(new java.awt.Color(102, 204, 255));

                jLabel2.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("Choose Courses to Register");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                247,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(21, 21, 21)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));

                jPanel3.setBackground(new java.awt.Color(0, 102, 153));

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));

                jButton1.setBackground(new java.awt.Color(102, 204, 255));
                jButton1.setText("save selection");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                CHECKPANEL.setBackground(new java.awt.Color(245, 245, 245));
                CHECKPANEL.setLayout(new javax.swing.BoxLayout(CHECKPANEL, javax.swing.BoxLayout.Y_AXIS));
                jScrollPane2.setViewportView(CHECKPANEL);

                jScrollPane1.setViewportView(jScrollPane2);

                javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
                mainPanel.setLayout(mainPanelLayout);
                mainPanelLayout.setHorizontalGroup(
                                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(mainPanelLayout.createSequentialGroup()
                                                                .addGroup(mainPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jButton1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(mainPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jScrollPane1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                299,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                                .addContainerGap()));
                mainPanelLayout.setVerticalGroup(
                                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(mainPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                281, Short.MAX_VALUE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                29,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                false)
                                                                                .addComponent(jPanel3,
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel1,
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(mainPanel,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jPanel2,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addContainerGap()))));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jPanel1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel2,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel3,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(mainPanel,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
                loadCoursesFromDatabase();
        }// GEN-LAST:event_formWindowOpened

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

                List<Course> selectedCourses = new ArrayList<>();
                for (Component component : CHECKPANEL.getComponents()) {
                        if (component instanceof JCheckBox checkBox && checkBox.isSelected()) {
                                int courseId = (int) checkBox.getClientProperty("courseId");
                                String courseName = checkBox.getText();
                                int teachId = (int) checkBox.getClientProperty("teachId");

                                // Create a Course object with the retrieved data
                                selectedCourses.add(new Course(courseId, courseName, teachId));
                        }
                }
                // Pass selectedCourses back to AdminForm
                adminForm.setSelectedCourses(selectedCourses);
                JOptionPane.showMessageDialog(this, "Courses saved successfully!");
                this.dispose();
        }// GEN-LAST:event_jButton1ActionPerformed

        private void loadCoursesFromDatabase() {
                try (Connection connection = DatabaseConnection.getConnection();
                                PreparedStatement stmt = connection
                                                .prepareStatement("SELECT courseId, coursename, teachId FROM Courses");
                                ResultSet rs = stmt.executeQuery()) {

                        // Clear the panel to avoid duplicate entries if called multiple times
                        CHECKPANEL.removeAll();
                        while (rs.next()) {
                                int courseId = rs.getInt("courseId");
                                String courseName = rs.getString("coursename");
                                int teachId = rs.getInt("teachId");

                                // Create a checkbox for each course
                                JCheckBox checkBox = new JCheckBox(courseName);
                                checkBox.putClientProperty("courseId", courseId);
                                checkBox.putClientProperty("teachId", teachId);
                                CHECKPANEL.add(checkBox); // Add to the JPanel
                        }
                        // Refresh the panel after adding checkboxes
                        CHECKPANEL.revalidate();
                        CHECKPANEL.repaint();
                } catch (SQLException e) {
                        JOptionPane.showMessageDialog(this, "Error loading courses: " + e.getMessage(), "Error",
                                        JOptionPane.ERROR_MESSAGE);
                }
        }

        // Main method
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
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(ChooseCoursesForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(ChooseCoursesForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(ChooseCoursesForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(ChooseCoursesForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>
                java.awt.EventQueue.invokeLater(() -> {
                        EntityClasses.Admin admin = new EntityClasses.Admin(0, "admin", "admin", "admin@test.com");
                        // Dummy AdminForm for test
                        AdminForm dummyAdminForm = new AdminForm(admin);
                        new ChooseCoursesForm(admin, dummyAdminForm).setVisible(true);
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel CHECKPANEL;
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JPanel mainPanel;
        // End of variables declaration//GEN-END:variables
}
