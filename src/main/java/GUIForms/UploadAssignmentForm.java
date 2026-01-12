package GUIForms;

import EntityClasses.Assignment;
import ManagementClasses.*;
import java.io.File;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class UploadAssignmentForm extends javax.swing.JFrame {
        private static EntityClasses.Teacher currentTeacher;
        private static int teacherId;
        private static int courseId;

        public UploadAssignmentForm(int teacherId, int courseId, EntityClasses.Teacher teacher) {
                UploadAssignmentForm.currentTeacher = teacher;
                UploadAssignmentForm.teacherId = teacherId;
                UploadAssignmentForm.courseId = courseId;
                initComponents();
                description.setLineWrap(true);
                description.setWrapStyleWord(true);
        }

        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                backLabel = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                jLabel6 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                assIdField = new javax.swing.JTextField();
                titleField = new javax.swing.JTextField();
                jScrollPane1 = new javax.swing.JScrollPane();
                description = new javax.swing.JTextArea();
                jLabel5 = new javax.swing.JLabel();
                deadline = new javax.swing.JTextField();
                choosefile = new javax.swing.JButton();
                filelocation = new javax.swing.JTextField();
                uploadButton = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(255, 255, 204));

                jPanel2.setBackground(new java.awt.Color(0, 153, 153));

                backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back1.png"))); // NOI18N

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(backLabel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                41,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(14, Short.MAX_VALUE)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addComponent(backLabel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(23, Short.MAX_VALUE)));

                jPanel3.setBackground(new java.awt.Color(255, 0, 0));

                jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(255, 255, 255));
                jLabel6.setText("UPLOAD ASSIGNMENT");

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(126, 126, 126)
                                                                .addComponent(jLabel6,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                276,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(142, Short.MAX_VALUE)));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel6)
                                                                .addGap(23, 23, 23)));

                jLabel3.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
                jLabel3.setText("Assignment Id");

                jLabel1.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
                jLabel1.setText("Title");

                jLabel4.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
                jLabel4.setText("Description");

                assIdField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                assIdFieldActionPerformed(evt);
                        }
                });

                titleField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                titleFieldActionPerformed(evt);
                        }
                });

                description.setColumns(20);
                description.setRows(5);
                jScrollPane1.setViewportView(description);

                jLabel5.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
                jLabel5.setText("Deadline");

                deadline.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                deadlineActionPerformed(evt);
                        }
                });

                choosefile.setBackground(new java.awt.Color(0, 153, 153));
                choosefile.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
                choosefile.setForeground(new java.awt.Color(255, 255, 255));
                choosefile.setText("Choose File");
                choosefile.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                choosefileActionPerformed(evt);
                        }
                });

                uploadButton.setBackground(new java.awt.Color(0, 102, 0));
                uploadButton.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
                uploadButton.setForeground(new java.awt.Color(255, 255, 255));
                uploadButton.setText("Upload");
                uploadButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                uploadButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addComponent(jPanel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                false)
                                                                                                                .addComponent(choosefile,
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                105,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel4,
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel1,
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel3,
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel5,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(filelocation,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                243,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addComponent(uploadButton,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE))
                                                                                                                .addComponent(deadline,
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jScrollPane1,
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(titleField,
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(assIdField,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                352,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(0, 0, Short.MAX_VALUE)))))));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jPanel2,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel3,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(35, 35, 35)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                29,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(assIdField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                29,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                25,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(titleField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                29,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                32,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                111,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(20, 20, 20)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel5,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(deadline,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(42, 42, 42)
                                                                .addGroup(jPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(choosefile,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                32,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(filelocation)
                                                                                .addComponent(uploadButton,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap(51, Short.MAX_VALUE)));

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

        private void assIdFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_assIdFieldActionPerformed

        }// GEN-LAST:event_assIdFieldActionPerformed

        private void titleFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_titleFieldActionPerformed

        }// GEN-LAST:event_titleFieldActionPerformed

        private void deadlineActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deadlineActionPerformed

        }// GEN-LAST:event_deadlineActionPerformed

        private void choosefileActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_choosefileActionPerformed
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) {
                        File selectedFile = fileChooser.getSelectedFile();
                        filelocation.setText(selectedFile.getAbsolutePath());
                }
        }// GEN-LAST:event_choosefileActionPerformed

        private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_uploadButtonActionPerformed
                try {
                        // Parse the input date
                        String dueDate = deadline.getText();
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                        Date parsedDate = dateFormat.parse(dueDate); // Parse the input text into a Date object

                        // Reformat the date for the database
                        SimpleDateFormat dbDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        String formattedDate = dbDateFormat.format(parsedDate);

                        // Get other input values
                        int assId = Integer.parseInt(assIdField.getText());
                        String title = titleField.getText();

                        // Create and add the assignment
                        Assignment assignment = new Assignment(assId, courseId, title, description.getText(),
                                        formattedDate,
                                        filelocation.getText());
                        AssignmentManagement assManag = new AssignmentManagement();
                        assManag.addAssignment(assignment);

                        JOptionPane.showMessageDialog(this, "Assignment added successfully.");
                        TeacherForm teachForm = new TeacherForm(currentTeacher);
                        teachForm.setVisible(true);
                        this.dispose();
                } catch (ParseException e) {
                        JOptionPane.showMessageDialog(this,
                                        "Invalid date format. Please enter the date in dd-MM-yyyy format.");
                } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Invalid assignment ID. Please enter a numeric value.");
                } catch (SQLException e) {
                        System.out.println("Unable to upload assignment: " + e.getMessage());
                        JOptionPane.showMessageDialog(this, "Error adding assignment.");
                }
        }// GEN-LAST:event_uploadButtonActionPerformed

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
                        java.util.logging.Logger.getLogger(UploadAssignmentForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(UploadAssignmentForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(UploadAssignmentForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(UploadAssignmentForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>

                java.awt.EventQueue.invokeLater(() -> {
                        new UploadAssignmentForm(teacherId, courseId, currentTeacher).setVisible(true);
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextField assIdField;
        private javax.swing.JLabel backLabel;
        private javax.swing.JButton choosefile;
        private javax.swing.JTextField deadline;
        private javax.swing.JTextArea description;
        private javax.swing.JTextField filelocation;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextField titleField;
        private javax.swing.JButton uploadButton;
        // End of variables declaration//GEN-END:variables
}
