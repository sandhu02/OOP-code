package src ;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Flight implements Serializable{
    private String flightNumber;
    private Airline airline;
    private Timee departureTime;
    private Timee arrivalTime;
    private ArrayList <Passenger> passengers;
    private Gate gate;
    private String destination;

    public Flight() {
        flightNumber = "";
        airline = null;
        departureTime = null;
        arrivalTime = null;
        passengers = new ArrayList<Passenger>();
        gate = null;
        destination = "";
    }
    public Flight(String flightNumber, Airline airline, Timee departureTime, Timee arrivalTime,ArrayList<Passenger> passengers,Gate gate,String destination) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.passengers = passengers;
        this.gate=gate;
        this.destination = destination;
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    public Airline getAirline() {
        return airline;
    }
    public void setAirline(Airline airline) {
        this.airline = airline;
    }
    public Timee getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(Timee departureTime) {
        this.departureTime = departureTime;
    }
    public Timee getArrivalTime() {
        return arrivalTime;
    }
    public void setArrivalTime(Timee arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }
    public Gate getGate() {
        return gate;
    }
    public void setGate(Gate gate) {
        this.gate = gate;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String toString(){
        return "Flight Number : "+flightNumber+", Airline : "+airline.toString()+", Departure Timee : "+departureTime.toString()+", Arrival Timee : "+arrivalTime.toString()+", Passengers : "+passengers.toString()+", Gate : "+gate.toString()+", Destination : "+destination+" , ";
    }
    public void display(){
        System.out.println("Flight Number : "+flightNumber);
        System.out.println("Airline : "+airline.getName());
        System.out.println("Departure Timee : "+departureTime.toString());
        System.out.println("Arrival Timee : "+arrivalTime.toString());
        System.out.println("Number of Passenger : "+passengers.size() );
        System.out.println("Gate : "+gate.toString());
        System.out.println("Destination : "+destination);
    }

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }
    public void removePassenger(String passportNumber){
        for (int i=0;i<passengers.size();i++){
            if (passengers.get(i).getPassportNumber().equals(passportNumber)){
                passengers.remove(passengers.get(i));
            }
        }
    }

    public static void writeToFile(Flight flight){
        try{
            File f = new File("C:\\D-drive-53140\\Semester 3\\OOP\\Terminal Project\\data\\flightData.ser");
            ObjectOutputStream oos;

            if (f.exists()){
                oos = new MyObjectoutputStream(new FileOutputStream(f,true));
            }
            else {
                oos = new ObjectOutputStream(new FileOutputStream(f));
            }
             
            oos.writeObject(flight);
            oos.close();
        }
        catch(IOException e){
            System.out.println("Error while writing");
        }
    }
    
    public static ArrayList<Flight> readFromFile(){
        ArrayList <Flight> arr = new ArrayList<Flight>();
        ObjectInputStream ois;

        try {
            FileInputStream fis = new FileInputStream("C:\\D-drive-53140\\Semester 3\\OOP\\Terminal Project\\data\\flightData.ser");
            ois = new ObjectInputStream(fis);
            while (true){
                Flight p = (Flight)ois.readObject(); 
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
    public static void deletePassenger(String flightNumber){
        ArrayList <Flight> arr = readFromFile(); 
        for (int i=0;i<arr.size();i++){
            if (arr.get(i).getFlightNumber().equals(flightNumber)){
                arr.remove(i);
                break;
            }
        }
        File f = new File("C:\\D-drive-53140\\Semester 3\\OOP\\Terminal Project\\data\\flightData.ser");
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
