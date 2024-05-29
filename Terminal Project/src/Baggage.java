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

public class Baggage implements Serializable{
    private String baggageId;
    private Passenger passenger;
    private Flight flight;
    private String status;
    
    public Baggage(){
        baggageId="";
        passenger=null;
        flight=null;
        status="";
    }
    public Baggage(String baggageId, Passenger passenger, Flight flight, String status) {
        this.baggageId = baggageId;
        this.passenger = passenger;
        this.flight = flight;
        this.status = status;
    }
    public String getBaggageId() {
        return baggageId;
    }
    public void setBaggageId(String baggageId) {
        this.baggageId = baggageId;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    public Flight getFlight() {
        return flight;
    }
    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "baggageId=" + baggageId + ", passenger=" + passenger + ", flight=" + flight + ", status="
                + status + ", ";
    } 


    public static void writeToFile(Baggage passenger){
        try{
            File f = new File("C:\\D-drive-53140\\Semester 3\\OOP\\Terminal Project\\data\\baggageData.ser");
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
    
    public static ArrayList<Baggage> readFromFile(){
        ArrayList <Baggage> arr = new ArrayList<Baggage>();
        ObjectInputStream ois;

        try {
            ois = new ObjectInputStream(new FileInputStream("C:\\D-drive-53140\\Semester 3\\OOP\\Terminal Project\\data\\baggageData.ser"));
            while (true){
                Baggage p = (Baggage)ois.readObject(); 
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
    public static void deletePassenger(String baggageID){
        ArrayList <Baggage> arr = readFromFile(); 
        for (int i=0;i<arr.size();i++){
            if (arr.get(i).getBaggageId().equals(baggageID)){
                arr.remove(i);
                break;
            }
        }
        File f = new File("C:\\D-drive-53140\\Semester 3\\OOP\\Terminal Project\\data\\baggageData.ser");
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
    public static Baggage searchPassenger(String baggageID){
        ArrayList <Baggage> arr = readFromFile(); 
        for (int i=0;i<arr.size();i++){
            if (arr.get(i).getBaggageId().equals(baggageID)){
                return arr.get(i);
            }
        }
        return null;
    }
}
