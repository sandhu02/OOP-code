public class Time extends Date {
    private int minutes;
    private int hours;

    Time(){

    }
    Time(int minutes,int hours){
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

    }
    public void display(){

    }
}
