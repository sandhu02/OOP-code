import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HOME extends JFrame{

    public class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if (ae.getActionCommand().equals("EXIT")){
                System.exit(0);
            }
            else if (ae.getActionCommand().equals("Patient")) {
                dispose();
                AddPatient p = new AddPatient();
            }
            else if (ae.getActionCommand().equals("Doctor")) {
                dispose();
                AddDoctor d = new AddDoctor();
            }
        }
    }

    JButton b1,b2,b3,b4;
    
    HOME(){
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(3,1));
        
        b1 = new JButton("Patient");
        b2 = new JButton("Doctor");
        b3 = new JButton("Appointment");
        b4 = new JButton("EXIT");
        
        MyActionListener a = new MyActionListener();
        
        b1.addActionListener(a);
        b2.addActionListener(a);
        b3.addActionListener(a);
        b4.addActionListener(a);
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }
}
