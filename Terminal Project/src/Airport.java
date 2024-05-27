package src;
import java.io.Serializable;
import java.util.ArrayList;

public class Airport implements Serializable{
    private String name;
    private ArrayList <Flight> flights; 
    private ArrayList <Staff> staff;
    private ArrayList <Gate> gates;
    private ArrayList <String> destinations;

    public Airport(String name, ArrayList<Flight> flights, ArrayList<Staff> staff, ArrayList<Gate> gates,ArrayList<String> destinations) {
        this.name = name;
        this.flights = flights;
        this.staff = staff;
        this.gates = gates;
        this.destinations = destinations;
    }
    Airport(){
        name="";
        flights = new ArrayList<Flight>();
        staff = new ArrayList<Staff>();
        gates = new ArrayList<Gate>();
        destinations = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }
    public ArrayList<Flight> getFlights() {
        return flights;
    }
    public ArrayList<Gate> getGates() {
        return gates;
    }
    public ArrayList<Staff> getStaff() {
        return staff;
    }
    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }
    public void setGates(ArrayList<Gate> gates) {
        this.gates = gates;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStaff(ArrayList<Staff> staff) {
        this.staff = staff;
    }
    public ArrayList<String> getDestinations() {
        return destinations;
    }
    public void setDestinations(ArrayList<String> destinations) {
        this.destinations = destinations;
    }

    public String toString(){
        return "Name of Airport : "+name+"\nFlights : "+flights.toString()+"\nStaff members : "+staff.toString()+"\nGates : "+gates.toString()+"\n";
    }
    public void display(){
        System.out.println( "Name of Airport : "+name+"\nNumber of Flights : "+flights.size()+"\nNumber of Staff members : "+staff.size()+"\nNumber of Gates : "+gates.size()+"\n");
    }

    public void addFlight(Flight flight){
        flights.add(flight);
    }
    public void addStaff(Staff staffObj){
        staff.add(staffObj);
    }
    public void addgate(Gate gate){
        gates.add(gate);
    }
    public void addDestination(String destination){
        destinations.add(destination);
    }
}