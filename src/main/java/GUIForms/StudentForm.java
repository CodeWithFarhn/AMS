package GUIForms;

import EntityClasses.Assignment;
import EntityClasses.Course;
import EntityClasses.Grade;
import EntityClasses.Submission;
import ManagementClasses.*;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StudentForm extends javax.swing.JFrame {
        private StudentManagement stdService = new StudentManagement();
        public static EntityClasses.Student loggedInStudent;
        private int stdId;
        List<Course> registeredCourses = new ArrayList<>();

        public StudentForm(EntityClasses.Student student) {
                loggedInStudent = student;

                try {
                        // Logic to get courses, logic moved out of Management constructor previously
                        // We can get courses directly from the student object if loaded
                        // But if we need fresh data from DB, we invoke service
                        stdId = stdService.getStudentIdByUserId(student.getUserId());

                        // registeredCourses = stdService.getRegisteredCourses(stdId);
                        // The student object passed in *should* have courses if loaded by Auth
                        registeredCourses = student.getRegisteredCourses();
                        if (registeredCourses == null)
                                registeredCourses = new ArrayList<>();

                        if (registeredCourses.isEmpty()) {
                                JOptionPane.showMessageDialog(this, "No Courses registred For Student",
                                                "Nothing to show",
                                                JOptionPane.WARNING_MESSAGE);
                        }
                        initComponents();
                        selectCourse.removeAllItems();
                        for (Course course : registeredCourses) {
                                selectCourse.addItem(course);
                        }
                } catch (SQLException e) {
                        System.out.println("Error while fetching std Id from user Id." + e.getMessage());
                        Logger.getLogger(StudentForm.class.getName()).log(Level.SEVERE, null, e);
                }
                UpdateSubmitAssignment();
                updateCurrentTime();
        }

        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel3 = new javax.swing.JPanel();
                jPanel13 = new javax.swing.JPanel();
                jLabel10 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                tableAss = new javax.swing.JTable();
                deleteButton = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                jPanel6 = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                selectCourse = new javax.swing.JComboBox<>();
                jPanel7 = new javax.swing.JPanel();
                lblCurrentTime = new javax.swing.JLabel();
                jPanel5 = new javax.swing.JPanel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jScrollPane4 = new javax.swing.JScrollPane();
                tableSubmission1 = new javax.swing.JTable();
                viewGrade = new javax.swing.JButton();
                uploadButton = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel3.setBackground(new java.awt.Color(0, 102, 153));
                jPanel3.setForeground(new java.awt.Color(255, 255, 255));

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 532, Short.MAX_VALUE));

                jPanel13.setBackground(new java.awt.Color(0, 102, 153));

                jLabel10.setBackground(new java.awt.Color(51, 204, 255));
                jLabel10.setForeground(new java.awt.Color(255, 255, 255));
                jLabel10.setText(" ");
                jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jLabel10MouseClicked(evt);
                        }
                });

                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back1.png"))); // NOI18N
                jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jLabel6MouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
                jPanel13.setLayout(jPanel13Layout);
                jPanel13Layout.setHorizontalGroup(
                                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel13Layout.createSequentialGroup()
                                                                .addGroup(jPanel13Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel13Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(20, 20, 20)
                                                                                                .addComponent(jLabel10))
                                                                                .addGroup(jPanel13Layout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(jLabel6,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                52,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(15, Short.MAX_VALUE)));
                jPanel13Layout.setVerticalGroup(
                                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel6,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                28,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel10)
                                                                .addGap(33, 33, 33)));

                jPanel1.setBackground(new java.awt.Color(255, 204, 0));
                jPanel1.setForeground(new java.awt.Color(255, 255, 255));

                jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
                jLabel1.setText("Student DashBoard");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(538, 538, 538)
                                                                .addComponent(jLabel1)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(28, 28, 28)
                                                                .addComponent(jLabel1)
                                                                .addContainerGap(47, Short.MAX_VALUE)));

                jPanel2.setBackground(new java.awt.Color(255, 255, 255));
                jPanel2.setForeground(new java.awt.Color(255, 255, 255));

                tableAss.setForeground(new java.awt.Color(51, 204, 255));
                tableAss.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null, null, null },
                                                { null, null, null, null, null },
                                                { null, null, null, null, null },
                                                { null, null, null, null, null },
                                                { null, null, null, null, null },
                                                { null, null, null, null, null },
                                                { null, null, null, null, null },
                                                { null, null, null, null, null },
                                                { null, null, null, null, null }
                                },
                                new String[] {
                                                "Assignmetn iD", "Title", "Description", "DueDate", "FilePath"
                                }) {
                        Class<?>[] types = new Class<?>[] {
                                        java.lang.Integer.class, java.lang.String.class, java.lang.String.class,
                                        java.lang.Integer.class,
                                        java.lang.Object.class
                        };
                        boolean[] canEdit = new boolean[] {
                                        false, false, false, false, false
                        };

                        public Class<?> getColumnClass(int columnIndex) {
                                return types[columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit[columnIndex];
                        }
                });
                tableAss.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tableAssMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(tableAss);

                deleteButton.setBackground(new java.awt.Color(204, 0, 0));
                deleteButton.setForeground(new java.awt.Color(255, 255, 255));
                deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
                deleteButton.setText("Delete");
                deleteButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                deleteButtonActionPerformed(evt);
                        }
                });

                jLabel3.setBackground(new java.awt.Color(255, 255, 255));
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText("  ");

                jPanel6.setBackground(new java.awt.Color(255, 204, 0));
                jPanel6.setForeground(new java.awt.Color(255, 255, 255));

                jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                jLabel2.setText("Select Course:");

                selectCourse.setBackground(new java.awt.Color(51, 255, 204));
                selectCourse.setForeground(new java.awt.Color(255, 255, 255));
                selectCourse.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                selectCourse.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                selectCourseActionPerformed(evt);
                        }
                });

                jPanel7.setBackground(new java.awt.Color(0, 102, 51));
                jPanel7.setBorder(javax.swing.BorderFactory.createCompoundBorder());
                jPanel7.setForeground(new java.awt.Color(255, 255, 255));

                lblCurrentTime.setBackground(new java.awt.Color(0, 102, 102));
                lblCurrentTime.setForeground(new java.awt.Color(255, 255, 255));
                lblCurrentTime.setText("   ");

                javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                jPanel7.setLayout(jPanel7Layout);
                jPanel7Layout.setHorizontalGroup(
                                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                                .addGap(24, 24, 24)
                                                                .addComponent(lblCurrentTime,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                61,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(25, Short.MAX_VALUE)));
                jPanel7Layout.setVerticalGroup(
                                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblCurrentTime,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 23,
                                                                Short.MAX_VALUE));

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addGap(54, 54, 54)
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(selectCourse,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                171,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jPanel7,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(174, 174, 174)));
                jPanel6Layout.setVerticalGroup(
                                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel7,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(jPanel6Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                23,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(selectCourse,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                jPanel5.setBackground(new java.awt.Color(204, 204, 204));
                jPanel5.setForeground(new java.awt.Color(255, 255, 255));

                jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
                jLabel4.setText("ASSIGNMENTS");

                jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
                jLabel5.setText("SUBMISSIONS");

                javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(
                                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addGap(246, 246, 246)
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel5)
                                                                .addGap(278, 278, 278)));
                jPanel5Layout.setVerticalGroup(
                                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                19,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap()));

                tableSubmission1.setForeground(new java.awt.Color(0, 204, 255));
                tableSubmission1.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null, null, null },
                                                { null, null, null, null, null },
                                                { null, null, null, null, null },
                                                { null, null, null, null, null }
                                },
                                new String[] {
                                                "SubID", "Assignment ID", "Std ID", "Date", "FilePath"
                                }));
                tableSubmission1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tableSubmission1MouseClicked(evt);
                        }
                });
                jScrollPane4.setViewportView(tableSubmission1);

                viewGrade.setBackground(new java.awt.Color(255, 255, 204));
                viewGrade.setForeground(new java.awt.Color(0, 153, 153));
                viewGrade.setText("View Grade");
                viewGrade.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                viewGradeActionPerformed(evt);
                        }
                });

                uploadButton.setBackground(new java.awt.Color(0, 153, 0));
                uploadButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                uploadButton.setForeground(new java.awt.Color(255, 255, 255));
                uploadButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add2.png"))); // NOI18N
                uploadButton.setText("Upload");
                uploadButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                uploadButtonMouseClicked(evt);
                        }
                });
                uploadButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                uploadButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                50,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addContainerGap(
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(uploadButton,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                128,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(43, 43, 43)
                                                                                                .addComponent(deleteButton,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                123,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(41, 41, 41)
                                                                                                .addComponent(viewGrade,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                112,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(8, 8, 8)
                                                                                                .addComponent(jScrollPane1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                626,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                101,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jScrollPane4,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                662,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(14, 14, 14))))
                                                .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
                                                                .createSequentialGroup()
                                                                .addComponent(jPanel6,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(36, 36, 36)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jScrollPane4,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                227,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                0,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(25, 25, 25)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(uploadButton,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                41,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(deleteButton,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                41,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(viewGrade,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                41,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(108, 108, 108)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel13,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel3,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                                                                                Short.MAX_VALUE))));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jPanel1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel13,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel3,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel2,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void tableAssMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tableAssMouseClicked
                updateCurrentTime();
        }// GEN-LAST:event_tableAssMouseClicked

        private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteButtonActionPerformed
                // Method to implement Delete Button Logic
                SubmissionManagement submissionManager = new SubmissionManagement();
                int selectedRow = tableSubmission1.getSelectedRow();
                if (selectedRow != -1) {
                        int submissionId = (int) tableSubmission1.getValueAt(selectedRow, 0);

                        try {
                                submissionManager.deleteSubmission(submissionId);
                                JOptionPane.showMessageDialog(this, "Submission deleted successfully!");
                        } catch (SQLException ex) {
                                System.out.println(
                                                "Could not delete submission using deleteSubmission method from CourseManag"
                                                                + ex.getMessage());
                                JOptionPane.showMessageDialog(this, "Error deleting submission.");
                        }
                        UpdateSubmitAssignment();
                } else {
                        JOptionPane.showMessageDialog(this, "Please select a submission", "No Submission Selected",
                                        JOptionPane.WARNING_MESSAGE);
                }
        }// GEN-LAST:event_deleteButtonActionPerformed

        private void selectCourseActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_selectCourseActionPerformed
                // Method to Display Asignments by course selected
                Course selectedCourse = (Course) selectCourse.getSelectedItem();
                if (selectedCourse != null) {
                        try {
                                CourseManagement courseManag = new CourseManagement();
                                List<Assignment> assignments = courseManag.getAssignmentsForCourse(selectedCourse);
                                DefaultTableModel tableModel = (DefaultTableModel) tableAss.getModel();
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
                                System.out.println("Couldn't load assignments from getAssignmentsFromCourse method"
                                                + ex.getMessage());
                                Logger.getLogger(StudentForm.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
                updateCurrentTime();
        }// GEN-LAST:event_selectCourseActionPerformed

        private void tableSubmission1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tableSubmission1MouseClicked

        }// GEN-LAST:event_tableSubmission1MouseClicked

        private void viewGradeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_viewGradeActionPerformed

                int selectedRow = tableSubmission1.getSelectedRow();
                if (selectedRow != -1) {
                        SubmissionManagement subManag = new SubmissionManagement();
                        int subId = (int) tableSubmission1.getValueAt(selectedRow, 0);
                        try {
                                Grade grade = subManag.getGrade(subId);
                                if (grade != null) {
                                        JOptionPane.showMessageDialog(this, "Grade: " + grade, "Submission Grade",
                                                        JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                        JOptionPane.showMessageDialog(this, "Grade not found", "No Grade",
                                                        JOptionPane.WARNING_MESSAGE);
                                }
                        } catch (SQLException ex) {
                                System.out.println("Couldn't show grade using getGrade method from Sub Manag"
                                                + ex.getMessage());
                                Logger.getLogger(StudentForm.class.getName()).log(Level.SEVERE, null, ex);
                                JOptionPane.showMessageDialog(this, "Error retrieving grade", "Error",
                                                JOptionPane.ERROR_MESSAGE);
                        }
                } else {
                        JOptionPane.showMessageDialog(this, "Please select a submission", "No Submission Selected",
                                        JOptionPane.WARNING_MESSAGE);
                }
        }// GEN-LAST:event_viewGradeActionPerformed

        private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_uploadButtonActionPerformed

        }// GEN-LAST:event_uploadButtonActionPerformed

        private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel10MouseClicked

        }// GEN-LAST:event_jLabel10MouseClicked

        private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel6MouseClicked
                // Back button Action code.
                SignIn signIn = new SignIn();
                signIn.setVisible(true);
                this.dispose();
        }// GEN-LAST:event_jLabel6MouseClicked

        private void uploadButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_uploadButtonMouseClicked
                try {
                        int selectedRow = tableAss.getSelectedRow();
                        if (selectedRow != -1) {
                                int assId = (int) tableAss.getValueAt(selectedRow, 0);
                                String assTitle = (String) tableAss.getValueAt(selectedRow, 1);
                                String assDes = (String) tableAss.getValueAt(selectedRow, 2);
                                int loggedInStudentID = stdId;

                                SubmitForm submitForm = new SubmitForm(assTitle, assDes, loggedInStudentID, assId,
                                                loggedInStudent);
                                submitForm.setVisible(true);
                                this.setVisible(false);
                        } else {
                                JOptionPane.showMessageDialog(this, "Please select an Assignment",
                                                "No Assignment Selected",
                                                JOptionPane.WARNING_MESSAGE);
                        }
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Error opening Submit Form: " + e.getMessage(), "Error",
                                        JOptionPane.ERROR_MESSAGE);
                }
        }// GEN-LAST:event_uploadButtonMouseClicked

        // Method to get all the assignments submitted by the student and display them.
        private void UpdateSubmitAssignment() {
                SubmissionManagement submissionManager = new SubmissionManagement();
                try {
                        List<Submission> submissions = submissionManager.getSubmissionsByStudent(stdId);
                        DefaultTableModel tableModel = (DefaultTableModel) tableSubmission1.getModel();
                        tableModel.setRowCount(0);
                        for (Submission submission : submissions) {
                                tableModel.addRow(new Object[] {
                                                submission.getSubmissionId(),
                                                submission.getAssignmentId(),
                                                submission.getStudentId(),
                                                submission.getSubmissionDate(),
                                                submission.getFilePath()
                                });
                        }
                } catch (SQLException e) {
                        System.out.println("Error loading submissions by students in StudentForm" + e.getMessage());
                }
        }

        // Method to display Current Time
        private String getCurrentTime() {
                LocalDateTime now = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
                return now.format(formatter);
        }

        // Method to update Time
        private void updateCurrentTime() {
                String currentTime = getCurrentTime();
                lblCurrentTime.setText(currentTime);
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
                        java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }
                // </editor-fold>
                // </editor-fold>

                java.awt.EventQueue.invokeLater(() -> {
                        new StudentForm(loggedInStudent).setVisible(true);
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton deleteButton;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel13;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane4;
        private javax.swing.JLabel lblCurrentTime;
        private javax.swing.JComboBox<Object> selectCourse;
        private javax.swing.JTable tableAss;
        private javax.swing.JTable tableSubmission1;
        private javax.swing.JButton uploadButton;
        private javax.swing.JButton viewGrade;
        // End of variables declaration//GEN-END:variables
}
