package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import src.*;
import src.Passenger;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StaffPage extends JFrame{
    JButton seeScheduleButton;
    JButton seePassengerButton;
    JButton addFlightsButton;
    JButton backButton;

    public StaffPage(){
        setTitle("Staff Page");
        setSize(1000,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,1));
        
        seeScheduleButton = new JButton("See Flight Schedule");
        seePassengerButton  = new JButton("View Passengers");
        addFlightsButton = new JButton("Add Flights");
        backButton = new JButton("Go Back");

        MyActionListener a = new MyActionListener();

        seeScheduleButton.addActionListener(a);
        seePassengerButton.addActionListener(a);
        addFlightsButton.addActionListener(a);
        backButton.addActionListener(a);

        add(seeScheduleButton);
        add(seePassengerButton);
        add(addFlightsButton);
        add(backButton);

        setVisible(true);
    }

    public class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if (ae.getActionCommand().equals("See Flight Schedule")){
                
                FlightSchedulePage schedule = new FlightSchedulePage();
            }
            else if (ae.getActionCommand().equals("View Passengers")){
                dispose();
                ViewPassengersPage vpass = new ViewPassengersPage();
            }
            else if (ae.getActionCommand().equals("Add Flights")){
                dispose();
                AddFlightsPage addFlights = new AddFlightsPage();
            }
            else if (ae.getActionCommand().equals("Go Back")){
                dispose();
                HOME h = new HOME();
            }
        }
    }
}
