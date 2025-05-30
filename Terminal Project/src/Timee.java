package src;

import java.io.Serializable;

public class Timee extends Date implements Serializable {
    private int minutes;
    private int hours;

    public Timee(){
        super();
        minutes=0;
        hours=0;
    }
    public Timee(int day,int month,int year,int minutes,int hours){
        super(day, month, year);
        this.minutes=minutes;
        this.hours=hours;
    }

    public int getMinutes() {
        return minutes;
    }
    public int getHours() {
        return hours;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }

    public String toString(){
        return "Hours : "+hours+"\nMinutes : "+minutes+"\n"+super.toString()+"\n";
    }
    public void display(){
        System.out.println("Hours : "+hours+"\nMinutes : "+minutes);
        super.display();
    }
}
