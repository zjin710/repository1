/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project_Manager;

import java.io.*;

/**
 *
 * @author Victor
 */
public class SS implements Serializable
{
    private String ProjectID;
    private String LecturerID;
    private String Positon;

    public SS(String ProjectID, String LecturerID, String Positon) {
        this.ProjectID = ProjectID;
        this.LecturerID = LecturerID;
        this.Positon = Positon;
    }
    
    public boolean equals(SS ss)
    {
        return (this.ProjectID.equals(ProjectID) && this.LecturerID.equals(LecturerID));
    }

    public String getProjectID() {
        return ProjectID;
    }

    public void setProjectID(String ProjectID) {
        this.ProjectID = ProjectID;
    }

    public String getLecturerID() {
        return LecturerID;
    }

    public void setLecturerID(String LecturerID) {
        this.LecturerID = LecturerID;
    }

    public String getPositon() {
        return Positon;
    }

    public void setPositon(String Positon) {
        this.Positon = Positon;
    }
}
