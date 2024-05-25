package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PassengerPage extends JFrame{
    JButton bookticketButton;
    JButton seeScheduleButton;
    JButton goHomeButton;

    public PassengerPage(){
        setTitle("Passenger Page");
        setSize(1000,600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,3));

        bookticketButton = new JButton("Book Ticket");
        seeScheduleButton = new JButton("See Flight Schedule");
        goHomeButton = new JButton("Go back to Home");

        MyActionListener listener = new MyActionListener();

        bookticketButton.addActionListener(listener);
        seeScheduleButton.addActionListener(listener);
        goHomeButton.addActionListener(listener);

        add(bookticketButton);
        add(seeScheduleButton);
        add(goHomeButton);
    }

    public class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if (ae.getActionCommand().equals("'Book Ticket'")){

            }
            else if (ae.getActionCommand().equals("See Flight Schedule")){

            }
            else if (ae.getActionCommand().equals("Go back to Home")){
                dispose();
                HOME h1 = new HOME();
            }
        }
    }
}
