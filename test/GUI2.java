import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import java.awt.GridLayout;

public class GUI2 extends JFrame{
    public class SecondActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if (ae.getActionCommand().equals("exit")){
                System.exit(0);
            }
            else if (ae.getActionCommand().equals("Submit")){
                JOptionPane.showMessageDialog(null,"you clicked the button");
            }
        }    
    }
    
    JButton b1;
    JButton b2;
    GUI2(){
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        setLayout(new GridLayout());
        b1 = new JButton("Submit");
        b2= new JButton("exit");

        SecondActionListener al = new SecondActionListener();

        b1.addActionListener(al);
        b2.addActionListener(al);

        add(b1);
        add(b2);
    }

}
