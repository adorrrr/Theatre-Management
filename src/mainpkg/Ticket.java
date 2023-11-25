/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.time.LocalDate;

/**
 *
 * @author World gate computer
 */
public class Ticket {
    private final String showsNameComboBox;
    private final LocalDate dob;
    private final int userIDTextField;
    private final int noOfTicket;
    private final String membershipCode;

    public Ticket(String showsNameComboBox, LocalDate dob, int userIDTextField, int noOfTicket, String membershipCode) {
        this.showsNameComboBox = showsNameComboBox;
        this.dob = dob;
        this.userIDTextField = userIDTextField;
        this.noOfTicket = noOfTicket;
        this.membershipCode = membershipCode;
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

    @Override
    public String toString() {
        return "Ticket{" + "showsNameComboBox=" + showsNameComboBox + ", dob=" + dob + ", userIDTextField=" + userIDTextField + ", noOfTicket=" + noOfTicket + ", membershipCode=" + membershipCode + '}';
    }
    
    
}
