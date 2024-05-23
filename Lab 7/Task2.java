interface Payable{
    double getpaymentAmount();
}
abstract class Employee implements Payable{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    Employee(String fname,String lname,String ssn){
        firstName=fname;
        lastName=lname;
        socialSecurityNumber=ssn;
    }
}
class SalariedEmployee extends Employee{
    private double weeklySalary;
    SalariedEmployee(String fname,String lname,String ssn,double wks){
        super(fname,lname,ssn);
        weeklySalary=wks;
    }

    @Override
    public double getpaymentAmount() {
        return weeklySalary;
    }
}

class Invoice implements Payable{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    Invoice(String partNumber,String partDescription,int quantity,double pricePerItem){
        this.partNumber=partNumber;
        this.partDescription=partDescription;
        this.quantity=quantity;
        this.pricePerItem=pricePerItem;
    }
    @Override
    public double getpaymentAmount() {
        return quantity*pricePerItem;
    }

}

public class Task2 {
    public static void main(String[] args) {
        Employee e = new SalariedEmployee("awias","amjad","21112",234);
        System.out.println(e.getpaymentAmount());
        
        Invoice inv = new Invoice("432", "nut", 5, 54);
        System.out.println(inv.getpaymentAmount());
    }
}
