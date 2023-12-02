/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;




public class Membership {
    protected String UserName;
    protected int UserID;
    protected int last4digits;
    protected int UserNumber;

    public Membership(String UserName, int UserID, int last4digits, int UserNumber) {
        this.UserName = UserName;
        this.UserID = UserID;
        this.last4digits = last4digits;
        this.UserNumber = UserNumber;
    }

    public String getUserName() {
        return UserName;
    }

    public int getUserID() {
        return UserID;
    }

    public int getLast4digits() {
        return last4digits;
    }

    public int getUserNumber() {
        return UserNumber;
    }
    
    
    
}
