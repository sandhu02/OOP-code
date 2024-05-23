import java.util.Scanner;

class Worker{
    static String name;
    static int hours;
    static double wage;
    public static void takeInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter details of worker  ");
        System.out.print("Enter name : ");
        name=input.nextLine();
        System.out.print("Enter hours worked : ");
        hours=input.nextInt();
        System.out.print("Enter hourly wage : ");
        wage=input.nextDouble();
    }


    private String workerName;
    private int hoursWorked;
    private double hourlyWage;

    public Worker(){
        workerName=null;
        hoursWorked=0;
        hourlyWage=0.0;
    }
    public Worker(String workerName,int hoursWorked,double hourlyWage){
        this.workerName=workerName;
        this.hoursWorked=hoursWorked;
        this.hourlyWage=hourlyWage;
    }
    public double calculate_pay(){
        double pay=hoursWorked*hourlyWage;
        if (hoursWorked > 40.0){
            pay = pay + (0.5 * hourlyWage * (hoursWorked - 40));
        }
        return pay;
    } 
    public void displayDetails(){
        System.out.println("Name : "+workerName);
        System.out.println("Total pay : "+calculate_pay());
    }
}

public class Q1{
    public static void main(String[] args) {
        Worker.takeInput();    
        Worker w1 = new Worker(Worker.name,Worker.hours,Worker.wage);
        w1.displayDetails();
        System.out.println();
        Worker.takeInput();
        Worker w2 = new Worker(Worker.name,Worker.hours,Worker.wage);
        w2.displayDetails();
    }
}