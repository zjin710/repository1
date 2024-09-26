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

public class Admin_Student extends Admin {
    private static final String studentFile = "student.txt";
    
    public Admin_Student() {
        
    }
    
    @Override
    public void populateTableFromFile(String filename, JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing rows

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            
            if (filename.equals("student.txt")) {
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(","); 

                    if (data.length == 6) {
                        model.addRow(new Object[]{data[0], data[1], data[2], data[3], data[4], data[5]});
                    } else {
                        System.err.println("Invalid data format in file: " + line);
                    }
                }
            }
            System.out.println("Populated student table from file: " + filename);
            
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    
    // Register a student
    public boolean registerStudent(String studentid, String name, String password, String intakeCode, String email, String phoneNumber) {
        List<String> fileContents = new ArrayList<>();
        boolean studentExists = false;

        // Read the file and check if the student ID already exists
        try (BufferedReader reader = new BufferedReader(new FileReader(studentFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length > 0 && data[0].equals(studentid)) {
                    studentExists = true;
                    break; // Exit the loop if student ID is found
                }
                fileContents.add(line); // Store existing lines to write back later
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return false; // Register failed
        }

        if (studentExists) {
            JOptionPane.showMessageDialog(null, "Student ID already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            return false; // Register failed
        }

        // Add the new student details
        fileContents.add(studentid + "," + name + "," + password + "," + intakeCode + "," + email + "," + phoneNumber);

        // Write all data back to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(studentFile))) {
            for (String fileLine : fileContents) {
                writer.write(fileLine);
                writer.newLine();
            }
            System.out.println("Student registered: " + name);
            return true; // Register successful
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            return false; // Register failed
        }
    }

    // Amend student details
    public boolean updateStudent(String studentid, String newName, String newPassword, String newIntakeCode, String newEmail, String newPhoneNumber) {
        List<String> updatedStudent = new ArrayList<>();

        boolean found = false; // Flag to track if the student is found for update

        try (BufferedReader reader = new BufferedReader(new FileReader(studentFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 6 && data[0].equals(studentid)) {
                    // Found the student, update the fields
                    data[1] = newName;
                    data[2] = newPassword;
                    data[3] = newIntakeCode;
                    data[4] = newEmail;
                    data[5] = newPhoneNumber;
                    found = true; // Set the flag to indicate student found for update
                }
                updatedStudent.add(String.join(",", data));
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return false; // Update failed
        }

        if (!found) {
            System.err.println("Student not found for update.");
            return false; // Student not found for update
        }

        // Write the updated data back to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(studentFile))) {
            for (String updatedLine : updatedStudent) {
                writer.write(updatedLine);
                writer.newLine();
            }
            return true; // Update successful
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
            return false; // Update failed
        }
    }

    // Delete student
    public void deleteStudent(String studentid) {
        List<String> updatedLines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(studentFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 6 && data[0].equals(studentid)) {
                    // Skip this line, as it contains the details of the student to be deleted
                    continue;
                }
                updatedLines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return; // Deletion failed
        }

        // Write the updated data back to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(studentFile))) {
            for (String updatedLine : updatedLines) {
                writer.write(updatedLine);
                writer.newLine();
            }
            System.out.println("Student details deleted successfully.");
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}