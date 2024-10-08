/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Swee Zhi Jin
 */
package Admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Project_Manager.PMain;
import Lecturer.LectureFrame;
import Student.Welcome_Student;

public class UpdateProfile extends javax.swing.JFrame {
    private final String userID;
    private final String userName;
    private final String userPassword;
    private final String userEmail;
    private final String userPhoneNum;
    private final String userDepartment;
    private final String userRole;
    private static final String loginFile = "login.txt";
    private static final String staffFile = "staff.txt";
    private static final String studentFile = "student.txt";
    private javax.swing.JFrame previousFrame;

    /**
     * Creates new form UpdateProfile
     */
    public UpdateProfile(String userid, String username, String userpassword, String useremail, String userphonenum, String userdepartment, String role, javax.swing.JFrame previousFrame) {
        initComponents();
        this.userID = userid;
        this.userName = username;
        this.userPassword = userpassword;
        this.userEmail = useremail;
        this.userPhoneNum = userphonenum;
        this.userDepartment = userdepartment;
        this.userRole = role;
        this.previousFrame = previousFrame;
        
        userIDField.setText(userID);
        nameField.setText(userName);
        passwordField.setText(userPassword);
        emailField.setText(userEmail);
        phoneNumField.setText(userPhoneNum);
        departmentCmb.setSelectedItem(userDepartment);
        roleCmb.setSelectedItem(userRole);
        roleCmb.setEnabled(false);
        
        switch (userRole) {
            case "Admin" -> {
                departmentCmb.setEnabled(false);
                
            }
            case "Project Manager" -> {
                
            }
            case "Lecturer" -> {
                
            }
            case "Student" -> {
                departmentCmb.setEnabled(false);
            }
            default -> {
                JOptionPane.showMessageDialog(this, "Unknown role!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        updateProfileBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        userIDField = new javax.swing.JTextField();
        roleCmb = new javax.swing.JComboBox<>();
        Close = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        phoneNumField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        departmentCmb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Profile");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Password : ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Role : ");

        updateProfileBtn.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        updateProfileBtn.setText("Update Profile");
        updateProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProfileBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Name : ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("User ID : ");

        userIDField.setEditable(false);

        roleCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Project Manager", "Lecturer", "Student" }));
        roleCmb.setToolTipText("");
        roleCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleCmbActionPerformed(evt);
            }
        });

        Close.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Phone Number : ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Email : ");

        departmentCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Computing", "Accounting", "Engineering", "Business", "Media" }));
        departmentCmb.setToolTipText("");
        departmentCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentCmbActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Department : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailField)
                    .addComponent(userIDField)
                    .addComponent(departmentCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roleCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordField)
                    .addComponent(phoneNumField)
                    .addComponent(nameField))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(updateProfileBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(Close)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(departmentCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roleCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProfileBtnActionPerformed
        // TODO add your handling code here:
        String userid = userIDField.getText();
        String name = nameField.getText();
        String password = passwordField.getText();
        String email = emailField.getText();
        String phoneNumber = phoneNumField.getText();
        String department = departmentCmb.getSelectedItem().toString();
        String Role = roleCmb.getSelectedItem().toString();
        
        List<String> updatedLinesLogin = new ArrayList<>();
        
        boolean updateSuccess = false; // Flag to indicate a successful update
        boolean foundLogin = false; // Flag to track if the user is found in login file

        try (BufferedReader reader = new BufferedReader(new FileReader(loginFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4 && data[0].equals(userid)) {
                    // Found the user, update the fields
                    data[1] = name;
                    data[2] = password;
                    foundLogin = true; // Set the flag to indicate user found for update
                }
                updatedLinesLogin.add(String.join(",", data));
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        
        if (!foundLogin) {
            System.err.println("User not found in login file.");
        }
        
        // Write the updated data back to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(loginFile))) {
            for (String updatedLine : updatedLinesLogin) {
                writer.write(updatedLine);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
        
        switch (Role) {
            case "Admin" :
            case "Project Manager" :
            case "Lecturer" : {
                // Update admin/project manager/lecturer details in staff file
                List<String> updatedLines = new ArrayList<>();

                boolean found = false; // Flag to track if the admin/project manager/lecturer is found for update

                try (BufferedReader reader = new BufferedReader(new FileReader(staffFile))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        String[] data = line.split(",");
                        if (data.length == 7 && data[0].equals(userid)) {
                            // Found the admin/project manager/lecturer, update the fields
                            data[1] = name;
                            data[2] = password;
                            data[3] = email;
                            data[4] = phoneNumber;
                            data[5] = department;
                            found = true; // Set the flag to indicate admin/project manager/lecturer found for update
                        }
                        updatedLines.add(String.join(",", data));
                    }
                } catch (IOException e) {
                    System.err.println("Error reading file: " + e.getMessage());
                }

                if (!found) {
                    System.err.println("User not found in staff file.");
                }

                // Write the updated data back to the file
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(staffFile))) {
                    for (String updatedLine : updatedLines) {
                        writer.write(updatedLine);
                        writer.newLine();
                    }
                    updateSuccess = true; // Indicate successful update
                } catch (IOException e) {
                    System.err.println("Error writing file: " + e.getMessage());
                }
                break;
            }
            
            case "Student" : {
                List<String> updatedStudent = new ArrayList<>();

                boolean found = false; // Flag to track if the student is found for update

                try (BufferedReader reader = new BufferedReader(new FileReader(studentFile))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        String[] data = line.split(",");
                        if (data.length == 6 && data[0].equals(userid)) {
                            // Found the student, update the fields
                            data[1] = name;
                            data[2] = password;
                            data[4] = email;
                            data[5] = phoneNumber;
                            found = true; // Set the flag to indicate student found for update
                        }
                        updatedStudent.add(String.join(",", data));
                    }
                } catch (IOException e) {
                    System.err.println("Error reading file: " + e.getMessage());
                }

                if (!found) {
                    System.err.println("Student not found for update.");
                }

                // Write the updated data back to the file
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(studentFile))) {
                    for (String updatedLine : updatedStudent) {
                        writer.write(updatedLine);
                        writer.newLine();
                    }
                    updateSuccess = true; // Indicate successful update
                } catch (IOException e) {
                    System.err.println("Error writing file: " + e.getMessage());
                }
                break;
            }
            
            default : {
                JOptionPane.showMessageDialog(this, "Unknown role!", "Error", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
        
        if (updateSuccess) {
            JOptionPane.showMessageDialog(this, "User details updated successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to update user details.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        JFrame roleFrame;
        switch (Role) {
            case "Admin" -> {
                Admin admin = new Admin_Lecturer(userID);
                roleFrame = new AdminMain(admin); // Switch to Admin frame with Admin object
            }
            case "Lecturer" -> roleFrame = new LectureFrame(userID); // Switch to Lecturer frame
            case "Student" -> roleFrame = new Welcome_Student(); // Switch to Student frame
            case "Project Manager" -> roleFrame = new PMain(); // Switch to Project Manager frame
            default -> {
                JOptionPane.showMessageDialog(this, "Unknown role!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        roleFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateProfileBtnActionPerformed

    private void roleCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleCmbActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        previousFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CloseActionPerformed

    private void departmentCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentCmbActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JComboBox<String> departmentCmb;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField phoneNumField;
    private javax.swing.JComboBox<String> roleCmb;
    private javax.swing.JButton updateProfileBtn;
    private javax.swing.JTextField userIDField;
    // End of variables declaration//GEN-END:variables
}