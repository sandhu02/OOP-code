class Time{
    int hour;
    int min;
    int seconds;

    Time(){
        hour=1;
        min=1;   
        seconds=1;
        
    }
    Time(int hour,int min,int seconds){
        if (ifValid(hour, min, seconds)){
            this.hour=hour;
            this.min=min;
            this.seconds=seconds;
        }
        else{
            System.out.println("Invalid value of time entered ");
        }
        
    }

    public boolean ifValid(int hour,int min,int seconds){
        if (hour>=0 && hour<=23 && min>=0 && min<=60 && seconds>=0 && seconds<=60){
            return true;
        }
        else{
            return false;
        }
    }

    public void display(){
        System.out.println(hour+" : "+min+" : "+seconds);
    }
}


public class Task5 {
    public static void main(String[] args) {
        Time time = new Time();
        time.display();
        System.out.println();

        int hour=9;
        int min= 43;
        int seconds= 38;

        Time time2 = new Time(hour,min,seconds);
        time2.display();
    }
    
}
