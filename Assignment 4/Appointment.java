import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Appointment implements Serializable{
    private String date;
    private Patient patient;
    private Doctor doctor; 
    
    Appointment(String date,Patient patient,Doctor doctor){
        this.date=date;
        this.patient=patient;
        this.doctor=doctor;
    }

    public String getDate() {
        return date;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public Patient getPatient() {
        return patient;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public String toString(){
        return "Date : "+date+"\n"+patient.toString()+"\n"+doctor.toString();
    }
    public boolean equals(Object o){
        boolean result=false;
        if (this == o){
            result = true;
        }
        else if (o == null || o.getClass() != getClass()){
            result = false;
        }
        // else {
        //     Appointment app = (Appointment) o;

        // }
        return result;
    }


    public static void writeToFile(Appointment appointment){
        try{
            File f = new File("appointmentData.ser");
            ObjectOutputStream oos;

            if (f.exists()){
                oos = new MyObjectoutputStream(new FileOutputStream(f,true));
            }
            else {
                oos = new ObjectOutputStream(new FileOutputStream(f));
            }
             
            oos.writeObject(appointment);
            oos.close();
        }
        catch(IOException e){
            System.out.println("Error while writing");
        }
    }

    public static ArrayList<Appointment> readFromFile(){
        ArrayList <Appointment> arr = new ArrayList<Appointment>();
        ObjectInputStream ois;

        try {
            FileInputStream fis = new FileInputStream("appointmentData.ser");
            ois = new ObjectInputStream(fis);
            while (true){
                Appointment p = (Appointment)ois.readObject(); 
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
        }
        return arr;
    }

    public static void deleteAppointment(String date){
        ArrayList <Appointment> arr = readFromFile(); 
        for (int i=0;i<arr.size();i++){
            if (arr.get(i).getDate().equals(date)){
                arr.remove(i);
                break;
            }
        }
        File f = new File("appointmentData.ser");
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
    
    public static void updateDate(Appointment appointment,String newDate){
        ArrayList <Appointment> arr = readFromFile();
        for (int i=0;i<arr.size();i++){
            if (arr.get(i).equals(appointment)){
                arr.get(i).setDate(newDate);
                break;
            }
        }

        File f = new File("appointmentData.ser");
        try { 
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            for (int i=0;i<arr.size();i++) {
                oos.writeObject(arr.get(i));
            }
        }
        catch (Exception ioe){
            System.out.println(ioe);
        }
    }

}
