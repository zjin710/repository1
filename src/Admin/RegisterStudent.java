/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author Swee Zhi Jin
 */
package Admin;

import javax.swing.JOptionPane;

public class RegisterStudent extends javax.swing.JFrame {
    private final Admin admin;
    private Admin_Student admin_student;
    /**
     * Creates new form AdminRegStu
     */
    public RegisterStudent(Admin admin, String studentid, String name, String password, String intakeCode, String email, String phoneNumber, boolean isEditing) {
        initComponents();
        // Initialize Admin instance
        this.admin = admin;
        
        studentIDTxt.setText(studentid);
        studentNameTxt.setText(name);
        studentPasswordTxt.setText(password);
        studentIntakeCodeTxt.setText(intakeCode);
        studentEmailTxt.setText(email);
        studentPhoneNumTxt.setText(phoneNumber);
        
        // Change button text and action based on isEditing flag
        if (isEditing) {
            titleLbl.setText("Update Student");
            studentIDTxt.setEditable(false); // Set the text field to be uneditable
            registerStudentBtn.setText("Save Changes");
            registerStudentBtn.addActionListener(e -> updateStudent());
        } else {
            titleLbl.setText("Register Student");
            registerStudentBtn.setText("Add Student");
            registerStudentBtn.addActionListener(e -> addStudent());
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

        titleLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        phoneNumLbl = new javax.swing.JLabel();
        studentNameTxt = new javax.swing.JTextField();
        studentPasswordTxt = new javax.swing.JTextField();
        studentEmailTxt = new javax.swing.JTextField();
        studentPhoneNumTxt = new javax.swing.JTextField();
        registerStudentBtn = new javax.swing.JButton();
        studentIDLbl = new javax.swing.JLabel();
        studentIDTxt = new javax.swing.JTextField();
        intakeCodeLbl = new javax.swing.JLabel();
        studentIntakeCodeTxt = new javax.swing.JTextField();
        closeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbl.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Register Student");

        nameLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameLbl.setText("Name : ");

        passwordLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passwordLbl.setText("Password : ");

        emailLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailLbl.setText("Email : ");

        phoneNumLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        phoneNumLbl.setText("Phone Number : ");

        studentPasswordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentPasswordTxtActionPerformed(evt);
            }
        });

        registerStudentBtn.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        registerStudentBtn.setText("Register Student");
        registerStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerStudentBtnActionPerformed(evt);
            }
        });

        studentIDLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        studentIDLbl.setText("Student ID : ");

        intakeCodeLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        intakeCodeLbl.setText("Intake Code : ");

        closeBtn.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLbl)
                            .addComponent(phoneNumLbl)
                            .addComponent(nameLbl)
                            .addComponent(studentIDLbl)
                            .addComponent(intakeCodeLbl)
                            .addComponent(passwordLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(studentIDTxt)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(studentIntakeCodeTxt)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(studentNameTxt)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(studentPasswordTxt)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(studentEmailTxt)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(studentPhoneNumTxt)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerStudentBtn)
                .addGap(89, 89, 89)
                .addComponent(closeBtn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentIDLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intakeCodeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentIntakeCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentPhoneNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudent() {
        // Get data from text fields and add new student
        String studentID = studentIDTxt.getText();
        String name = studentNameTxt.getText();
        String password = studentPasswordTxt.getText();
        String intakeCode = studentIntakeCodeTxt.getText();
        String email = studentEmailTxt.getText();
        String phoneNumber = studentPhoneNumTxt.getText();
        
        admin_student = new Admin_Student();
        
        // Call Admin method to register student
        boolean success = (admin_student.registerStudent(studentID, name, password, intakeCode, email, phoneNumber)
                && admin.registerUser(studentID, name, password, "Student"));
        
        if (success) {
            // Display success message
            JOptionPane.showMessageDialog(this, "Student registered successfully!");
        }
        
        studentIDTxt.setText("");
        studentNameTxt.setText("");
        studentPasswordTxt.setText("");
        studentIntakeCodeTxt.setText("");
        studentEmailTxt.setText("");
        studentPhoneNumTxt.setText("");
        
        AdminStudent adminStudent = new AdminStudent(admin);
        adminStudent.setVisible(true);
        this.dispose();
    }
    
    private void updateStudent(){
        // Get data from text fields and update student info
        String studentID = studentIDTxt.getText();
        String name = studentNameTxt.getText();
        String password = studentPasswordTxt.getText();
        String intakeCode = studentIntakeCodeTxt.getText();
        String email = studentEmailTxt.getText();
        String phoneNumber = studentPhoneNumTxt.getText();
        
        admin_student = new Admin_Student();
        
        // Call Admin method to update student details in student file and login file
        admin_student.updateStudent(studentID, name, password, intakeCode, email, phoneNumber);
        admin.updateUser(studentID, name, password, "Student");
        
        // Display success message or handle errors
        JOptionPane.showMessageDialog(this, "Student details updated successfully!");
        
        AdminStudent adminStudent = new AdminStudent(admin);
        adminStudent.setVisible(true);
        this.dispose();
    }
    
    private void registerStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerStudentBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerStudentBtnActionPerformed

    private void studentPasswordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentPasswordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentPasswordTxtActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        // Close the current form
        this.dispose();
        
        // Go back to the admin's student form
        AdminStudent adminStudent = new AdminStudent(admin);
        adminStudent.setVisible(true);
    }//GEN-LAST:event_closeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JLabel intakeCodeLbl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JLabel phoneNumLbl;
    private javax.swing.JButton registerStudentBtn;
    private javax.swing.JTextField studentEmailTxt;
    private javax.swing.JLabel studentIDLbl;
    private javax.swing.JTextField studentIDTxt;
    private javax.swing.JTextField studentIntakeCodeTxt;
    private javax.swing.JTextField studentNameTxt;
    private javax.swing.JTextField studentPasswordTxt;
    private javax.swing.JTextField studentPhoneNumTxt;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
