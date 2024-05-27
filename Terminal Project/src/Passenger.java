package src;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Passenger extends Person implements Serializable{
    private String passportNumber;
    private Ticket ticket;
    public Passenger() {
        super();
        passportNumber="";
        ticket=null;
    }
    public Passenger(String name, String contactNumber, String email, String passportNumber, Ticket ticket) {
        super(name, contactNumber, email);
        this.passportNumber = passportNumber;
        this.ticket = ticket;
    }
    public String getPassportNumber() {
        return passportNumber;
    }
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    @Override
    public String toString() {
        return super.toString()+"passportNumber=" + passportNumber + ", ticket=" + ticket + "\n";
    }


    public static void writeToFile(Passenger passenger){
        try{
            File f = new File("C:\\D-drive-53140\\Semester 3\\OOP\\Terminal Project\\data\\passengerData.ser");
            ObjectOutputStream oos;

            if (f.exists()){
                oos = new MyObjectoutputStream(new FileOutputStream(f,true));
            }
            else {
                oos = new ObjectOutputStream(new FileOutputStream(f));
            }
             
            oos.writeObject(passenger);
            oos.close();
        }
        catch(IOException e){
            System.out.println("Error while writing");
            System.out.println(e.getMessage());
        }
    }
    
    public static ArrayList<Passenger> readFromFile(){
        ArrayList <Passenger> arr = new ArrayList<Passenger>();
        ObjectInputStream ois;

        try {
            ois = new ObjectInputStream(new FileInputStream("C:\\D-drive-53140\\Semester 3\\OOP\\Terminal Project\\data\\passengerData.ser"));
            while (true){
                Passenger p = (Passenger)ois.readObject(); 
                arr.add(p);
            }
        }
        catch (ClassNotFoundException e1){
            System.out.println("Class not found ");
        }
        catch (EOFException e2){
            return arr;
        }
        catch (IOException e3){
            System.out.println("File not found in reader ");
        }
        return arr;
    }
    public static void deletePassenger(String passportNumber){
        ArrayList <Passenger> arr = readFromFile(); 
        for (int i=0;i<arr.size();i++){
            if (arr.get(i).getPassportNumber().equals(passportNumber)){
                arr.remove(i);
                break;
            }
        }
        File f = new File("C:\\D-drive-53140\\Semester 3\\OOP\\Terminal Project\\data\\passengerData.ser");
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            for (int i=0;i<arr.size();i++){
                oos.writeObject(arr.get(i));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
