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
public class ShowsInfo {
    private final String text;
    private final String showName;
    private final int seat;
    private final String vanue;
    public final LocalDate date;
    private final float price;
    private final float time;
    
    public ShowsInfo (String text, String showName, int seat, String vanue, LocalDate date, float price, float time )
    {
        this.text = text;
        this.showName = showName;
        this.seat = seat;
        this.vanue= vanue;
        this.date = date;
        this.price = price;
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public String getShowName() {
        return showName;
    }

    public int getSeat() {
        return seat;
    }

    public String getVanue() {
        return vanue;
    }

    public LocalDate getDate() {
        return date;
    }

    public float getPrice() {
        return price;
    }

    public float getTime() {
        return time;
    }
    
    
    
}
