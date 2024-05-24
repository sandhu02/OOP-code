import java.util.ArrayList;

public class Flight {
    private String flightNumber;
    private Airline airline;
    private Time departureTime;
    private Time arrivalTime;
    private ArrayList <Passenger> passengers;

    public Flight() {
        flightNumber = "";
        airline = null;
        departureTime = null;
        arrivalTime = null;
        passengers = new ArrayList<Passenger>();
    }
    public Flight(String flightNumber, Airline airline, Time departureTime, Time arrivalTime,ArrayList<Passenger> passengers) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.passengers = passengers;
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
}
