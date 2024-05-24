import java.util.ArrayList;

public class Airport {
    private String name;
    private ArrayList <Flight> flights; 
    private ArrayList <Staff> staff;
    private ArrayList <Gate> gates;

    Airport(){
        name="";
        flights = new ArrayList<Flight>();
        staff = new ArrayList<Staff>();
        gates = new ArrayList<Gate>();
    }
    Airport(String name,ArrayList <Flight> flights,ArrayList <Staff> staff,ArrayList <Gate> gates){

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
    public String toString(){
        return "Name of Airport : "+name+"\nFlights : "+flights.toString()+"\nStaff members : "+staff.toString()+"\nGates : "+gates.toString()+"\n";
    }
    public void display(){
        System.out.println( "Name of Airport : "+name+"\nNumber of Flights : "+flights.size()+"\nNumber of Staff members : "+staff.size()+"\nNumber of Gates : "+gates.size()+"\n");
    }
}