package mainpkg;
import java.io.Serializable;
import java.time.LocalDate;

public class EmployeeShift implements Serializable {
    protected String name;
    protected  String department;
    protected LocalDate date;
    protected String shiftStart;
    protected String shiftEnd;
    protected String presence;

    public EmployeeShift(String name, String department, LocalDate date, String shiftStart, String shiftEnd, String presence) {
        this.name = name;
        this.department = department;
        this.date = date;
        this.shiftStart = shiftStart;
        this.shiftEnd = shiftEnd;
        this.presence = presence;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getShiftStart() {
        return shiftStart;
    }

    public String getShiftEnd() {
        return shiftEnd;
    }

    public String getPresence() {
        return presence;
    }

   

    @Override
    public String toString() {
        return "EmployeeShift{" + "name=" + name + ", department=" + department + ", date=" + date + ", shiftStart=" + shiftStart + ", shiftEnd=" + shiftEnd + ", presence=" + presence + '}';
    }
    
}



