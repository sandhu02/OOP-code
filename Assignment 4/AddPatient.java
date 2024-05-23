import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddPatient extends JFrame{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1,b2;
    AddPatient(){
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(5,2));

        l1 = new JLabel("ID");
        l2 = new JLabel("Name");
        l3 = new JLabel("Age");
        l4 = new JLabel("Illness");

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        t4 = new JTextField(20);

        b1= new JButton("Submit");
        b2 = new JButton("Home");

        MyActionListener a = new MyActionListener();

        b1.addActionListener(a);
        b2.addActionListener(a);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);

        add(b1);add(b2);

    }

    public class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if (ae.getActionCommand().equals("Home")){
                dispose();
                HOME h = new HOME();
            }
            else if (ae.getActionCommand().equals("Submit")){
                Patient pat = new Patient(t4.getText(),t1.getText(),t2.getText(),t3.getText());
                Patient.writeToFile(pat);
                JOptionPane.showMessageDialog(null,"Submitted");
            }
        }
    }
}
