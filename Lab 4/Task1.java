class Distance{
    private double feet;
    private double inches;

    Distance(){
        feet=0;
        inches=0;
    }
    Distance(double feet,double inches){
        this.feet=feet;
        this.inches=inches;
    }

    public void setFeet(double feet) {
        this.feet = feet;
    }
    public void setInches(double inches) {
        this.inches = inches;
    }
    public double getFeet() {
        return feet;
    }
    public double getInches() {
        return inches;
    }

    public Distance AddDistance(Distance distance, Distance distance2){
        Distance dis = new Distance(distance.feet+distance2.feet , distance.inches+distance2.inches);
        return dis;
    }

    public void display(){
        System.out.println("feet : "+feet+"\ninches : "+inches+"\n");
    }
}

public class Task1{
    public static void main(String[] args) {
        Distance dis = new Distance(12,44);
        dis.display();
        Distance dis2 = new Distance(22,66);
        dis2.display();
        

        Distance dis3 = new Distance();
        dis3.display();

        Distance dis4 = dis3.AddDistance(dis, dis2);
        dis4.display();
        
       
    }
}