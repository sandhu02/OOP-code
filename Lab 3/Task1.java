class Marks{
    private int marks1;
    private int marks2;
    private int marks3;

    Marks(){
        marks1=0;
        marks2=0;
        marks3=0;
    }
    Marks(int m1,int m2,int m3){
        marks1=m1;
        marks2=m2;
        marks3=m3;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }
    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }
    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }
    public int getMarks1() {
        return marks1;
    }
    public int getMarks2() {
        return marks2;
    }
    public int getMarks3() {
        return marks3;
    }
    public int CalcAverage(){
        return (marks1+marks2+marks3)/2;
    }

}

public class Task1{
    public static void main(String[] args){
        Marks marks = new Marks();
        marks.setMarks3(5);
        marks.setMarks2(6);
        marks.setMarks3(7);
        System.out.println(marks.CalcAverage());
    } 
}