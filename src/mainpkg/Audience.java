/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.time.LocalDate;

public class Audience extends User{

    static boolean addUser(String userType, String name, String password, LocalDate dob) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String address;
    public static LocalDate date = LocalDate.now();
    
    public Audience(String userType, String userName, String password) {
        this.userType = userType;
        this.userId = userId;
        this.userName = userName;
        this.password = password;

    };

    @Override
    public boolean login() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean changePassword() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}