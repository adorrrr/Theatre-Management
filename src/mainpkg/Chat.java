package mainpkg;

import java.io.Serializable;




public class Chat implements Serializable{
    String massage;
    String Department;

    public Chat(String massage, String Department) {
        this.massage = massage;
        this.Department=Department;
    }

    public String getMassage() {
        return massage;
    }

    public String getDepartment() {
        return Department;
    }
    
    
}
