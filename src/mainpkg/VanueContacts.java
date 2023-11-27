/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author World gate computer
 */
public class VanueContacts {
     final String Address;
     final int Number;
     final String Mail;

    public VanueContacts(String Address, int Number, String Mail) {
        this.Address = Address;
        this.Number = Number;
        this.Mail = Mail;
    }

    public String getAddress() {
        return Address;
    }

    public int getNumber() {
        return Number;
    }

    public String getMail() {
        return Mail;
    }
    
}
