import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Doctor extends Person implements Serializable{
    private String specialization;
    
    Doctor(String specialization,String id,String name,String age){
        super(id, name, age);
        this.specialization=specialization;    
    }

    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String toString(){
        return "Specialization : "+specialization+"\n"+super.toString()+"\n";
    }

    public static void writeToFile(Doctor doctor){
        try {
            File f =new File("doctorData.ser");
            ObjectOutputStream oos;
            if (f.exists()){
                FileOutputStream fos = new FileOutputStream(f,true);
                oos = new MyObjectoutputStream(fos);
            }
            else {
                FileOutputStream fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(doctor);
            oos.close();
        }
        catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
    public static ArrayList<Doctor> readFromFile(){
        ArrayList<Doctor> arr = new ArrayList<Doctor>();
        ObjectInputStream ois;

        try {
            FileInputStream fis = new FileInputStream("doctorData.ser");
            ois = new ObjectInputStream(fis);
            while (true) {
                Doctor p = (Doctor)ois.readObject();
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

    public static void deleteDoctor(String name){
        ArrayList <Doctor> arr = readFromFile(); 
        for (int i=0;i<arr.size();i++){
            if (arr.get(i).getName().equals(name)){
                arr.remove(i);
                break;
            }
        }
        File f = new File("doctorData.ser");
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
