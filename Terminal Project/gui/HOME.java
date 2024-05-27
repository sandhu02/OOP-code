package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HOME extends JFrame{
    JButton passengerButton;
    JButton staffButton;
    JButton exitButton;

    public HOME(){
        setTitle("Airport Management System Home Page");
        setSize(1000,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(3,0));
        
        passengerButton = new JButton("Passenger");
        // passengerButton.setBackground(new Color(0,255,0));
        staffButton = new JButton("Staff");
        // staffButton.setBackground(new Color(255,255,0));
        exitButton = new JButton("Exit");
        // exitButton.setBackground(new Color(255,0,0));

        MyActionListener listener = new MyActionListener();

        passengerButton.addActionListener(listener);
        staffButton.addActionListener(listener);
        exitButton.addActionListener(listener);

        add(passengerButton);
        add(staffButton);
        add(exitButton);
    }

    public class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if (ae.getActionCommand().equals("Passenger")){
                dispose();
                PassengerPage pp1 = new PassengerPage();
            }
            else if (ae.getActionCommand().equals("Staff")){
                dispose();
                StaffPage sp = new StaffPage();
            }
            else if (ae.getActionCommand().equals("Exit")){
                System.exit(0);
            }
        }
    }
}
