package GUIForms;

import EntityClasses.*;
import ManagementClasses.*;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TeacherForm extends javax.swing.JFrame {
        public static EntityClasses.Teacher currentTeacher;
        private TeacherManagement teachService = new TeacherManagement();
        private int teachId;

        public TeacherForm(EntityClasses.Teacher teacher) {
                currentTeacher = teacher;
                try {
                        teachId = teachService.getTeacherIdByUserId(teacher.getUserId());
                } catch (SQLException e) {
                        System.out.println("COuldn't get teacher Id bu user Id" + e.getMessage());
                }

                initComponents();
                CourseManagement courseManager = new CourseManagement();
                try {
                        List<Course> courses = courseManager.getCoursesTeacher(teachId);
                        cbCourse.removeAllItems();
                        for (Course course : courses) {
                                cbCourse.addItem(course);
                        }
                        if (!courses.isEmpty()) {
                                cbCourse.setSelectedIndex(0);
                                loadAssignments();
                        }
                } catch (SQLException ex) {
                        System.out.println("Couldn't List Courses Taught By Teacher");
                        Logger.getLogger(TeacherForm.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel2 = new javax.swing.JPanel();
                btnGradeAssignment = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                tblAssignments = new javax.swing.JTable();
                jScrollPane2 = new javax.swing.JScrollPane();
                tblSubmisssions = new javax.swing.JTable();
                jPanel4 = new javax.swing.JPanel();
                jPanel5 = new javax.swing.JPanel();
                cbCourse = new javax.swing.JComboBox<>();
                jLabel2 = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                jPanel3 = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                jPanel9 = new javax.swing.JPanel();
                jLabel6 = new javax.swing.JLabel();
                jPanel6 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                btnUpload = new javax.swing.JButton();
                btnViewSubmittedAssignment = new javax.swing.JButton();
                btnDeleteAssignment = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Teacher DashBoard");
                setBackground(new java.awt.Color(255, 255, 255));

                jPanel2.setBackground(new java.awt.Color(255, 255, 255));
                jPanel2.setForeground(new java.awt.Color(255, 255, 255));

                btnGradeAssignment.setBackground(new java.awt.Color(102, 255, 255));
                btnGradeAssignment.setForeground(new java.awt.Color(255, 255, 255));
                btnGradeAssignment.setText("Grade Assignment");
                btnGradeAssignment.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnGradeAssignmentActionPerformed(evt);
                        }
                });

                tblAssignments.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null, null, null },
                                                { null, null, null, null, null },
                                                { null, null, null, null, null },
                                                { null, null, null, null, null }
                                },
                                new String[] {
                                                "ID", "Title", "Description", "DueDate", "File Path"
                                }));
                jScrollPane1.setViewportView(tblAssignments);

                tblSubmisssions.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null, null, null },
                                                { null, null, null, null, null },
                                                { null, null, null, null, null },
                                                { null, null, null, null, null }
                                },
                                new String[] {
                                                "ID", "Student ID", "Submision Date", "File PAth", "Grade"
                                }));
                jScrollPane2.setViewportView(tblSubmisssions);

                jPanel4.setBackground(new java.awt.Color(0, 102, 153));
                jPanel4.setForeground(new java.awt.Color(255, 255, 255));

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 75, Short.MAX_VALUE));
                jPanel4Layout.setVerticalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 499, Short.MAX_VALUE));

                jPanel5.setBackground(new java.awt.Color(255, 51, 51));
                jPanel5.setForeground(new java.awt.Color(255, 255, 255));

                cbCourse.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                cbCourse.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbCourseActionPerformed(evt);
                        }
                });

                jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel2.setText("Select Course :");

                javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(
                                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addGap(50, 50, 50)
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(cbCourse,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                126,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel5Layout.setVerticalGroup(
                                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(cbCourse))
                                                                .addContainerGap()));

                jPanel3.setBackground(new java.awt.Color(255, 51, 51));
                jPanel3.setForeground(new java.awt.Color(255, 255, 255));

                jLabel3.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
                jLabel3.setText("Teacher DashBoard");

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel3Layout.createSequentialGroup()
                                                                                .addContainerGap(418, Short.MAX_VALUE)
                                                                                .addComponent(jLabel3)
                                                                                .addGap(381, 381, 381)));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(37, 37, 37)
                                                                .addComponent(jLabel3)
                                                                .addContainerGap(39, Short.MAX_VALUE)));

                jPanel9.setBackground(new java.awt.Color(0, 102, 153));

                jLabel6.setBackground(new java.awt.Color(51, 204, 255));
                jLabel6.setForeground(new java.awt.Color(255, 255, 255));
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back1.png"))); // NOI18N
                jLabel6.setText(" ");
                jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jLabel6MouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
                jPanel9.setLayout(jPanel9Layout);
                jPanel9Layout.setHorizontalGroup(
                                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(16, Short.MAX_VALUE)
                                                                .addComponent(jLabel6,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                54,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));
                jPanel9Layout.setVerticalGroup(
                                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel9Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel6,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addComponent(jPanel9,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                jPanel6.setForeground(new java.awt.Color(255, 255, 255));

                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel1.setText("ASSIGNMENTS");

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addGap(108, 108, 108)
                                                                .addComponent(jLabel1)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel6Layout.setVerticalGroup(
                                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel1)
                                                                .addContainerGap()));

                btnUpload.setBackground(new java.awt.Color(51, 204, 0));
                btnUpload.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                btnUpload.setForeground(new java.awt.Color(255, 255, 255));
                btnUpload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add2.png"))); // NOI18N
                btnUpload.setText("Upload Assignment");
                btnUpload.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnUploadActionPerformed(evt);
                        }
                });

                btnViewSubmittedAssignment.setBackground(new java.awt.Color(255, 102, 102));
                btnViewSubmittedAssignment.setForeground(new java.awt.Color(255, 255, 255));
                btnViewSubmittedAssignment.setText("View Assignment");
                btnViewSubmittedAssignment.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnViewSubmittedAssignmentActionPerformed(evt);
                        }
                });

                btnDeleteAssignment.setBackground(new java.awt.Color(204, 0, 51));
                btnDeleteAssignment.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                btnDeleteAssignment.setForeground(new java.awt.Color(255, 255, 255));
                btnDeleteAssignment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
                btnDeleteAssignment.setText("Delete Assignment");
                btnDeleteAssignment.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnDeleteAssignmentActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jPanel4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel5,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel6,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jScrollPane1)
                                                                                                                .addGroup(jPanel2Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(btnUpload)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addComponent(btnDeleteAssignment)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addComponent(btnViewSubmittedAssignment,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                168,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                                                .addComponent(btnGradeAssignment,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addGap(47, 47, 47)
                                                                                                .addComponent(jScrollPane2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                535,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap()));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jPanel5,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jPanel6,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(49, 49, 49)
                                                                                                .addGroup(jPanel2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(jScrollPane1,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                180,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jScrollPane2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                0,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addGap(63, 63, 63)
                                                                                                .addGroup(jPanel2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(btnUpload,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                41,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(btnDeleteAssignment,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                42,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(btnViewSubmittedAssignment,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                41,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(21, 21, 21)
                                                                                                .addComponent(btnGradeAssignment,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                41,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jPanel4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(2, 2, 2)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void cbCourseActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbCourseActionPerformed
                // Method to Load Assignments as soon as Teacher Selects a Course
                loadAssignments();
        }// GEN-LAST:event_cbCourseActionPerformed

        private void btnDeleteAssignmentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDeleteAssignmentActionPerformed
                // Method to delete an Assignment
                AssignmentManagement assignmentManager = new AssignmentManagement();
                int selectedRow = tblAssignments.getSelectedRow();
                if (selectedRow >= 0) {
                        try {
                                int assignmentId = (int) tblAssignments.getValueAt(selectedRow, 0);
                                assignmentManager.deleteAssignment(assignmentId);
                                // Refresh assignments table
                                loadAssignments();
                        } catch (SQLException ex) {
                                System.out.println("Could'nt delete assignment" + ex.getMessage());
                        }
                } else {
                        JOptionPane.showMessageDialog(this, "Please select an assignment to delete.");
                }
        }// GEN-LAST:event_btnDeleteAssignmentActionPerformed

        private void btnViewSubmittedAssignmentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnViewSubmittedAssignmentActionPerformed
                // Method to list submissions for selected Course
                SubmissionManagement submissionManager = new SubmissionManagement();
                DefaultTableModel model = new DefaultTableModel(
                                new String[] { "ID", "Student ID", "Submission Date", "File Path", "Grade" }, 0);

                int selectedRow = tblAssignments.getSelectedRow();
                if (selectedRow >= 0) {
                        int assignmentId = (int) tblAssignments.getValueAt(selectedRow, 0);
                        List<Submission> submissions;
                        try {
                                submissions = submissionManager.getStudentSubmissions(assignmentId);
                                model.setRowCount(0);
                                for (Submission submission : submissions) {
                                        model.addRow(new Object[] {
                                                        submission.getSubmissionId(),
                                                        submission.getStudentId(),
                                                        submission.getSubmissionDate(),
                                                        submission.getFilePath(),
                                                        submission.getGrade()
                                        });
                                }
                                tblSubmisssions.setModel(model);
                        } catch (SQLException e) {
                                System.out.println("Couldn't load submissions for this assignment" + e.getMessage());
                                JOptionPane.showMessageDialog(this, "Error fetching submissions.");
                        }
                } else {
                        JOptionPane.showMessageDialog(this, "Please select an assignment to view submissions.");
                }
        }// GEN-LAST:event_btnViewSubmittedAssignmentActionPerformed

        private void btnGradeAssignmentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnGradeAssignmentActionPerformed
                // Method to grade an assignment through Grade button
                try {
                        int selectedRow = tblSubmisssions.getSelectedRow();
                        if (selectedRow >= 0) {
                                int submissionId = (int) tblSubmisssions.getValueAt(selectedRow, 0);
                                String grade = JOptionPane.showInputDialog(this, "Enter grade:");
                                if (grade != null && !grade.trim().isEmpty()) {
                                        SubmissionManagement submissionManager = new SubmissionManagement();
                                        submissionManager.gradeSubmission(submissionId, grade);
                                        JOptionPane.showMessageDialog(this, "Submission graded successfully.");
                                        viewSubmittedAssignments(); // Refresh the table
                                } else {
                                        JOptionPane.showMessageDialog(this, "Please enter a valid grade.");
                                }
                        } else {
                                JOptionPane.showMessageDialog(this, "Please select a submission to grade.");
                        }
                } catch (SQLException e) {
                        System.out.println("Couldn't grade submission" + e.getMessage());
                        JOptionPane.showMessageDialog(this, "Error grading submission.");
                }
        }// GEN-LAST:event_btnGradeAssignmentActionPerformed

        private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnUploadActionPerformed
                // Method to upload an assignment through Upload button
                Course selectedCourse = (Course) cbCourse.getSelectedItem();
                if (selectedCourse != null) {
                        int courseId = selectedCourse.getCourseId();
                        UploadAssignmentForm uploadForm = new UploadAssignmentForm(teachId, courseId, currentTeacher);
                        uploadForm.setVisible(true);
                        this.dispose();
                }
        }// GEN-LAST:event_btnUploadActionPerformed

        private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel6MouseClicked
                // Method to define the logic of back button
                SignIn signIn = new SignIn();
                signIn.setVisible(true);
                this.dispose();
        }// GEN-LAST:event_jLabel6MouseClicked

        // Method To load Assignments in assignments Table for a selected course
        private void loadAssignments() {
                Course selectedCourse = (Course) cbCourse.getSelectedItem();
                if (selectedCourse != null) {
                        try {
                                CourseManagement courseManager = new CourseManagement();
                                List<Assignment> assignments = courseManager.getAssignmentsForCourse(selectedCourse);
                                DefaultTableModel tableModel = (DefaultTableModel) tblAssignments.getModel();
                                tableModel.setRowCount(0);
                                for (Assignment assignment : assignments) {
                                        tableModel.addRow(new Object[] {
                                                        assignment.getAssignmentId(),
                                                        assignment.getTitle(),
                                                        assignment.getDescription(),
                                                        assignment.getDeadline(),
                                                        assignment.getFilePath()
                                        });
                                }
                        } catch (SQLException ex) {
                                Logger.getLogger(StudentForm.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
        }

        // Method to load Submissions in submissions Table for a Selected Course
        private void viewSubmittedAssignments() {
                try {
                        int selectedRow = tblAssignments.getSelectedRow();

                        if (selectedRow >= 0) {
                                int assignmentId = (int) tblAssignments.getValueAt(selectedRow, 0);
                                SubmissionManagement submissionManager = new SubmissionManagement();
                                List<Submission> submissions = submissionManager.getStudentSubmissions(assignmentId);
                                DefaultTableModel model = new DefaultTableModel(
                                                new String[] { "Submission ID", "Student ID", "Submission Date",
                                                                "File Path", "Grade" },
                                                0);
                                for (Submission s : submissions) {
                                        model.addRow(new Object[] { s.getSubmissionId(), s.getStudentId(),
                                                        s.getSubmissionDate(),
                                                        s.getFilePath(), s.getGrade() });
                                }
                                tblSubmisssions.setModel(model);
                        } else {
                                JOptionPane.showMessageDialog(this, "Please select an assignment to view submissions.");
                        }
                } catch (SQLException e) {
                        System.out.println("Failed to load submissions in Teacher Form" + e.getMessage());
                        JOptionPane.showMessageDialog(this, "Error loading submissions.");
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
                        java.util.logging.Logger.getLogger(TeacherForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(TeacherForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(TeacherForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(TeacherForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }
                // </editor-fold>
                java.awt.EventQueue.invokeLater(() -> {
                        new TeacherForm(currentTeacher).setVisible(true);
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnDeleteAssignment;
        private javax.swing.JButton btnGradeAssignment;
        private javax.swing.JButton btnUpload;
        private javax.swing.JButton btnViewSubmittedAssignment;
        private javax.swing.JComboBox<Object> cbCourse;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel9;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JTable tblAssignments;
        private javax.swing.JTable tblSubmisssions;
        // End of variables declaration//GEN-END:variables
}
