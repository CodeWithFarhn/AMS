package GUIForms;

import EntityClasses.Course;
import EntityClasses.User;
import ManagementClasses.StudentManagement;
import ManagementClasses.TeacherManagement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminForm extends javax.swing.JFrame {
        private static EntityClasses.Admin admin;
        private List<Course> selectedCourses = new ArrayList<>();

        public AdminForm(EntityClasses.Admin admin) {
                AdminForm.admin = admin;
                initComponents();
                populateStudentTable();
                populateTeacherTable();
        }

        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                password = new javax.swing.JTextField();
                username = new javax.swing.JTextField();
                addButton = new javax.swing.JButton();
                jPanel2 = new javax.swing.JPanel();
                jLabel14 = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                jPanel9 = new javax.swing.JPanel();
                backLabel = new javax.swing.JLabel();
                jPanel7 = new javax.swing.JPanel();
                jPanel4 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                rolelist = new javax.swing.JComboBox<>();
                jPanel5 = new javax.swing.JPanel();
                jLabel5 = new javax.swing.JLabel();
                Removebtn = new javax.swing.JButton();
                updateButton = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                students = new javax.swing.JTable();
                jScrollPane2 = new javax.swing.JScrollPane();
                teachers = new javax.swing.JTable();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                manageCoursesButton = new javax.swing.JButton();
                jPanel6 = new javax.swing.JPanel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                selectCourses = new javax.swing.JButton();
                emailField = new javax.swing.JTextField();
                jLabel6 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("ADMIN");

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setForeground(new java.awt.Color(255, 255, 255));

                username.setText(" ");
                username.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                usernameActionPerformed(evt);
                        }
                });

                addButton.setBackground(new java.awt.Color(51, 204, 0));
                addButton.setForeground(new java.awt.Color(255, 255, 255));
                addButton.setText("ADD");
                addButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addButtonActionPerformed(evt);
                        }
                });

                jPanel2.setBackground(new java.awt.Color(102, 204, 255));
                jPanel2.setForeground(new java.awt.Color(255, 255, 255));

                jLabel14.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
                jLabel14.setForeground(new java.awt.Color(255, 255, 255));
                jLabel14.setText("ADMIN OPERATIONS");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(366, 366, 366)
                                                                .addComponent(jLabel14)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(26, 26, 26)
                                                                .addComponent(jLabel14)
                                                                .addContainerGap(21, Short.MAX_VALUE)));

                jPanel9.setBackground(new java.awt.Color(0, 102, 153));

                backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back1.png"))); // NOI18N
                backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                backLabelMouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
                jPanel9.setLayout(jPanel9Layout);
                jPanel9Layout.setHorizontalGroup(
                                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel9Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(backLabel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(35, Short.MAX_VALUE)));
                jPanel9Layout.setVerticalGroup(
                                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel9Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(backLabel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                58,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(8, Short.MAX_VALUE)));

                jPanel7.setBackground(new java.awt.Color(0, 102, 153));

                javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                jPanel7.setLayout(jPanel7Layout);
                jPanel7Layout.setHorizontalGroup(
                                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));
                jPanel7Layout.setVerticalGroup(
                                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jPanel9,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel7,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                jPanel4.setBackground(new java.awt.Color(102, 204, 255));
                jPanel4.setForeground(new java.awt.Color(255, 255, 255));

                jLabel1.setFont(new java.awt.Font("Cambria", 3, 14));
                jLabel1.setText("Role :");

                rolelist.setModel(
                                new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Teacher", "Student" }));
                rolelist.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                rolelistActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGap(52, 52, 52)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                72,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(rolelist,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                152,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel4Layout.setVerticalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel4Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(rolelist))
                                                                .addGap(0, 8, Short.MAX_VALUE)));

                jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
                jLabel5.setText("STUDENT AND TEACHER MANAGEMENT");

                javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(
                                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addGap(345, 345, 345)
                                                                .addComponent(jLabel5)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel5Layout.setVerticalGroup(
                                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                17,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                Removebtn.setBackground(new java.awt.Color(255, 51, 102));
                Removebtn.setForeground(new java.awt.Color(255, 255, 255));
                Removebtn.setText("REMOVE");
                Removebtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                RemovebtnActionPerformed(evt);
                        }
                });

                updateButton.setBackground(new java.awt.Color(0, 153, 255));
                updateButton.setForeground(new java.awt.Color(255, 255, 255));
                updateButton.setText("UPDATE");
                updateButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                updateButtonActionPerformed(evt);
                        }
                });

                students.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null },
                                                { null, null, null },
                                                { null, null, null },
                                                { null, null, null }
                                },
                                new String[] {
                                                "STUDENT ID", "NAME", "PASSWORD"
                                }));
                students.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                studentsMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(students);

                teachers.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null },
                                                { null, null, null },
                                                { null, null, null },
                                                { null, null, null }
                                },
                                new String[] {
                                                "Teacher ID", "NAME", "PASSWORD"
                                }));
                teachers.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                teachersMouseClicked(evt);
                        }
                });
                jScrollPane2.setViewportView(teachers);

                jLabel3.setFont(new java.awt.Font("Cambria", 3, 14));
                jLabel3.setText("Name");

                jLabel4.setFont(new java.awt.Font("Cambria", 3, 14));
                jLabel4.setText("Password");

                manageCoursesButton.setBackground(new java.awt.Color(153, 153, 255));
                manageCoursesButton.setForeground(new java.awt.Color(255, 255, 255));
                manageCoursesButton.setText("Manage Courses");
                manageCoursesButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                manageCoursesButtonActionPerformed(evt);
                        }
                });

                jLabel7.setFont(new java.awt.Font("Cambria", 3, 14));
                jLabel7.setText("Registered Students");

                jLabel8.setFont(new java.awt.Font("Cambria", 3, 14));
                jLabel8.setText("Registered Teachers");

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addGap(156, 156, 156)
                                                                .addComponent(jLabel7,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                141,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel8,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                138,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(147, 147, 147)));
                jPanel6Layout.setVerticalGroup(
                                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel7,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel8,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)));

                jLabel2.setFont(new java.awt.Font("Cambria", 3, 14));
                jLabel2.setText("Select Courses");

                selectCourses.setBackground(new java.awt.Color(245, 245, 245));
                selectCourses.setText("Select Courses");
                selectCourses.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                selectCoursesActionPerformed(evt);
                        }
                });

                emailField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                emailFieldActionPerformed(evt);
                        }
                });

                jLabel6.setFont(new java.awt.Font("Cambria", 3, 14));
                jLabel6.setText("Email");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jPanel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(54, 54, 54)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                false)
                                                                                                                .addComponent(jLabel4,
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel6,
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel2,
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                195,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel3,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(password,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                181,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(username,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                181,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGap(147, 147,
                                                                                                                                                147)
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(addButton,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                109,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addGap(70, 70, 70)
                                                                                                                                                                .addComponent(Removebtn,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                96,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                                79,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addComponent(updateButton,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                88,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addComponent(manageCoursesButton,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE))
                                                                                                                                .addGap(8, 8, 8))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(emailField,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                181,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(selectCourses,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                181,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                false)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jScrollPane1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                129,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jScrollPane2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addComponent(jPanel6,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jPanel4,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jPanel5,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jPanel2,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)))
                                                                .addGap(9, 9, 9)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(202, 202, 202)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel4,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(password,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel6,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                22,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(emailField))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(selectCourses)
                                                                                                                .addComponent(jLabel2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                24,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jPanel2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jPanel5,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jPanel4,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                .addComponent(Removebtn)
                                                                                                                                .addComponent(addButton)
                                                                                                                                .addComponent(updateButton))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                .addComponent(jLabel3,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                20,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(username,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(manageCoursesButton)
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                                .addGap(40, 40, 40)
                                                                .addComponent(jPanel6,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                194,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jScrollPane2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                194,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(96, 96, 96))
                                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

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

        private void usernameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_usernameActionPerformed

        }// GEN-LAST:event_usernameActionPerformed

        private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addButtonActionPerformed
                try {
                        if (username.getText() != null && !username.getText().trim().isEmpty()) {
                                String user = username.getText().trim();
                                String pass = password.getText().trim();
                                String email = emailField.getText().trim();
                                String role = rolelist.getSelectedItem().toString();
                                System.out.println(selectedCourses.isEmpty());

                                if (role.equals(EntityClasses.Role.TEACHER.toString())) {
                                        // Add Teacher (Courses optional)
                                        EntityClasses.Teacher teacher = new EntityClasses.Teacher(0, user, pass,
                                                        email, selectedCourses);
                                        TeacherManagement teacherManager = new TeacherManagement();
                                        teacherManager.addTeacher(teacher);
                                        JOptionPane.showMessageDialog(this, "Teacher added successfully.");
                                        populateTeacherTable();
                                } else if (role.equals(EntityClasses.Role.STUDENT.toString())) {
                                        // Add Student (Courses optional)
                                        EntityClasses.Student student = new EntityClasses.Student(0, user, pass,
                                                        email, selectedCourses);
                                        StudentManagement studentManager = new StudentManagement();
                                        studentManager.addStudent(student);
                                        JOptionPane.showMessageDialog(this, "Student added successfully.");
                                        populateStudentTable();
                                } else {
                                        JOptionPane.showMessageDialog(this, "Please select a valid role.");
                                }
                        } else {
                                JOptionPane.showMessageDialog(this, "User name cannot be empty.");
                        }
                } catch (SQLException ex) {
                        Logger.getLogger(AdminForm.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(this, "Error adding user: " + ex.getMessage());
                }
        }// GEN-LAST:event_addButtonActionPerformed

        private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_updateButtonActionPerformed
                if (username.getText() != null && !username.getText().trim().isEmpty()) {
                        TeacherManagement teacherManager = new TeacherManagement();
                        StudentManagement studentManager = new StudentManagement();

                        String user = username.getText().trim();
                        String pass = password.getText().trim();
                        String email = emailField.getText().trim();
                        try {
                                String role = rolelist.getSelectedItem().toString();
                                int selectedRow = role.equals(EntityClasses.Role.TEACHER.toString())
                                                ? teachers.getSelectedRow()
                                                : students.getSelectedRow();
                                if (selectedRow == -1) {
                                        JOptionPane.showMessageDialog(this,
                                                        "Please select a " + role.toLowerCase() + " to update.");
                                        return;
                                }
                                // Fetch the ID from the selected row
                                int id = role.equals(EntityClasses.Role.TEACHER.toString())
                                                ? (int) teachers.getValueAt(selectedRow, 0)
                                                : (int) students.getValueAt(selectedRow, 0);
                                if (role.equals(EntityClasses.Role.TEACHER.toString())) {
                                        EntityClasses.Teacher teacher = new EntityClasses.Teacher(id, user, pass, email,
                                                        null);
                                        teacherManager.updateTeacher(teacher);
                                        populateTeacherTable();
                                        JOptionPane.showMessageDialog(this, "Teacher updated successfully.");
                                } else if (role.equals(EntityClasses.Role.STUDENT.toString())) {
                                        EntityClasses.Student student = new EntityClasses.Student(id, user, pass, email,
                                                        null);
                                        studentManager.updateStudent(student);
                                        populateStudentTable();
                                        JOptionPane.showMessageDialog(this, "Student updated successfully.");
                                } else {
                                        JOptionPane.showMessageDialog(this, "Please select a valid role.");
                                }
                        } catch (SQLException ex) {
                                Logger.getLogger(AdminForm.class.getName()).log(Level.SEVERE, null, ex);
                                JOptionPane.showMessageDialog(this, "Error updating user: " + ex.getMessage());
                        }
                } else {
                        JOptionPane.showMessageDialog(this, "User name cannot be empty. Please fill all fields.");
                }
        }// GEN-LAST:event_updateButtonActionPerformed

        private void RemovebtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_RemovebtnActionPerformed
                // Method to remove selected user
                if (rolelist.getSelectedItem() == null) {
                        JOptionPane.showMessageDialog(this, "Please select a role.");
                        return;
                }
                String role = rolelist.getSelectedItem().toString();
                int selectedRow = -1; // To track selected row
                int id = -1; // To store the ID to be removed

                try {
                        if (role.equals(EntityClasses.Role.TEACHER.toString())) {
                                selectedRow = teachers.getSelectedRow();
                                if (selectedRow == -1) {
                                        JOptionPane.showMessageDialog(this, "Please select a teacher to remove.");
                                        return;
                                }
                                // Get the teacher ID from the selected row
                                id = Integer.parseInt(teachers.getValueAt(selectedRow, 0).toString());
                                TeacherManagement teacherManager = new TeacherManagement();
                                int teachId = teacherManager.getTeacherIdByUserId(id);
                                teacherManager.removeTeacher(teachId);
                                populateTeacherTable();
                                JOptionPane.showMessageDialog(this, "Teacher removed successfully.");
                        } else if (role.equals(EntityClasses.Role.STUDENT.toString())) {
                                selectedRow = students.getSelectedRow();
                                if (selectedRow == -1) {
                                        JOptionPane.showMessageDialog(this, "Please select a student to remove.");
                                        return;
                                }
                                // Get the student ID from the selected row
                                id = Integer.parseInt(students.getValueAt(selectedRow, 0).toString());
                                StudentManagement studentManager = new StudentManagement();
                                int stdId = studentManager.getStudentIdByUserId(id);
                                studentManager.removeStudent(stdId);
                                populateStudentTable();
                                JOptionPane.showMessageDialog(this, "Student removed successfully.");
                        } else {
                                JOptionPane.showMessageDialog(this, "Please select a valid role.");
                        }
                } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Invalid ID format.");
                } catch (SQLException ex) {
                        Logger.getLogger(AdminForm.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(this, "Error removing user: " + ex.getMessage());
                }
        }// GEN-LAST:event_RemovebtnActionPerformed

        private void rolelistActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rolelistActionPerformed
                if (rolelist.getSelectedItem().equals(EntityClasses.Role.STUDENT.toString())) {
                        populateStudentTable();
                } else if (rolelist.getSelectedItem().equals(EntityClasses.Role.TEACHER.toString())) {
                        populateTeacherTable();
                } else if (rolelist.getSelectedItem().equals("None")) {
                        // Do nothing or clear tables
                } else {
                        System.out.println("Error in role");
                }
        }// GEN-LAST:event_rolelistActionPerformed

        private void teachersMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_teachersMouseClicked
                int selectedRow = teachers.getSelectedRow();
                if (selectedRow >= 0) {
                        String tName = (String) teachers.getValueAt(selectedRow, 1);
                        String tPas = (String) teachers.getValueAt(selectedRow, 2);
                        username.setText(tName);
                        password.setText(tPas);
                }
        }// GEN-LAST:event_teachersMouseClicked

        private void studentsMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_studentsMouseClicked
                int selectedRow = students.getSelectedRow();
                if (selectedRow >= 0) {
                        String tName = (String) students.getValueAt(selectedRow, 1);
                        String tPas = (String) students.getValueAt(selectedRow, 2);
                        username.setText(tName);
                        password.setText(tPas);
                }
        }// GEN-LAST:event_studentsMouseClicked

        private void manageCoursesButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_manageCoursesButtonActionPerformed
                // Method to open Manage courses Form
                ManageCoursesForm a = new ManageCoursesForm(admin);
                a.setVisible(true);
                this.dispose();
        }// GEN-LAST:event_manageCoursesButtonActionPerformed

        private void selectCoursesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_selectCoursesActionPerformed
                // Open ChooseCoursesForm for teacher
                ChooseCoursesForm chooseCoursesForm = new ChooseCoursesForm(admin, this); // Assuming modal dialog
                chooseCoursesForm.setVisible(true);
        }// GEN-LAST:event_selectCoursesActionPerformed

        private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_emailFieldActionPerformed

        }// GEN-LAST:event_emailFieldActionPerformed

        private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_backLabelMouseClicked
                // Method to go back to sign in form
                SignIn signIn = new SignIn();
                signIn.setVisible(true);
                this.dispose();
        }// GEN-LAST:event_backLabelMouseClicked

        // Method to load all registered Students
        private void populateStudentTable() {
                StudentManagement studentManager = new StudentManagement();
                try {
                        List<EntityClasses.Student> student = studentManager.viewRegisteredStudents();
                        DefaultTableModel model = (DefaultTableModel) students.getModel();
                        model.setRowCount(0); // Clear existing data
                        for (EntityClasses.Student std : student) {
                                model.addRow(new Object[] { std.getUserId(), std.getUsername(), std.getPassword() });
                        }
                } catch (SQLException ex) {
                        Logger.getLogger(AdminForm.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(this, "Error fetching student data: " + ex.getMessage());
                }
        }

        // Method to load all registered teachers
        private void populateTeacherTable() {
                try {
                        TeacherManagement teacherManager = new TeacherManagement();
                        List<User> teacher = teacherManager.getTeachers();
                        DefaultTableModel model = (DefaultTableModel) teachers.getModel();
                        model.setRowCount(0); // Clear existing data
                        for (User teach : teacher) {
                                model.addRow(new Object[] { teach.getUserId(), teach.getUsername(),
                                                teach.getPassword() });
                        }
                } catch (SQLException ex) {
                        Logger.getLogger(AdminForm.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(this, "Error fetching teacher data: " + ex.getMessage());
                }
        }

        // Method to set selected courses from ChooseCoursesForm
        public void setSelectedCourses(List<Course> selectedCourses) {
                this.selectedCourses = selectedCourses;
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
                        java.util.logging.Logger.getLogger(AdminForm.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(AdminForm.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(AdminForm.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(AdminForm.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                }
                // </editor-fold>
                java.awt.EventQueue.invokeLater(() -> {
                        EntityClasses.Admin admin = new EntityClasses.Admin(0, "admin", "admin", "admin@test.com");
                        new AdminForm(admin).setVisible(true);
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton Removebtn;
        private javax.swing.JButton addButton;
        private javax.swing.JLabel backLabel;
        private javax.swing.JTextField emailField;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JPanel jPanel9;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JButton manageCoursesButton;
        private javax.swing.JTextField password;
        private javax.swing.JComboBox<String> rolelist;
        private javax.swing.JButton selectCourses;
        private javax.swing.JTable students;
        private javax.swing.JTable teachers;
        private javax.swing.JButton updateButton;
        private javax.swing.JTextField username;
        // End of variables declaration//GEN-END:variables
}
