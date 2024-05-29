package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import src.Airline;
import src.Flight;
import src.Gate;
import src.Passenger;
import src.Timee;

public class AddFlightsPage extends JFrame{
    JLabel enterflightNum;
    JLabel enterairline;
    JLabel enterairlineCode;
    JLabel enterDepartureTime;
    JLabel enterArrivalTime;
    JLabel entergate;
    JLabel enterDestination;

    JTextField flightNumfield;
    JTextField airlinefield;
    JTextField airlineCodeField;
    JTextField departurefield;
    JTextField arrivalfield;
    JTextField gateField;
    JTextField destinationfield;

    JButton submitButton;
    JButton discardButton; 
    
    public AddFlightsPage(){
        setTitle("Book Ticket");
        setSize(1000,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(8,2));

        enterflightNum = new JLabel("Flight Number");
        enterairline = new JLabel("Airline Name");
        enterairlineCode = new JLabel("Airline Code");
        enterDepartureTime = new JLabel("Departure Time");
        enterArrivalTime = new JLabel("Arrival Time");
        entergate = new JLabel("Gate Number");
        enterDestination = new JLabel("Destination");
        
        flightNumfield = new JTextField(20);
        airlinefield = new JTextField(20);
        airlineCodeField = new JTextField(20);
        departurefield = new JTextField(20);
        arrivalfield = new JTextField(20);
        gateField = new JTextField(20);
        destinationfield = new JTextField(20);

        submitButton = new JButton("Submit");
        discardButton = new JButton("Discard and Exit");

        MyActionListener listener = new MyActionListener();

        submitButton.addActionListener(listener);
        discardButton.addActionListener(listener);

        add(enterflightNum);
        add(flightNumfield);
        add(enterairline);
        add(airlinefield);
        add(enterairlineCode);
        add(airlineCodeField);
        add(enterDepartureTime);
        add(departurefield);
        add(enterArrivalTime);
        add(arrivalfield);
        add(entergate);
        add(gateField);
        add(enterDestination);
        add(destinationfield);
        
        add(discardButton); add(submitButton);
    }

    public class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if (ae.getActionCommand().equals("Submit")){
                ArrayList<Passenger> passengersList= Passenger.readFromFile();
                
                Flight flight = new Flight(flightNumfield.getText(), new Airline(airlinefield.getText(), airlineCodeField.getText()), new Timee(29,5,2024,4,00), 
                new Timee(29,5,2024,9,30), passengersList, new Gate(gateField.getText()), destinationfield.getText());
                Flight.writeToFile(flight);

                JOptionPane.showMessageDialog(null,"Flight Data has been added");
                dispose();
                StaffPage staffPage = new StaffPage(); 
            }
            else if (ae.getActionCommand().equals("Discard and Exit")){
                dispose();
                PassengerPage p = new PassengerPage(); 
            }
        }
    }
}
