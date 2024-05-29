package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import src.Flight;
import src.Passenger;

public class ViewPassengersPage extends JFrame{
    JTable table;
    DefaultTableModel tableModel;
    JButton backButton;

    public ViewPassengersPage(){
        setTitle("Flight Schedule Page");
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        backButton = new JButton("Go Back");

        String[] columnNames = {"Name", "Contact Number", "Email","Passport Number","Ticket Number","Seat Number"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);

        ArrayList <Passenger> passengersList  = Passenger.readFromFile(); 
        for (int i=0;i<passengersList.size();i++) {
            Object[] row = {passengersList.get(i).getName(), passengersList.get(i).getContactNumber(), passengersList.get(i).getEmail(),passengersList.get(i).getPassportNumber(),passengersList.get(i).getTicket().getTicketNumber(),passengersList.get(i).getTicket().getSeatNumber()};
            tableModel.addRow(row);
        }

        MyActionListener listener = new MyActionListener();
        backButton.addActionListener(listener);

        add(new JScrollPane(table), BorderLayout.CENTER);
        add(backButton,BorderLayout.SOUTH);
    }

    public class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if (ae.getActionCommand().equals("Go Back")){
                dispose();
                StaffPage staff = new StaffPage();
            }
        }
    }
}
