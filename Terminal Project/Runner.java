import java.util.ArrayList;

import gui.BookTicketPage;
import gui.HOME;
import gui.PassengerPage;
import src.Passenger;
import src.Staff;
import src.Ticket;

public class Runner{
    public static void main(String[] args) {
        // HOME h = new HOME();
        // BookTicketPage p = new BookTicketPage();
        // PassengerPage p= new PassengerPage();

        // Ticket ticket1 = new Ticket("6404", 45, 1200);
        // Passenger passenger1 = new Passenger("awais", "03008767", "awais@gmail.com", "31104", ticket1);
        // // Passenger.writeToFile(passenger1);
        // ArrayList<Passenger> arr=Passenger.readFromFile(); 
        // System.out.println(arr);

        // Staff staff = new Staff("rafay", "0304990", "rafay@gmail.com", "0054", "traffic control");
        // Staff.writeToFile(staff);
        ArrayList<Staff> arr2 =  Staff.readFromFile();
        System.out.println(arr2);


    }
}