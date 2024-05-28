package src;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Ticket implements Serializable{
    private int ticketNumber;
    private int seatNumber;
    private double price;
    public Ticket() {
        ticketNumber=0;
        seatNumber=0;
        price=0;
    }
    public Ticket(int ticketNumber, int seatNumber, double price) {
        this.ticketNumber = ticketNumber;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    public int getTicketNumber() {
        return ticketNumber;
    }
    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    public int getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "ticketNumber=" + ticketNumber + ", seatNumber=" + seatNumber + ", price=" + price + "\n";
    }


    public static void writeToFile(Ticket ticket){
        try{
            File f = new File("ticketData.ser");
            ObjectOutputStream oos;

            if (f.exists()){
                oos = new MyObjectoutputStream(new FileOutputStream(f,true));
            }
            else {
                oos = new ObjectOutputStream(new FileOutputStream(f));
            }
             
            oos.writeObject(ticket);
            oos.close();
        }
        catch(IOException e){
            System.out.println("Error while writing");
        }
    }
    public static ArrayList<Ticket> readFromFile(){
        ArrayList <Ticket> arr = new ArrayList<Ticket>();
        ObjectInputStream ois;

        try {
            FileInputStream fis = new FileInputStream("ticketData.ser");
            ois = new ObjectInputStream(fis);
            while (true){
                Ticket p = (Ticket)ois.readObject(); 
                arr.add(p);
            }
        }
        catch (ClassNotFoundException e1){
            System.out.println("Class not found ");
        }
        catch (EOFException e2){
            return arr;
        }
        catch (IOException e3){
            System.out.println("File not found in reader ");
            System.out.println(e3.getMessage());
        }
        return arr;
    }
    public static void deletePassenger(int ticketNumber){
        ArrayList <Ticket> arr = readFromFile(); 
        for (int i=0;i<arr.size();i++){
            if (arr.get(i).getTicketNumber()==ticketNumber){
                arr.remove(i);
                break;
            }
        }
        File f = new File("ticketData.ser");
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            for (int i=0;i<arr.size();i++){
                oos.writeObject(arr.get(i));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
