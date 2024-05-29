package gui;

import src.*;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import gui.HOME.MyActionListener;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class BookTicketPage extends JFrame{
    JLabel enterName;
    JLabel contactNumber;
    JLabel email;
    JLabel passportNumber;
    JLabel seatNumber;

    JTextField namefield;
    JTextField contactfield;
    JTextField emailfield;
    JTextField passportfield;
    JTextField seatfield;

    JButton submitButton;
    JButton discardButton;

    public BookTicketPage(){
        setTitle("Book Ticket");
        setSize(1000,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(6,2));

        enterName = new JLabel("Your Name");
        contactNumber = new JLabel("Contact Number");
        email = new JLabel("Email Address");
        passportNumber = new JLabel("Passport Number");
        seatNumber = new JLabel("Select Seat Number");
        
        namefield = new JTextField(20);
        contactfield = new JTextField(20);
        emailfield = new JTextField(20);
        passportfield = new JTextField(20);
        seatfield = new JTextField(20);

        submitButton = new JButton("Submit");
        discardButton = new JButton("Discard and Exit");

        MyActionListener listener = new MyActionListener();

        submitButton.addActionListener(listener);
        discardButton.addActionListener(listener);

        add(enterName);
        add(namefield);
        add(contactNumber);
        add(contactfield);
        add(email);
        add(emailfield);
        add(passportNumber);
        add(passportfield);
        add(seatNumber);
        add(seatfield);
        
        add(discardButton);
        add(submitButton);
    }

    public class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if (ae.getActionCommand().equals("Submit")){
                Random random = new Random();
                int randomticketnumber = random.nextInt(10000);
                int intseatNumber = Integer.parseInt(seatfield.getText());
                String passportnum = passportfield.getText();

                Passenger passenger = new Passenger(namefield.getText(), contactfield.getText(), emailfield.getText(), passportfield.getText(), new Ticket(randomticketnumber,intseatNumber, 1200)); 
                Passenger.writeToFile(passenger);
                JOptionPane.showMessageDialog(null,"Your ticket has been booked"+"\nYour Passport Number is : "+passportnum);
                
                dispose();
                BookTicketPage p2 = new BookTicketPage();
            }
            else if (ae.getActionCommand().equals("Discard and Exit")){
                dispose();
                PassengerPage p = new PassengerPage(); 
            }
        }
    }
}
