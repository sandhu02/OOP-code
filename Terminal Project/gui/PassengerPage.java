package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PassengerPage extends JFrame{
    JButton bookticketButton;
    JButton canceltickeButton;
    JButton seeScheduleButton;
    JButton searchbaggageButton;
    JButton viewTicketButton;
    JButton goHomeButton;

    public PassengerPage(){
        setTitle("Passenger Page");
        setSize(1000,600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,2));

        bookticketButton = new JButton("Book Ticket");
        canceltickeButton = new JButton("Cancel Ticket");
        seeScheduleButton = new JButton("See Flight Schedule");
        viewTicketButton = new JButton("View Ticket Details");
        searchbaggageButton = new JButton("CheckIn Baggage");
        goHomeButton = new JButton("Go back to Home");

        MyActionListener listener = new MyActionListener();

        bookticketButton.addActionListener(listener);
        canceltickeButton.addActionListener(listener);
        seeScheduleButton.addActionListener(listener);
        viewTicketButton.addActionListener(listener);
        searchbaggageButton.addActionListener(listener);
        goHomeButton.addActionListener(listener);

        add(bookticketButton);
        add(canceltickeButton);
        add(seeScheduleButton);
        add(viewTicketButton);
        add(searchbaggageButton);
        add(goHomeButton);
    }

    public class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if (ae.getActionCommand().equals("Book Ticket")){
                dispose();
                BookTicketPage bookticket = new BookTicketPage();
            }
            if (ae.getActionCommand().equals("Cancel Ticket")){
                dispose();
                CancelTicket cancel = new CancelTicket();
            }
            else if (ae.getActionCommand().equals("See Flight Schedule")){
                
                FlightSchedulePage flightPage = new FlightSchedulePage();
            }
            else if (ae.getActionCommand().equals("View Ticket Details")){

            }
            else if (ae.getActionCommand().equals("CheckIn Baggage")){
                dispose();
                EnterbaggagePage bPage = new EnterbaggagePage();
            }
            else if (ae.getActionCommand().equals("Go back to Home")){
                dispose();
                HOME h1 = new HOME();
            }
        }
    }
}
