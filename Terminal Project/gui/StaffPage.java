package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import src.Passenger;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StaffPage extends JFrame{
    JButton seeScheduleButton;
    JButton seePassengerButton;
    JButton backButton;

    public StaffPage(){
        setTitle("Staff Page");
        setSize(1000,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,1));
        
        seeScheduleButton = new JButton("See Flight Schedule");
        seePassengerButton  = new JButton("View Passengers");
        backButton = new JButton("Go Back");

        MyActionListener a = new MyActionListener();

        seeScheduleButton.addActionListener(a);
        seePassengerButton.addActionListener(a);
        backButton.addActionListener(a);

        add(seeScheduleButton);
        add(seePassengerButton);
        add(backButton);

        setVisible(true);
    }

    public class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if (ae.getActionCommand().equals("See Flight Schedule")){
                
            }
            else if (ae.getActionCommand().equals("View Passengers")){
                ArrayList <Passenger> arr = Passenger.readFromFile();
                JOptionPane.showMessageDialog(null, "hello");
            }
            else if (ae.getActionCommand().equals("Go Back")){
                dispose();
                HOME h = new HOME();
            }
        }
    }
}
