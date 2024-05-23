abstract class Employee{
    protected String firstName;
    protected String lastName;
    protected String SSN;
    Employee(String firstName,String lastName,String SSN){
        this.firstName=firstName;
        this.lastName=lastName;
        this.SSN=SSN;
    }
    Employee (){
        firstName="";
        lastName="";
        SSN="";
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSSN() {
        return SSN;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String toString(){
        return "firstName : "+firstName+"\nlastName : "+lastName+"\nSSn : "+SSN;
    }
    public abstract double earnings();   
}
class WeeklyEmployee extends Employee{
    double weeklySalary;
    WeeklyEmployee(double weeklySalary,String firstName,String lastName,String SSN){
        super(firstName, lastName, SSN);
        this.weeklySalary=weeklySalary;
    }
    WeeklyEmployee(){
        super();
        weeklySalary=0;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public String toString(){
        return "weeklySalary : "+weeklySalary+"\n"+super.toString();
    }
    @Override
    public double earnings() {
        return weeklySalary;
    }
}
class HourlyEmployee extends Employee{
    int hours;
    double wagePerHour;
    HourlyEmployee(int hours,double wagePerHour,String firstName,String lastName,String SSN){
        super(firstName, lastName, SSN);
        this.hours=hours;
        this.wagePerHour=wagePerHour;
    }
    HourlyEmployee(){
        super();
        hours=0;
        wagePerHour=0;
    }
    public String toString(){
        return "hours : "+hours+"\nwageperHour : "+wagePerHour+"\n"+super.toString();
    }
    @Override
    public double earnings() {
        return hours*wagePerHour;
    }
}
class CommisionEmployee extends Employee{
    double sales;
    double commisionRate;
    CommisionEmployee(double sales,double commisionRate,String firstName,String lastName,String SSN){
        super(firstName, lastName, SSN);
        this.sales=sales;
        this.commisionRate=commisionRate;
    }
    CommisionEmployee(){
        super();
        sales=0;
        commisionRate=0;
    }
    public String toString(){
        return "sales : "+sales+"\ncommisionRate : "+commisionRate+"\n"+super.toString();
    }
    @Override
    public double earnings() {
        return sales*commisionRate;
    }
}
class BasePlusCommisionEmployee extends CommisionEmployee{
    double basicSalary;
    BasePlusCommisionEmployee(double basicSalary,String firstName,String lastName,String SSN){
        super(basicSalary, basicSalary, firstName, lastName, SSN);
        this.basicSalary=basicSalary;
    }
    BasePlusCommisionEmployee(){
        super();
        basicSalary=0;
    }
    public String toString(){
        return "basicSalary : "+basicSalary+"\n"+super.toString();
    }
    @Override
    public double earnings() {
        return basicSalary + super.earnings();
    }
}

public class Task1{
    public static void main(String[] args) {
        Employee [] employees = new Employee [4];
        employees[0] = new WeeklyEmployee();
        employees[1] = new HourlyEmployee();
        employees[2] = new CommisionEmployee();
        employees[3] = new BasePlusCommisionEmployee();

        for ( int i=0; i<=3;i++) {
            //System.out.println(employees[i].earnings());
            System.out.println(employees[i].toString());
            System.out.println();
        }

    }
}