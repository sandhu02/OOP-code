import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ViewAllPatients extends JFrame{
    private static final Graphics Graphics = null;
    JButton b1;
    ViewAllPatients(){
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(2,0));

        b1 = new JButton("EXIT");
        MyPanel p = new MyPanel();

        MyActionListener a = new MyActionListener();
        b1.addActionListener(a);

        add(p);
        add(b1);
    }
    

    public class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if (ae.getActionCommand().equals("EXIT")){
                System.exit(0);
            }    
        }
    }
}

class MyPanel extends JPanel{
    protected void paintComponent(Graphics gr){
        super.paintComponent(gr); 

        Patient p;
        ArrayList<Patient> arr= Patient.readFromFile();
        for (int i=0;i<arr.size();i++){
            String str = "ID : "+arr.get(i).getId()+" \nName "+arr.get(i).getName()+" \n Age"+arr.get(i).getAge()+" \nIllness"+arr.get(i).getIllness()+" \n";
            gr.drawString(str,200,200);
        }
    }
}
