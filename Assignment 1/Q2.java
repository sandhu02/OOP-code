class QuadraticEquation{
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(){
        a=0;
        b=0;
        c=0;
    }
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void display(){
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
    }
    public void setValues(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getDiscriminant(){
        return (b*b)-4*a*c;
    }
    public boolean checkIfDescriminantIsGretaerThan100(){
        if (getDiscriminant()>100){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        QuadraticEquation eq1 = new QuadraticEquation(2,3,4);
        eq1.display();
        System.out.println(eq1.getDiscriminant());
        System.out.println(eq1.checkIfDescriminantIsGretaerThan100());
    } 
}
