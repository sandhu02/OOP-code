interface Shape{
    double PI=3.14;
    double calcArea();
}
class Circle implements Shape,Comparable{
    private double radius;
    Circle(double r){
        radius=r;
    } 
    @Override
    public double calcArea() {
        return PI*radius*radius;
    }

    @Override
    public int compareTo(Object o) {
        Circle c = (Circle) o;
        int result=0;
        if (this.radius==c.radius){
            result= 0;
        }
        else if (this.radius>c.radius){
            result= 1;
        }
        else if (this.radius<c.radius){
            result= -1;
        }
        return result;
    }
}
class Rectangle implements Shape,Comparable{
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

    @Override
    public int compareTo(Object o) {
        Rectangle r = (Rectangle)o;
        int result=0;
        if (this.calcArea()==r.calcArea()){
            result=0;
        }
        else if (this.calcArea()>r.calcArea()){
            result=1;
        }
        else if (this.calcArea()<r.calcArea()){
            result=-1;
        }
        return result;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(5);
        System.out.println(c1.compareTo(c2));

        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(2, 3);
        System.out.println(r1.compareTo(r2));
    }
    
}
