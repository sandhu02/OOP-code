package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import src.Baggage;
import src.Flight;
import src.Passenger;
import src.Ticket;

public class EnterbaggagePage extends JFrame{
    JLabel passengerlabel;
    JLabel flightlabel;
    
    JTextField passengerField;
    JTextField flightField;

    JButton submitButton;
    JButton backButton;

    public EnterbaggagePage(){
        setTitle("Baggage Details Page");
        setSize(1000,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(3,2));

        passengerlabel = new JLabel("Enter Passport Number");
        flightlabel = new JLabel("Enter flight Number");

        passengerField = new JTextField(20);
        flightField = new JTextField(20);

        submitButton = new JButton("Submit");
        backButton = new JButton("Go Back");

        MyActionListener actionListener = new MyActionListener();
        submitButton.addActionListener(actionListener);
        backButton.addActionListener(actionListener);

        add(passengerlabel);
        add(passengerField);
        add(flightlabel);
        add(flightField);
        add(backButton);
        add(submitButton);
    }

    
    public class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if (ae.getActionCommand().equals("Submit")){
                Random rand = new Random();
                String id = Integer.toString(rand.nextInt(10000));
                Passenger passenger = Passenger.searchPassenger(passengerField.getText()); 
                Flight flight = Flight.searchFlight(flightField.getText());

                Baggage bag  = new Baggage(id,passenger,flight,"CheckedIn");
                Baggage.writeToFile(bag);
                JOptionPane.showMessageDialog(null,"Baggage checked In "+"\nYour baggae id is"+id);
            }
            else if (ae.getActionCommand().equals("Go Back")){
                dispose();
                PassengerPage pp = new PassengerPage();
            }
        }
    }
}
