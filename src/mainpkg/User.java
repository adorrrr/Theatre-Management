/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author World gate computer
 */
public class User implements Serializable{
    String Name;
    int ID;
    String Password;
    LocalDate Date;
    String Group;

    public User(String Name, int ID, String Password, LocalDate Date, String value1) {
        this.Name = Name;
        this.ID = ID;
        this.Password = Password;
        this.Date = Date;
        this.Group = Group;
    }

    public String getName() {
        return Name;
    }

    public int getID() {
        return ID;
    }

    public String getPassword() {
        return Password;
    }

    public LocalDate getDate() {
        return Date;
    }

    public String getGroup() {
        return Group;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setDate(LocalDate Date) {
        this.Date = Date;
    }

    public void setGroup(String Group) {
        this.Group = Group;
    }
    
    
}
