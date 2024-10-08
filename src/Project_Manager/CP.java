/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Project_Manager;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Victor
 */
public class CP extends javax.swing.JFrame {

    private void updateFileFromTable() {
        File outputFile = new File("Project.txt");
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (int i = 0; i < tblModel.getRowCount(); i++) {
                for (int j = 0; j < tblModel.getColumnCount(); j++) {
                    writer.write(tblModel.getValueAt(i, j).toString());
                    if (j < tblModel.getColumnCount() - 1) {
                        writer.write(",");
                    }
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    private void loadTableData() {
        File inputFile = new File("Project.txt");
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        tblModel.setRowCount(0); // Clear existing data

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            boolean isFirstLine = true;
            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue; // Skip the header line
                }               
                String[] fields = line.split(",");
                tblModel.addRow(fields); // Add row to table model
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }     

    /**
     * Creates new form CP
     */
    public CP() {
        initComponents();
        loadTableData();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtProjectID = new javax.swing.JTextField();
        comboCategory = new javax.swing.JComboBox<>();
        comboIG = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        txtIntake = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create Project Page");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Create Project ");

        jLabel2.setText("ProjectID");

        jLabel3.setText("Category");

        jLabel4.setText("Individual/Group");

        jLabel5.setText("Intake");

        comboCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Internship", "Investigation Reports", "CP1", "CP2", "RMCP", "FYP" }));

        comboIG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Group" }));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProjectID", "Category", "Individual/Group", "Intake"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboIG, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboCategory, 0, 162, Short.MAX_VALUE)
                                    .addComponent(txtProjectID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtIntake))
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProjectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboIG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIntake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        // get jtable model first
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

        if (jTable1.getSelectedRowCount() == 1) {
            // get the selected row index
            int selectedRow = jTable1.getSelectedRow();

            // remove the selected row from the table model
            tblModel.removeRow(selectedRow);

            // prepare to read the file and remove the specific project line
            List<String> fileContents = new ArrayList<>();

            // read the file and store all lines except the one to be deleted
            try (BufferedReader reader = new BufferedReader(new FileReader("Project.txt"))) {
                String line;
                boolean isHeader = true;
                int currentLine = 0;
                while ((line = reader.readLine()) != null) {
                    if (isHeader) {
                        fileContents.add(line); // add the header line
                        isHeader = false;
                        continue;
                    }

                    // add all lines except the one matching the selected row index
                    if (currentLine != selectedRow) {
                        fileContents.add(line);
                    }
                    currentLine++;
                }
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
                return;
            }

            // write the updated data back to the file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("Project.txt"))) {
                for (String fileLine : fileContents) {
                    writer.write(fileLine);
                    writer.newLine();
                }
                JOptionPane.showMessageDialog(this, "Project Deleted Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }

        } else {
            if (jTable1.getRowCount() == 0) {
                // if table is empty then display this message
                JOptionPane.showMessageDialog(this, "Table is empty.");
            } else {
                // if table is not empty but row is not selected or multiple row is selected
                JOptionPane.showMessageDialog(this, "Please select a single row to delete.");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        if(txtProjectID.getText().equals("")||comboCategory.getSelectedItem().equals("")||comboIG.getSelectedItem().equals("")||txtIntake.getText().equals("")){
            // if any of four field left blank than show message
            JOptionPane.showMessageDialog(this, "Please fill in all fields!");
            
        } else {
        
        String projectId = txtProjectID.getText();
        String category = (String) comboCategory.getSelectedItem();
        String individualGroup = (String) comboIG.getSelectedItem();
        String intakeCode = txtIntake.getText();

        try {
            
            FileWriter writer = new FileWriter("Project.txt", true);
            writer.write(""+projectId+","+category+","+individualGroup+","+intakeCode+","+"NULL"+","+"NULL");
            writer.write(System.getProperty("line.separator"));
            String data[] = {txtProjectID.getText(),comboCategory.getSelectedItem().toString(),comboIG.getSelectedItem().toString(),txtIntake.getText()};
            
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            // Add the string array data as a new row to the table model
            tblModel.addRow(data); // row added
       
            writer.close();
            
        } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error writing to file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
        JOptionPane.showMessageDialog(this, "Project Created Successfully!");   
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        // set data to their textfield
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        
        // set data to text field when row is selected
        String tblProjectID = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String tblCategory = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tblIG = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String tblIntake = tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString();
        
        // set to textfield
        txtProjectID.setText(tblProjectID);
        comboCategory.setSelectedItem(tblCategory); //Use setSelectedItem for comboBox
        comboIG.setSelectedItem(tblIG);
        txtIntake.setText(tblIntake);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) { // Check if a single row is selected
            // Get table model
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

            // Get the data from the text fields and combo boxes
            String projectID = txtProjectID.getText();
            String category = comboCategory.getSelectedItem().toString(); // Use getSelectedItem for combo boxes
            String individualGroup = comboIG.getSelectedItem().toString();
            String intake = txtIntake.getText();

            // Set updated value on table row
            tblModel.setValueAt(projectID, selectedRow, 0);
            tblModel.setValueAt(category, selectedRow, 1);
            tblModel.setValueAt(individualGroup, selectedRow, 2);
            tblModel.setValueAt(intake, selectedRow, 3);

            // Prepare to read the file and update the specific project line
            List<String> fileContents = new ArrayList<>();
            
            // Read the file and update the specific project line
            try (BufferedReader reader = new BufferedReader(new FileReader("Project.txt"))) {
                String line;
                boolean isHeader = true;
                int currentLine = 0;
                while ((line = reader.readLine()) != null) {
                    if (isHeader) {
                        fileContents.add(line);
                        isHeader = false;
                        continue;
                    }

                    if (currentLine == selectedRow) {
                        // Update the specific project line
                        String[] data = line.split(",");
                        data[0] = projectID;
                        data[1] = category;
                        data[2] = individualGroup;
                        data[3] = intake;
                        line = String.join(",", data);
                    }
                    fileContents.add(line);
                    currentLine++;
                }
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
                return;
            }

            // Write the updated data back to the file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("Project.txt"))) {
                for (String fileLine : fileContents) {
                    writer.write(fileLine);
                    writer.newLine();
                }
                JOptionPane.showMessageDialog(this, "Project updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }

        } else {
            if (jTable1.getRowCount() == 0) {
                // If table is empty
                JOptionPane.showMessageDialog(this, "Table is empty");
            } else {
                // If row is not selected
                JOptionPane.showMessageDialog(this, "Please select a single row for update");
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        PMain pm = new PMain();
        pm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(CP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CP().setVisible(true);
            }
        });
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboCategory;
    private javax.swing.JComboBox<String> comboIG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtIntake;
    private javax.swing.JTextField txtProjectID;
    // End of variables declaration//GEN-END:variables
}
