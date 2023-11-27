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
public class SchedulePick implements Serializable {
    final String department;
    final int time;
    final LocalDate Date;
    final String schedule;

    public SchedulePick(String department, int time, LocalDate Date, String schedule) {
        this.department = department;
        this.time = time;
        this.Date = Date;
        this.schedule = schedule;
    }

    public String getDepartment() {
        return department;
    }

    public int getTime() {
        return time;
    }

    public LocalDate getDate() {
        return Date;
    }

    public String getSchedule() {
        return schedule;
    }
    
    
}
