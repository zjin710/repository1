package Lecturer;

import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class SecondMarkerFrame extends javax.swing.JFrame {

    /**
     * Creates new form SecondMarkerFrame
     * @param secondMarkerID the SecondMarkerID to be set
     */
    public SecondMarkerFrame(String secondMarkerID) {
        
        initComponents();
        findData(secondMarkerID);
    }
    
    public void findData(String secondMarkerID){
        //Read textfile
        String filename = "C:\\Users\\user\\Desktop\\java\\Project.txt";
        String projectID = null;
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            // Loop through each line in the file
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                // Check if the current line equal the specified studentID
                if (parts[5].equals(secondMarkerID)) {
                    projectID = parts[0];
                    break;
                }
            }
        } catch (IOException e) {
            // Catch and print IO exceptions
            e.printStackTrace();
        }
        if (projectID != null) {
        // Use projectID to search in another text file
        loadTableData(projectID);
        }
    }
    
    public void loadTableData(String projectID) {
        DefaultTableModel model = (DefaultTableModel) TableSMA.getModel();
        //Read textfile
        String textFile = "Presentation.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(textFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                //Split each line with commas
                String[] rowData = line.split(",");
                
                if (rowData[3].equals(projectID)) {
                    Object[] selectedData = {rowData[0], rowData[1], rowData[2], rowData[3], rowData[7], rowData[8], rowData[9], rowData[10], rowData[11]};
                    model.addRow(selectedData);
                }
            }
            TableSMA.setModel(model);
        } catch (IOException e) {
            //Catch and print any IO exceptions
            e.printStackTrace();
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

        labelTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableSMA = new javax.swing.JTable();
        ButtonBack = new javax.swing.JButton();
        ButtonAccept = new javax.swing.JButton();
        ButtonReject = new javax.swing.JButton();
        ButtonViewReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        labelTitle.setText("Second Marker Acceptance");

        TableSMA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "StudentID", "Name", "IntakeID", "ProjectID", "PresStatus", "LectureID", "CGPA", "Feedback", "SM Acceptance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableSMA);
        if (TableSMA.getColumnModel().getColumnCount() > 0) {
            TableSMA.getColumnModel().getColumn(0).setResizable(false);
            TableSMA.getColumnModel().getColumn(0).setPreferredWidth(20);
            TableSMA.getColumnModel().getColumn(1).setResizable(false);
            TableSMA.getColumnModel().getColumn(1).setPreferredWidth(40);
            TableSMA.getColumnModel().getColumn(2).setResizable(false);
            TableSMA.getColumnModel().getColumn(2).setPreferredWidth(50);
            TableSMA.getColumnModel().getColumn(3).setResizable(false);
            TableSMA.getColumnModel().getColumn(3).setPreferredWidth(20);
            TableSMA.getColumnModel().getColumn(4).setResizable(false);
            TableSMA.getColumnModel().getColumn(4).setPreferredWidth(30);
            TableSMA.getColumnModel().getColumn(5).setResizable(false);
            TableSMA.getColumnModel().getColumn(5).setPreferredWidth(20);
            TableSMA.getColumnModel().getColumn(6).setResizable(false);
            TableSMA.getColumnModel().getColumn(6).setPreferredWidth(20);
            TableSMA.getColumnModel().getColumn(7).setPreferredWidth(190);
            TableSMA.getColumnModel().getColumn(8).setResizable(false);
            TableSMA.getColumnModel().getColumn(8).setPreferredWidth(40);
        }

        ButtonBack.setText("Back");
        ButtonBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });

        ButtonAccept.setText("Accept");
        ButtonAccept.setActionCommand("View Presentation Request");
        ButtonAccept.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAcceptActionPerformed(evt);
            }
        });

        ButtonReject.setText("Reject");
        ButtonReject.setActionCommand("View Presentation Request");
        ButtonReject.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRejectActionPerformed(evt);
            }
        });

        ButtonViewReport.setText("View Report");
        ButtonViewReport.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonViewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonViewReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitle)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(ButtonAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ButtonReject, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonViewReport, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonReject, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonViewReport, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        // TODO add your handling code here:
        // Dispose of the current frame
        dispose();
        //Open another frame
//        LectureFrame lectureFrame = new LectureFrame();
//        lectureFrame.setVisible(true);
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void ButtonAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAcceptActionPerformed
        // TODO add your handling code here:
        //Get selected rows
        int selectedRow = TableSMA.getSelectedRow();
    
        // Check if any row is selected
        if (selectedRow != -1) {
            // Get the studentID from the first column of the selected row
            String studentID = (String) TableSMA.getModel().getValueAt(selectedRow, 0);
            String filename = "Presentation.txt";
            
            String PresDate = "";
            String PresTime = "";
            String Status = "";

            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                String line;
                // Loop through each line in the file
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");
                    // Check if the current line equal the specified studentID
                    if (parts[0].equals(studentID)) {
                        PresDate = parts[4];
                        PresTime = parts[5];
                        Status = parts[6];
                        break;
                    }
                }
            } catch (IOException e) {
                // Catch and print IO exceptions
                e.printStackTrace();
            }

            // Get the value of the current status column
            String status = (String) TableSMA.getModel().getValueAt(selectedRow, 6);
            // Show already accepted message
            if (status.equals("NULL")) {
                JOptionPane.showMessageDialog(null, "This CGPA has not been graded yet.", "Not Graded", JOptionPane.WARNING_MESSAGE);
                // Show already rejected message
            } else {
                TableSMA.getModel().setValueAt("Accept", selectedRow, 8);
                JOptionPane.showMessageDialog(null, "This entry has been accepted.", "Accepted", JOptionPane.INFORMATION_MESSAGE);

                // Get the entire row data
                int columnCount = TableSMA.getModel().getColumnCount();
                StringBuilder updatedLine = new StringBuilder();
                for (int col = 0; col < columnCount; col++) {
                        if (col == 4) {
                            updatedLine.append(PresDate).append(",").append(PresTime).append(",").append(Status).append(",");
                        }
                    updatedLine.append(TableSMA.getModel().getValueAt(selectedRow, col)).append(",");
                }
                // Remove the last extra comma
                updatedLine.setLength(updatedLine.length() - 1);

                // Read the file and update the specific line
                File studentFile = new File("Presentation.txt");
                List<String> fileContent = new ArrayList<>();
                try (BufferedReader reader = new BufferedReader(new FileReader(studentFile))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        String[] lineData = line.split(",");
                        if (lineData[0].equals((String) TableSMA.getModel().getValueAt(selectedRow, 0)) &&
                            lineData[2].equals((String) TableSMA.getModel().getValueAt(selectedRow, 2)) &&
                            lineData[3].equals((String) TableSMA.getModel().getValueAt(selectedRow, 3))) {
                            fileContent.add(updatedLine.toString());
                        } else {
                            fileContent.add(line);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                // Write the updated content back to the file
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(studentFile))) {
                    for (String line : fileContent) {
                        writer.write(line);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            // Show warning message if no row is selected
            JOptionPane.showMessageDialog(null, "Please select a row.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ButtonAcceptActionPerformed

    private void ButtonRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRejectActionPerformed
        // TODO add your handling code here:
        int selectedRow = TableSMA.getSelectedRow();
    
        // Check if any row is selected
        if (selectedRow != -1) {
            // Get the studentID from the first column of the selected row
            String studentID = (String) TableSMA.getModel().getValueAt(selectedRow, 0);
            String filename = "Presentation.txt";
            
            String PresDate = "";
            String PresTime = "";
            String Status = "";

            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                String line;
                // Loop through each line in the file
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");
                    // Check if the current line equal the specified studentID
                    if (parts[0].equals(studentID)) {
                        PresDate = parts[4];
                        PresTime = parts[5];
                        Status = parts[6];
                        break;
                    }
                }
            } catch (IOException e) {
                // Catch and print IO exceptions
                e.printStackTrace();
            }

            // Get the value of the current status column
            String status = (String) TableSMA.getModel().getValueAt(selectedRow, 6);
            // Show already accepted message
            if (status.equals("NULL")) {
                JOptionPane.showMessageDialog(null, "This CGPA has not been graded yet.", "Not Graded", JOptionPane.WARNING_MESSAGE);
                // Show already rejected message
            } else {
                TableSMA.getModel().setValueAt("Reject", selectedRow, 8);
                JOptionPane.showMessageDialog(null, "This entry has been Rejected.", "Rejected", JOptionPane.INFORMATION_MESSAGE);

                // Get the entire row data
                int columnCount = TableSMA.getModel().getColumnCount();
                StringBuilder updatedLine = new StringBuilder();
                for (int col = 0; col < columnCount; col++) {
                        if (col == 4) {
                            updatedLine.append(PresDate).append(",").append(PresTime).append(",").append(Status).append(",");
                        }
                    updatedLine.append(TableSMA.getModel().getValueAt(selectedRow, col)).append(",");
                }
                // Remove the last extra comma
                updatedLine.setLength(updatedLine.length() - 1);
                
                // Read the file and update the specific line
                File studentFile = new File("Presentation.txt");
                List<String> fileContent = new ArrayList<>();
                try (BufferedReader reader = new BufferedReader(new FileReader(studentFile))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        String[] lineData = line.split(",");
                        if (lineData[0].equals((String) TableSMA.getModel().getValueAt(selectedRow, 0)) &&
                            lineData[2].equals((String) TableSMA.getModel().getValueAt(selectedRow, 2)) &&
                            lineData[3].equals((String) TableSMA.getModel().getValueAt(selectedRow, 3))) {
                            fileContent.add(updatedLine.toString());
                        } else {
                            fileContent.add(line);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                // Write the updated content back to the file
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(studentFile))) {
                    for (String line : fileContent) {
                        writer.write(line);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            // Show warning message if no row is selected
            JOptionPane.showMessageDialog(null, "Please select a row.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ButtonRejectActionPerformed

    private void ButtonViewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonViewReportActionPerformed
        // TODO add your handling code here:
        // Get selected rows
        int selectedRow = TableSMA.getSelectedRow();

        // Check if any row is selected
        if (selectedRow != -1) {
            // Get the studentID from the first column of the selected row
            String studentID = (String) TableSMA.getModel().getValueAt(selectedRow, 0);
            String filename = "Presentation.txt";

            String PresDate = "";
            String PresTime = "";
            String Status = "";

            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                String line;
                // Loop through each line in the file
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");
                    // Check if the current line equals the specified studentID
                    if (parts[0].equals(studentID)) {
                        PresDate = parts[4];
                        PresTime = parts[5];
                        Status = parts[6];
                        break;
                    }
                }
            } catch (IOException e) {
                // Catch and print IO exceptions
                e.printStackTrace();
            }

            // Get the value of the current status column
            String status = (String) TableSMA.getModel().getValueAt(selectedRow, 6);
            // Show appropriate messages based on status
            if (status.equals("NULL")) {
                JOptionPane.showMessageDialog(null, "This CGPA has not been graded yet.", "Not Graded", JOptionPane.WARNING_MESSAGE);
            } else {
                Object StudentID = TableSMA.getValueAt(selectedRow, 0);
                Object IntakeID = TableSMA.getValueAt(selectedRow, 2);
                Object ProjectID = TableSMA.getValueAt(selectedRow, 3);
                // Open another frame
                ReportFrame reportFrame = new ReportFrame(StudentID.toString(), IntakeID.toString(), ProjectID.toString());
                reportFrame.setVisible(true);
            }
        } else {
            // Show warning message if no row is selected
            JOptionPane.showMessageDialog(null, "Please select a row.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ButtonViewReportActionPerformed

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
            java.util.logging.Logger.getLogger(SecondMarkerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondMarkerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondMarkerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondMarkerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SecondMarkerFrame("SecondMarkerID").setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAccept;
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonReject;
    private javax.swing.JButton ButtonViewReport;
    private javax.swing.JTable TableSMA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitle;
    // End of variables declaration//GEN-END:variables
}
