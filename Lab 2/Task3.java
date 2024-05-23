class Distance{
    public double inch;
    public double feet;

    Distance(){
        inch=1;
        feet=1;
    }
    Distance(int inch,int feet){
        this.inch=inch;
        this.feet=feet;
    }

    public void display(){
        System.out.println("Inch = "+inch+"\nFeet = "+feet);
    }
}

public class Task3 {
    public static void main(String[] args) {
        Distance distance = new Distance();
        distance.display();

        Distance distance2=new Distance(45,12);
        distance2.display();
    }
    
}
