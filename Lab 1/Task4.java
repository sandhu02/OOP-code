import java.lang.Math;

class Triangle{
    double angle1;
    double angle2;
    double angle3;
    
    double length1;
    double length2;
    double length3;
    
    void calculateLengths(double length1,double length2,double length3){
        
        angle1 = -(Math.acos((length3-length2-length1)/2*length1*length2))* (180/Math.toRadians(Math.PI));
        angle2 = Math.asin(length3);
        angle3 = Math.atan(length2);

        System.out.println("Angle 1 : "+angle1+"\nAngle 2 : "+angle2+"\nAngle 3 : "+angle3);
    }
}

public class Task4 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        triangle.calculateLengths(3, 4, 5);
    }
    
}
