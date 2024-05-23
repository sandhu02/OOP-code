public class Staff{
    private String designation;
    private double salary;
    Staff(){
        designation="";
        salary=0;
    }
    Staff(String designation, double salary){
        this.designation=designation;
        this.salary=salary;
    }
    public String getDesignation() {
        return designation;
    }
    public double getSalary() {
        return salary;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayInfo(){
        System.out.println("Designation : "+designation);
        System.out.println("Salary : "+salary);
    }
}

