package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import src.Passenger;


public class CancelTicket extends JFrame {
    JLabel entername;
    JLabel enterpassport;

    JTextField namefield;
    JTextField passportfield;

    JButton okbButton;
    JButton discardButton;    
    
    public CancelTicket(){
        setTitle("Book Ticket");
        setSize(1000,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(3,2));

        entername = new JLabel("Enter your Name");
        enterpassport = new JLabel("Enter passport Number");

        namefield = new JTextField(20);
        passportfield = new JTextField(20);

        okbButton = new JButton("OK");
        discardButton = new JButton("Discard and go back");

        MyActionListener listener = new MyActionListener();

        okbButton.addActionListener(listener);
        discardButton.addActionListener(listener);

        add(entername);
        add(namefield);
        add(enterpassport);
        add(passportfield);

        add(discardButton);
        add(okbButton);
    }

    public class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if (ae.getActionCommand().equals("OK")){
                Passenger.deletePassenger(passportfield.getText());
                JOptionPane.showMessageDialog(null, "Your ticket has been cancelled");

                dispose();
                CancelTicket ct = new CancelTicket();
            }
            else if (ae.getActionCommand().equals("Discard and go back")){
                dispose();
                PassengerPage p = new PassengerPage();
            }
        }
    }
}   
