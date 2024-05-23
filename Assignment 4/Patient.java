import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.io.ObjectInputStream;

public class Patient extends Person implements Serializable{
    private String illness;

    public static void writeToFile(Patient patient){
        try{
            File f = new File("patientData.ser");
            ObjectOutputStream oos;

            if (f.exists()){
                oos = new MyObjectoutputStream(new FileOutputStream(f,true));
            }
            else {
                oos = new ObjectOutputStream(new FileOutputStream(f));
            }
             
            oos.writeObject(patient);
            oos.close();
        }
        catch(IOException e){
            System.out.println("Error while writing");
        }
    }

    public static ArrayList<Patient> readFromFile(){
        ArrayList <Patient> arr = new ArrayList<Patient>();
        ObjectInputStream ois;

        try {
            FileInputStream fis = new FileInputStream("patientData.ser");
            ois = new ObjectInputStream(fis);
            while (true){
                Patient p = (Patient)ois.readObject(); 
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

    public static void deletePatient(String name){
        ArrayList <Patient> arr = readFromFile(); 
        for (int i=0;i<arr.size();i++){
            if (arr.get(i).getName().equals(name)){
                arr.remove(i);
                break;
            }
        }
        File f = new File("patientData.ser");
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
    
    Patient(String illness,String id,String name,String age){
        super(id, name, age);
        this.illness=illness;
    }
    
    public String getIllness() {
        return illness;
    }
    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String toString(){
        return "illness : "+illness+"\n"+super.toString();
    }
}
