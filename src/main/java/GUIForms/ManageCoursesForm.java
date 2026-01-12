package GUIForms;

import ManagementClasses.CourseManagement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ManageCoursesForm extends javax.swing.JFrame {
        CourseManagement courseManag = new CourseManagement();
        private static EntityClasses.Admin admin;

        public ManageCoursesForm(EntityClasses.Admin admin) {
                ManageCoursesForm.admin = admin;
                initComponents();
        }

        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jPanel10 = new javax.swing.JPanel();
                backLabel = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                coursename = new javax.swing.JTextField();
                courseId = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                teachID = new javax.swing.JTextField();
                addCourse = new javax.swing.JButton();
                updateCourse = new javax.swing.JButton();
                btnRemove = new javax.swing.JButton();
                jLabel4 = new javax.swing.JLabel();
                jPanel11 = new javax.swing.JPanel();
                jLabel14 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                removeCourseId = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("COURSES");

                jPanel1.setBackground(new java.awt.Color(255, 255, 204));

                jPanel10.setBackground(new java.awt.Color(0, 153, 153));
                jPanel10.setForeground(new java.awt.Color(255, 255, 255));

                backLabel.setBackground(new java.awt.Color(51, 204, 255));
                backLabel.setForeground(new java.awt.Color(255, 255, 255));
                backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back1.png"))); // NOI18N
                backLabel.setText(" ");
                backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                backLabelMouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
                jPanel10.setLayout(jPanel10Layout);
                jPanel10Layout.setHorizontalGroup(
                                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel10Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(backLabel)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel10Layout.setVerticalGroup(
                                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel10Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(backLabel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                43,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(11, Short.MAX_VALUE)));

                jLabel1.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
                jLabel1.setText("COURSE NAME");

                jLabel2.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
                jLabel2.setText("TEACHER ID");

                coursename.setText(" ");
                coursename.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                coursenameActionPerformed(evt);
                        }
                });

                courseId.setText("  ");
                courseId.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                courseIdActionPerformed(evt);
                        }
                });

                jLabel3.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
                jLabel3.setText("COURSE ID");

                addCourse.setBackground(new java.awt.Color(102, 255, 102));
                addCourse.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
                addCourse.setForeground(new java.awt.Color(255, 255, 255));
                addCourse.setText("ADD COURSE");
                addCourse.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addCourseActionPerformed(evt);
                        }
                });

                updateCourse.setBackground(new java.awt.Color(51, 255, 255));
                updateCourse.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
                updateCourse.setForeground(new java.awt.Color(255, 255, 255));
                updateCourse.setText("UPDATE COURSE");
                updateCourse.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                updateCourseActionPerformed(evt);
                        }
                });

                btnRemove.setBackground(new java.awt.Color(255, 51, 102));
                btnRemove.setForeground(new java.awt.Color(255, 255, 255));
                btnRemove.setText("REMOVE");
                btnRemove.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnRemoveActionPerformed(evt);
                        }
                });

                jLabel4.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
                jLabel4.setText("       Enter Course Details To Add or Update");

                jPanel11.setBackground(new java.awt.Color(255, 0, 0));

                jLabel14.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
                jLabel14.setForeground(new java.awt.Color(255, 255, 255));
                jLabel14.setText("Manage Courses");

                javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
                jPanel11.setLayout(jPanel11Layout);
                jPanel11Layout.setHorizontalGroup(
                                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel11Layout.createSequentialGroup()
                                                                .addGap(64, 64, 64)
                                                                .addComponent(jLabel14)
                                                                .addContainerGap(102, Short.MAX_VALUE)));
                jPanel11Layout.setVerticalGroup(
                                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel11Layout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addComponent(jLabel14)
                                                                .addContainerGap(17, Short.MAX_VALUE)));

                jLabel5.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
                jLabel5.setText("                      Enter Course Id To Remove");

                jLabel7.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
                jLabel7.setText("COURSE ID");

                removeCourseId.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                removeCourseIdActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jPanel10,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(4, 4, 4)
                                                                                                .addComponent(jPanel11,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(jLabel5,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                366,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jLabel6,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                95,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(24, 24, 24)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                false)
                                                                                                                .addComponent(addCourse,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel4,
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                359,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                false)
                                                                                                                                                                .addComponent(jLabel1,
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                119,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addComponent(jLabel3,
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addComponent(jLabel2,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                Short.MAX_VALUE))
                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                .addComponent(teachID,
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                .addComponent(coursename,
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                .addComponent(courseId,
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)))
                                                                                                                .addComponent(updateCourse,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel7,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                87,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(53, 53, 53)
                                                                                                .addComponent(removeCourseId))
                                                                                .addComponent(btnRemove,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                365,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(95, 95, 95)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel10,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jPanel11,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                22,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                25,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(courseId,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                22,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(coursename,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                22,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                22,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(teachID,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(addCourse,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(updateCourse,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                31,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(12, 12, 12)
                                                                                                .addComponent(jLabel6,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGap(45, 45, 45))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jLabel5,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                25,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                14,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel7,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                25,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(removeCourseId,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                25,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                                                .addComponent(btnRemove,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                31,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(14, 14, 14)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401,
                                                                Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_backLabelMouseClicked
                AdminForm v = new AdminForm(admin);
                v.setVisible(true);
                this.dispose();
        }// GEN-LAST:event_backLabelMouseClicked

        private void coursenameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_coursenameActionPerformed

        }// GEN-LAST:event_coursenameActionPerformed

        private void courseIdActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_courseIdActionPerformed

        }// GEN-LAST:event_courseIdActionPerformed

        private void addCourseActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addCourseActionPerformed
                try {
                        if (courseId.getText().trim().isEmpty() || coursename.getText().trim().isEmpty()) {
                                JOptionPane.showMessageDialog(this, "Course ID and Course Name must not be empty.");
                                return;
                        }

                        int courseID = Integer.parseInt(courseId.getText().trim());
                        String courseName = coursename.getText().trim();
                        int teachId = 0; // Default to 0 (No Teacher)

                        if (!teachID.getText().trim().isEmpty()) {
                                teachId = Integer.parseInt(teachID.getText().trim());
                        }

                        courseManag.addNewCourse(courseID, courseName, teachId);
                        JOptionPane.showMessageDialog(this, "Course added successfully.");
                } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(this, "Invalid input: Course ID and Teacher ID must be numeric.");
                } catch (SQLException ex) {
                        Logger.getLogger(ManageCoursesForm.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(this, "Error adding course: " + ex.getMessage());
                }
        }// GEN-LAST:event_addCourseActionPerformed

        private void updateCourseActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_updateCourseActionPerformed
                try {
                        if (courseId.getText().trim().isEmpty() || coursename.getText().trim().isEmpty()) {
                                JOptionPane.showMessageDialog(this, "Course ID and Course Name must not be empty.");
                                return;
                        }

                        int courseID = Integer.parseInt(courseId.getText().trim());
                        String courseName = coursename.getText().trim();
                        int teachId = 0; // Default to 0

                        if (!teachID.getText().trim().isEmpty()) {
                                teachId = Integer.parseInt(teachID.getText().trim());
                        }

                        CourseManagement courseManager = new CourseManagement();

                        boolean isUpdated = courseManager.updateCourse(courseID, courseName, teachId);
                        if (isUpdated) {
                                JOptionPane.showMessageDialog(this, "Course updated successfully.");
                        } else {
                                JOptionPane.showMessageDialog(this,
                                                "Failed to update course. Check if Course ID exists.");
                        }
                } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(this, "Invalid input: Course ID and Teacher ID must be numeric.");
                } catch (SQLException ex) {
                        Logger.getLogger(ManageCoursesForm.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(this, "Error updating course: " + ex.getMessage());
                }
        }// GEN-LAST:event_updateCourseActionPerformed

        private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRemoveActionPerformed
                try {
                        if (removeCourseId.getText().trim().isEmpty()) {
                                JOptionPane.showMessageDialog(this, "Course ID is required.");
                                return;
                        }

                        int courseID;
                        try {
                                courseID = Integer.parseInt(removeCourseId.getText().trim());
                        } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(this, "Invalid Course ID. Please enter a numeric value.");
                                return;
                        }
                        CourseManagement courseManager = new CourseManagement();
                        boolean isRemoved = courseManager.removeCourse(courseID);

                        if (isRemoved) {
                                JOptionPane.showMessageDialog(this, "Course removed successfully.");
                        } else {
                                JOptionPane.showMessageDialog(this, "Course ID not found. No course removed.");
                        }
                } catch (SQLException ex) {
                        Logger.getLogger(ManageCoursesForm.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(this, "Error removing course: " + ex.getMessage());
                }
        }// GEN-LAST:event_btnRemoveActionPerformed

        private void removeCourseIdActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_removeCourseIdActionPerformed

        }// GEN-LAST:event_removeCourseIdActionPerformed

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
                        java.util.logging.Logger.getLogger(ManageCoursesForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(ManageCoursesForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(ManageCoursesForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(ManageCoursesForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>
                java.awt.EventQueue.invokeLater(() -> {
                        EntityClasses.Admin admin = new EntityClasses.Admin(0, "admin", "admin", "admin@test.com");
                        new ManageCoursesForm(admin).setVisible(true);
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton addCourse;
        private javax.swing.JLabel backLabel;
        private javax.swing.JButton btnRemove;
        private javax.swing.JTextField courseId;
        private javax.swing.JTextField coursename;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel10;
        private javax.swing.JPanel jPanel11;
        private javax.swing.JTextField removeCourseId;
        private javax.swing.JTextField teachID;
        private javax.swing.JButton updateCourse;
        // End of variables declaration//GEN-END:variables
}
