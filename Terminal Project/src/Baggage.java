package src;

import java.io.Serializable;

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
}
