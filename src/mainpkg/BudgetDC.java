
package mainpkg;
import java.io.Serializable;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;




public class BudgetDC implements Serializable{

     String department;
     int budget;

    public BudgetDC(String department, int budget) {
        this.department = department;
        this.budget = budget;
    }

    public String getDepartment() {
        return department;
    }

    public int getBudget() {
        return budget;
    }
    
}
