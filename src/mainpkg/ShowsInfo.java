package mainpkg;

import java.io.Serializable;
import java.time.LocalDate;


public class ShowsInfo implements Serializable{
     final String text;
     final String showName;
     final int seat;
     final String vanue;
     final LocalDate date;
     final float price;
     final String time;
    
    public ShowsInfo (String text, String showName, int seat, String vanue, LocalDate date, float price, String time )
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

    public String getTime() {
        return time;
    }
    
    
    
}
