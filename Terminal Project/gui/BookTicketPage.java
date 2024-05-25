package gui;

import src.*;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;


public class BookTicketPage extends JFrame{
    JList list;
    JButton selectDestinationButton;

    public BookTicketPage(){
        setTitle("Book Ticket");
        setSize(1000,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        // setLayout();

        selectDestinationButton = new JButton("Select destination");
        selectDestinationButton.setBounds(400, 400, 200, 70);

        DefaultListModel<String> list  = new DefaultListModel<>();
        list.addElement("patis");
        list.addElement("london");
        list.addElement("miami");
        
        JList<String> jlist = new JList<>(list);
        jlist.setBounds(400,600,100,400);

        add(selectDestinationButton);
        add(jlist);
       
    }

}
