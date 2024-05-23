interface Shape{
    double PI=3.14;
    
    double calcArea();
}
class Circle implements Shape{
    private double radius;
    Circle(double r){
        radius=r;
    } 
    @Override
    public double calcArea() {
        return PI*radius*radius;
    }
}
class Rectangle implements Shape{
    private double length;
    private double width;

    Rectangle(double l,double w){
        length =l;
        width=w;
    }
    @Override
    public double calcArea(){
        return length*width;
    }
}

public class Task1{
    public static void main(String[] args) {
        Circle c = new Circle(2);
        System.out.println(c.calcArea());
        Rectangle r = new Rectangle(3, 5);
        System.out.println(r.calcArea());
    }
}