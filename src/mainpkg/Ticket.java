/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.io.Serializable;
import java.time.LocalDate;


public class Ticket implements Serializable {
    String showsNameComboBox;
    LocalDate dob;
    int userIDTextField;
    int noOfTicket;
    String membershipCode;
    String totalPrice;

    public Ticket(String showsNameComboBox, LocalDate dob, int userIDTextField, int noOfTicket, String membershipCode, String totalPrice) {
        this.showsNameComboBox = showsNameComboBox;
        this.dob = dob;
        this.userIDTextField = userIDTextField;
        this.noOfTicket = noOfTicket;
        this.membershipCode = membershipCode;
        this.totalPrice = totalPrice;
        
    }

    public String getShowsNameComboBox() {
        return showsNameComboBox;
    }

    public LocalDate getDob() {
        return dob;
    }

    public int getUserIDTextField() {
        return userIDTextField;
    }

    public int getNoOfTicket() {
        return noOfTicket;
    }

    public String getMembershipCode() {
        return membershipCode;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setShowsNameComboBox(String showsNameComboBox) {
        this.showsNameComboBox = showsNameComboBox;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setUserIDTextField(int userIDTextField) {
        this.userIDTextField = userIDTextField;
    }

    public void setNoOfTicket(int noOfTicket) {
        this.noOfTicket = noOfTicket;
    }

    public void setMembershipCode(String membershipCode) {
        this.membershipCode = membershipCode;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
    
}
