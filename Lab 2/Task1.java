class Circle{
    public int radius;
    Circle(int r){
        radius =r;
    }    
    Circle(){
        radius=1;
    }

    public double CalcCircumference(int radius){
        return 2*3.1415*radius;
    }
}
public class Task1{
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.CalcCircumference(circle.radius));
        
        Circle circle2 = new Circle(6);
        System.out.println(circle2.CalcCircumference(circle2.radius));
    }

}