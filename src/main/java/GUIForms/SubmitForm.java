package GUIForms;

import EntityClasses.Submission;
import ManagementClasses.*;
import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class SubmitForm extends javax.swing.JFrame {
        public static EntityClasses.Student loggedInUser;
        public static int assId;
        public static String assTitle;
        public static String assDes;
        private static int loggedInStudentID;

        public SubmitForm(String assTitle, String assDes, int loggedInStudentID, int assId,
                        EntityClasses.Student loggedInUser) {
                SubmitForm.assTitle = assTitle;
                SubmitForm.assDes = assDes;
                SubmitForm.loggedInStudentID = loggedInStudentID;
                SubmitForm.assId = assId;
                SubmitForm.loggedInUser = loggedInUser;

                initComponents();
                txtTitle.setText(SubmitForm.assTitle);
                txtDes.setLineWrap(true);
                txtDes.setWrapStyleWord(true);
                txtDes.setText(SubmitForm.assDes);
        }

        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                txtTitle = new javax.swing.JTextField();
                jScrollPane1 = new javax.swing.JScrollPane();
                txtDes = new javax.swing.JTextArea();
                chooseFile = new javax.swing.JButton();
                txtFilePath = new javax.swing.JTextField();
                btnSubmit = new javax.swing.JButton();
                jPanel2 = new javax.swing.JPanel();
                backLabel = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Assignment Submission");

                jPanel1.setBackground(new java.awt.Color(255, 255, 204));

                jLabel1.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
                jLabel1.setText("TITLE :");

                jLabel2.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
                jLabel2.setText("DESCRIPTION :");

                txtTitle.setEditable(false);
                txtTitle.setText(" ");
                txtTitle.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtTitleActionPerformed(evt);
                        }
                });

                txtDes.setEditable(false);
                txtDes.setColumns(20);
                txtDes.setRows(5);
                jScrollPane1.setViewportView(txtDes);

                chooseFile.setBackground(new java.awt.Color(0, 153, 153));
                chooseFile.setForeground(new java.awt.Color(255, 255, 255));
                chooseFile.setText("Choose File");
                chooseFile.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                chooseFileMouseClicked(evt);
                        }
                });
                chooseFile.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                chooseFileActionPerformed(evt);
                        }
                });

                txtFilePath.setEditable(false);
                txtFilePath.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtFilePathActionPerformed(evt);
                        }
                });

                btnSubmit.setBackground(new java.awt.Color(0, 102, 0));
                btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
                btnSubmit.setText("Submit");
                btnSubmit.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSubmitActionPerformed(evt);
                        }
                });

                jPanel2.setBackground(new java.awt.Color(0, 153, 153));

                backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back1.png"))); // NOI18N
                backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                backLabelMouseClicked(evt);
                        }
                });

                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setText("  Plagiarism is a ethical crime and those caught will be dealt with according to");

                jLabel5.setForeground(new java.awt.Color(255, 255, 255));
                jLabel5.setText("  university policy make sure your name and enrollment is on final solution");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(backLabel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                45,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel2Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                417,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel5,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(backLabel,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel4,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                24,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jLabel5,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                21,
                                                                                                                Short.MAX_VALUE)))
                                                                .addContainerGap()));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(29, 29, 29)
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(jLabel1,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                93,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(jLabel2)))
                                                                                                                .addComponent(chooseFile,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                93,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(txtTitle,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                312,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jScrollPane1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                312,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(txtFilePath,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                312,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(29, 29, 29)
                                                                                                .addComponent(btnSubmit,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                411,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jPanel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(47, 47, 47)
                                                                                                .addComponent(jLabel1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                28,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(txtTitle,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                31,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                125,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                28,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                19,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(txtFilePath,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(chooseFile,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnSubmit,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                31,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));

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
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void chooseFileActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_chooseFileActionPerformed

        }// GEN-LAST:event_chooseFileActionPerformed

        private void txtFilePathActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtFilePathActionPerformed

        }// GEN-LAST:event_txtFilePathActionPerformed

        private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSubmitActionPerformed
                SubmissionManagement subManag = new SubmissionManagement();
                String filePath = txtFilePath.getText();
                String submissionDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

                Submission submission = new Submission(null, assId, loggedInStudentID, submissionDate, filePath, null);
                if (!filePath.isEmpty()) {
                        try {
                                subManag.submitAssignment(submission);
                                // updateSubmissionTable();
                                JOptionPane.showMessageDialog(this, "Assignment submitted successfully!");

                                // Reopen the previous StudentForm
                                StudentForm studentForm = new StudentForm(loggedInUser);
                                studentForm.setVisible(true);
                                this.dispose();
                        } catch (SQLException ex) {
                                System.out.println("Error while submitting assignment " + ex.getMessage());
                                JOptionPane.showMessageDialog(this, "Error submitting assignment.");
                        }
                } else {
                        JOptionPane.showMessageDialog(null, "Please Choose a File.", "Submission Failed",
                                        JOptionPane.ERROR_MESSAGE);
                }

        }// GEN-LAST:event_btnSubmitActionPerformed

        private void txtTitleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtTitleActionPerformed

        }// GEN-LAST:event_txtTitleActionPerformed

        private void chooseFileMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_chooseFileMouseClicked
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) {
                        File selectedFile = fileChooser.getSelectedFile();
                        txtFilePath.setText(selectedFile.getAbsolutePath());
                }
        }// GEN-LAST:event_chooseFileMouseClicked

        private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_backLabelMouseClicked
                StudentForm v = new StudentForm(loggedInUser);
                v.setVisible(true);
                this.dispose();
        }// GEN-LAST:event_backLabelMouseClicked

        public static int loggedInStudentID() {
                return loggedInStudentID;
        }

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
                        java.util.logging.Logger.getLogger(SubmitForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(SubmitForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(SubmitForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(SubmitForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }
                // </editor-fold>
                java.awt.EventQueue.invokeLater(() -> {
                        new SubmitForm(assTitle, assDes, loggedInStudentID, assId, loggedInUser).setVisible(true);
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel backLabel;
        private javax.swing.JButton btnSubmit;
        private javax.swing.JButton chooseFile;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextArea txtDes;
        private javax.swing.JTextField txtFilePath;
        private javax.swing.JTextField txtTitle;
        // End of variables declaration//GEN-END:variables
}
