package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StaffPage extends JFrame{
    JButton seeScheduleButton;
    JButton seePassengerButton;
    JButton backButton;

    StaffPage(){
        setSize(1000,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout());

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
    }

    public class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if (ae.getActionCommand().equals("See Flight Schedule")){
                
            }
            else if (ae.getActionCommand().equals("View Passengers")){

            }
            else if (ae.getActionCommand().equals("Go Back")){
                dispose();
                HOME h = new HOME();
            }
        }
    }
}
