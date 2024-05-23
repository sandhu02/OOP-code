class Marks{
    double marks1;
    double marks2;
    double marks3;

    Marks(){
        marks1=1;
        marks2=1;
        marks3=1;
    }
    Marks(double marks1,double marks2,double marks3){
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
    }

    public double CalculateSum(double marks1,double marks2,double marks3){
        return marks1+marks2+marks3;
    }

    public void display(){
        System.out.println("marks 1: "+marks1);
        System.out.println("marks 2: "+marks2);
        System.out.println("marks 3: "+marks3);
    }
}


public class Task4 {
    public static void main(String[] args) {
        Marks marks = new Marks();
        marks.display();

        System.out.println();
        
        Marks marks2 = new Marks(82,83,85);
        marks2.display();
        System.out.println("sum : "+marks2.CalculateSum(marks2.marks1, marks2.marks2, marks2.marks3));
    }
    
}
