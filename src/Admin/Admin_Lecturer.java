/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Admin_Lecturer extends Admin {
    private static final String lecturerFile = "staff.txt";
    
    public Admin_Lecturer(String userId) {
        super(userId);
    }
    
    @Override
    public void populateTableFromFile(String filename, JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing rows

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            
            if (filename.equals("staff.txt")) {
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(",");

                    if (data.length == 7) {
                        if ("Lecturer".equals(data[6]) || "Project Manager".equals(data[6])) {
                            model.addRow(new Object[]{data[0], data[1], data[2], data[3], data[4], data[5], data[6]});
                        }
                    } else {
                        System.err.println("Invalid data format in file: " + line);
                    }
                }
            }
            System.out.println("Populated lecturer table from file: " + filename);
            
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    
    // Register a lecturer
    public boolean registerLecturer(String lecturerID, String name, String password, String email, String phoneNumber, String department, String role) {
        List<String> fileContents = new ArrayList<>();
        boolean lecturerExists = false;

        // Read the file and check if the lecturer ID already exists
        try (BufferedReader reader = new BufferedReader(new FileReader(lecturerFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length > 0 && data[0].equals(lecturerID)) {
                    lecturerExists = true;
                    break; // Exit the loop if lecturer ID is found
                }
                fileContents.add(line); // Store existing lines to write back later
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return false; // Register failed
        }

        if (lecturerExists) {
            JOptionPane.showMessageDialog(null, "Lecturer ID already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            return false; // Register failed
        }

        // Add the new lecturer details
        fileContents.add(lecturerID + "," + name + "," + password + "," + email + "," + phoneNumber + "," + department + "," + role);

        // Write all data back to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(lecturerFile))) {
            for (String fileLine : fileContents) {
                writer.write(fileLine);
                writer.newLine();
            }
            if (role.equals("Lecturer")) {
                System.out.println("Staff registered as Lecturer: " + name);
            } else if (role.equals("Admin")) {
                System.out.println("Staff registered as Admin: " + name);
            }
            return true; // Register successful
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            return false; // Register failed
        }
    }
    
    // Amend lecturer details
    public boolean updateLecturer(String lecturerID, String newName, String newPassword, String newEmail, String newPhoneNumber, String newDepartment, String newRole) {
        List<String> updatedLines = new ArrayList<>();

        boolean found = false; // Flag to track if the lecturer is found for update

        try (BufferedReader reader = new BufferedReader(new FileReader(lecturerFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 7 && data[0].equals(lecturerID)) {
                    // Found the lecturer, update the fields
                    data[1] = newName;
                    data[2] = newPassword;
                    data[3] = newEmail;
                    data[4] = newPhoneNumber;
                    data[5] = newDepartment;
                    data[6] = newRole;
                    found = true; // Set the flag to indicate lecturer found for update
                }
                updatedLines.add(String.join(",", data));
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return false; // Update failed
        }

        if (!found) {
            System.err.println("Lecturer not found for update.");
            return false; // Lecturer not found for update
        }

        // Write the updated data back to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(lecturerFile))) {
            for (String updatedLine : updatedLines) {
                writer.write(updatedLine);
                writer.newLine();
            }
            return true; // Update successful
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
            return false; // Update failed
        }
    }

    // Delete lecturer
    public void deleteLecturer(String lecturerID) {
        List<String> updatedLines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(lecturerFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 7 && data[0].equals(lecturerID)) {
                    // Skip this line, as it contains the details of the lecturer to be deleted
                    continue;
                }
                updatedLines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return; // Deletion failed
        }

        // Write the updated data back to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(lecturerFile))) {
            for (String updatedLine : updatedLines) {
                writer.write(updatedLine);
                writer.newLine();
            }
            System.out.println("Lecturer details deleted successfully.");
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}
