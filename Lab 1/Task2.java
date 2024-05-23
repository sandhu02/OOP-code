class Time{
    int hours;
    int minutes;
    int seconds;

    void setTime(int h,int min,int sec){
        hours = h;
        minutes = min;
        seconds = sec;
    }
    
    void displayTime(){
        System.out.println(hours+" : "+minutes+" : "+seconds);
    }
}

public class Task2 {


    public static void main(String[] args) {
        Time time = new Time();

        time.setTime(12, 31, 56);

        time.displayTime();
    }
    
}
