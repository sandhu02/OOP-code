abstract class Person {
    protected String name;
    Person(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "name : "+name;
    }
    public abstract boolean isOutstanding();
}
class Student extends Person{
    private double cgpa;
    Student(String name,double cgpa){
        super(name);
        this.cgpa=cgpa;
    }
    public double getCgpa() {
        return cgpa;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public String tosString(){
        return "cgpa : "+cgpa+"\n"+super.toString();
    }
    @Override
    public boolean isOutstanding() {
        if (cgpa>3.5){
            return true;
        }
        else{
            return false;
        }
    }
}
class Professor extends Person{
    private double numberofPublications;
    Professor(String name,double numberofPublications){
        super(name);
        this.numberofPublications=numberofPublications;
    }
    public double getNumberofPublications() {
        return numberofPublications;
    }
    public void setNumberofPublications(double numberofPublications) {
        this.numberofPublications = numberofPublications;
    }
    public String tosString(){
        return "numberofPublications : "+numberofPublications+"\n"+super.toString();
    }
    @Override
    public boolean isOutstanding() {
        if (numberofPublications>50){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Task3{
    public static void main(String[] args) {
        
    }
} 