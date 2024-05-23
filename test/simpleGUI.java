import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane; 


public class simpleGUI extends JFrame{
    class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if (ae.getActionCommand().equals("Submit")){
                JOptionPane.showMessageDialog(null, "you entered"+t1.getText());
            }
            else if (ae.getActionCommand().equals("Exit")){
                System.exit(0);
            }
        }   
    }

    JButton b1;
    JButton b2;
    JLabel l1;
    JTextField t1;

    simpleGUI(int length,int width){
        setSize(length,width);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        setLayout(new GridLayout(2,2));
        b1 = new JButton("Submit");
        b2 = new JButton("Exit");

        MyActionListener a = new MyActionListener();
        b1.addActionListener(a);   
        b2.addActionListener(a); 
        add(l1);
        add(t1);
        add(b1);    
        add(b2);
    }
   
}
