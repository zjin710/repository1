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
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public abstract class Admin {
    private String adminID;
    private String name;
    private String password;
    private String email;
    private String phoneNumber;
    protected static final String loginFile = "login.txt";
    protected static final String staffFile = "staff.txt";
    
    public Admin(String adminid){
        this.adminID = adminid;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(staffFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 7 && data[0].equals(adminID)) {
                    this.name = data[1];
                    this.password = data[2];
                    this.email = data[3];
                    this.phoneNumber = data[4];
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Empty constructor for Admin_Student and Admin_Lecturer
    public Admin() {
    }
    
    public String getID() {
        return adminID;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPhoneNum() {
        return phoneNumber;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNumber = phoneNum;
    }
    
    // Abstract method
    public abstract void populateTableFromFile(String filename, JTable table);
    
    // Register a user
    public boolean registerUser(String userid, String name, String password, String role) {
        List<String> fileContents = new ArrayList<>();
        boolean userExists = false;

        // Read the file and check if the user ID already exists
        try (BufferedReader reader = new BufferedReader(new FileReader(loginFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length > 0 && data[0].equals(userid)) {
                    userExists = true;
                    break; // Exit the loop if user ID is found
                }
                fileContents.add(line); // Store existing lines to write back later
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return false; // Register failed
        }

        if (userExists) {
            JOptionPane.showMessageDialog(null, "User ID already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            return false; // Register failed
        }

        // Add the new user details
        fileContents.add(userid + "," + name + "," + password + "," + role);

        // Write all data back to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(loginFile))) {
            for (String fileLine : fileContents) {
                writer.write(fileLine);
                writer.newLine();
            }
            System.out.println("User added to login file: " + name);
            return true; // Register successful
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            return false; // Register failed
        }
    }
    
    public void registerByBatch(String newFilePath, String existingFilePath, String role) {
        // Use a Set to keep track of existing user IDs for quick lookup
        Set<String> existingUserIDs = new HashSet<>();

        // Read existing user IDs from the existing file
        try (BufferedReader reader = new BufferedReader(new FileReader(existingFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length > 0) {
                    existingUserIDs.add(parts[0]);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading existing file: " + e.getMessage());
            e.printStackTrace();
            return; // Exit if there's an error reading the existing file
        }

        // Process the new file and append data to the existing file and login file
        try (BufferedReader br = new BufferedReader(new FileReader(newFilePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(existingFilePath, true));
             BufferedWriter bwLogin = new BufferedWriter(new FileWriter(loginFile, true))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    String userID = parts[0];

                    // Check if the user ID already exists
                    if (existingUserIDs.contains(userID)) {
                        System.err.println("User ID already exists: " + userID);
                        continue; // Skip this user ID and move to the next line
                    }

                    // Add the new user ID to the set of existing user IDs
                    existingUserIDs.add(userID);

                    // Append data to the existing file
                    bw.write(line);
                    bw.newLine();

                    // Prepare login data and append to the login file
                    String loginData = String.join(",", parts[0], parts[1], parts[2], role);
                    bwLogin.write(loginData);
                    bwLogin.newLine();
                }
            }
            System.out.println("Data successfully appended to files.");

        } catch (IOException ex) {
            System.err.println("Error reading or writing files: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    // Amend student details
    public boolean updateUser(String userid, String newName, String newPassword, String role) {
        List<String> updatedUser = new ArrayList<>();

        boolean found = false; // Flag to track if the student is found for update

        try (BufferedReader reader = new BufferedReader(new FileReader(loginFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4 && data[0].equals(userid)) {
                    // Found the student, update the fields
                    data[1] = newName;
                    data[2] = newPassword;
                    data[3] = role;
                    found = true; // Set the flag to indicate student found for update
                }
                updatedUser.add(String.join(",", data));
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return false; // Update failed
        }

        if (!found) {
            System.err.println("User not found for update.");
            return false; // Student not found for update
        }

        // Write the updated data back to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(loginFile))) {
            for (String updatedLine : updatedUser) {
                writer.write(updatedLine);
                writer.newLine();
            }
            return true; // Update successful
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
            return false; // Update failed
        }
    }
    
    // Delete user
    public void deleteUser(String userid) {
        List<String> updatedUser = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(loginFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4 && data[0].equals(userid)) {
                    // Skip this line, as it contains the details of the user to be deleted
                    continue;
                }
                updatedUser.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return; // Deletion failed
        }

        // Write the updated data back to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(loginFile))) {
            for (String updatedLine : updatedUser) {
                writer.write(updatedLine);
                writer.newLine();
            }
            System.out.println("User details deleted successfully.");
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}