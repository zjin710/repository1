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

public class AdminStudent extends javax.swing.JFrame {
    private final Admin admin;
    private Admin_Student admin_student;
    private static final String studentFile = "student.txt";

    /**
     * Creates new form AdminStudent
     */
    public AdminStudent(Admin admin) {
        initComponents();
        this.admin = admin;
        
        admin_student = new Admin_Student();
        // Read data from file and populate table
        admin_student.populateTableFromFile(studentFile, studentTable);
    }
    
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible) {
            // Refresh the table everytime its shown
            admin_student.populateTableFromFile(studentFile, studentTable);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        amendBtn = new javax.swing.JButton();
        registerIndividualBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        registerListBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Student List");

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Name", "Password", "Intake Code", "Email", "Phone Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentTable);

        amendBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amendBtn.setText("Amend Details");
        amendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amendBtnActionPerformed(evt);
            }
        });

        registerIndividualBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerIndividualBtn.setText("Register Student (Individual)");
        registerIndividualBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerIndividualBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deleteBtn.setText("Delete Student");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        closeBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        closeBtn.setText("Close Form");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        registerListBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerListBtn.setText("Register Student (List)");
        registerListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerListBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registerIndividualBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registerListBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(amendBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(closeBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerIndividualBtn)
                    .addComponent(amendBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(closeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerListBtn))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerIndividualBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerIndividualBtnActionPerformed
        // TODO add your handling code here:
        RegisterStudent registerStudent = new RegisterStudent(admin, "", "", "", "", "", "", false);
        setVisible(false);
        registerStudent.setVisible(true);
    }//GEN-LAST:event_registerIndividualBtnActionPerformed

    private void amendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amendBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = studentTable.getSelectedRow();
        
        if (selectedRow != -1) { // Check if a row is selected
            String studentid = studentTable.getValueAt(selectedRow, 0).toString();
            String name = studentTable.getValueAt(selectedRow, 1).toString();
            String password = studentTable.getValueAt(selectedRow, 2).toString();
            String intakeCode = studentTable.getValueAt(selectedRow, 3).toString();
            String email = studentTable.getValueAt(selectedRow, 4).toString();
            String phoneNumber = studentTable.getValueAt(selectedRow, 5).toString();

            // Pass data to registerStudent form and switch to it
            RegisterStudent registerStudent = new RegisterStudent(admin, studentid, name, password, intakeCode, email, phoneNumber, true);
            registerStudent.setVisible(true); // Switch to register student form
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a student to amend details.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_amendBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = studentTable.getSelectedRow();
        
        if (selectedRow != -1) { // Check if a row is selected
            String studentid = studentTable.getValueAt(selectedRow, 0).toString();

            admin_student = new Admin_Student();
            
            // Call Admin method to delete student
            admin_student.deleteStudent(studentid);
            admin.deleteUser(studentid);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a student to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        // Read data from file and populate table
        admin_student.populateTableFromFile(studentFile, studentTable);
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        // Close the current form
        this.dispose();
        
        // Go back to the admin main form
        AdminMain adminMain = new AdminMain(admin);
        adminMain.setVisible(true);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void registerListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerListBtnActionPerformed
        // TODO add your handling code here:
        RegisterBatch registerBatch = new RegisterBatch(admin, "Student", this);
        setVisible(false);
        registerBatch.setVisible(true);
    }//GEN-LAST:event_registerListBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton amendBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton registerIndividualBtn;
    private javax.swing.JButton registerListBtn;
    private javax.swing.JTable studentTable;
    // End of variables declaration//GEN-END:variables
}
