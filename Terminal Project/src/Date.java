package src;
public class Date {
    private int day;
    private int month;
    private int year;

    Date(){
        day=0;
        month=0;
        year=0;
    }
    Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String toString(){
        return "Month : "+month+"\nDay : "+day+"\nYear : "+year+"\n";
    }
    public void display(){
        System.out.println("Month : "+month+"\nDay : "+day+"\nYear : "+year);
    }
}
