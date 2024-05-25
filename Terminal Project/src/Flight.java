package src ;

import java.util.ArrayList;

public class Flight {
    private String flightNumber;
    private Airline airline;
    private Time departureTime;
    private Time arrivalTime;
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
    public Flight(String flightNumber, Airline airline, Time departureTime, Time arrivalTime,ArrayList<Passenger> passengers,Gate gate,String destination) {
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
    public Time getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }
    public Time getArrivalTime() {
        return arrivalTime;
    }
    public void setArrivalTime(Time arrivalTime) {
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
        return "Flight Number : "+flightNumber+"\nAirline : "+airline.toString()+"\nDeparture Time : "+departureTime.toString()+"\nArrival Time : "+arrivalTime.toString()+"\nPassengers : "+passengers.toString()+"\nGate : "+gate.toString()+"\n";
    }
    public void display(){
        System.out.println("Flight Number : "+flightNumber);
        System.out.println("Airline : "+airline.getName());
        System.out.println("Departure Time : "+departureTime.toString());
        System.out.println("Arrival Time : "+arrivalTime.toString());
        System.out.println("Number of Passenger : "+passengers.size() );
        System.out.println("Gate : "+gate.toString());
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


}
