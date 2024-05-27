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

public class Staff extends Person implements Serializable{
    private String staffId;
    private String role;
    public Staff() {
        super();
        staffId = "";
        role = "";
    }
    public Staff(String name, String contactNumber, String email, String staffId, String role) {
        super(name, contactNumber, email);
        this.staffId = staffId;
        this.role = role;
    }
    public String getStaffId() {
        return staffId;
    }
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return super.toString()+"staffId=" + staffId + ", role=" + role + "\n";
    }
    
    
    public static void writeToFile(Staff staff){
        try{
            File f = new File("C:\\D-drive-53140\\Semester 3\\OOP\\Terminal Project\\data\\staffData.ser");
            ObjectOutputStream oos;

            if (f.exists()){
                oos = new MyObjectoutputStream(new FileOutputStream(f,true));
            }
            else {
                oos = new ObjectOutputStream(new FileOutputStream(f));
            }
             
            oos.writeObject(staff);
            oos.close();
        }
        catch(IOException e){
            System.out.println("Error while writing");
        }
    }
    public static ArrayList<Staff> readFromFile(){
        ArrayList <Staff> arr = new ArrayList<Staff>();
        ObjectInputStream ois;

        try {
            FileInputStream fis = new FileInputStream("C:\\D-drive-53140\\Semester 3\\OOP\\Terminal Project\\data\\staffData.ser");
            ois = new ObjectInputStream(fis);
            while (true){
                Staff p = (Staff)ois.readObject(); 
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
    public static void deletePassenger(String staffid){
        ArrayList <Staff> arr = readFromFile(); 
        for (int i=0;i<arr.size();i++){
            if (arr.get(i).getStaffId().equals(staffid)){
                arr.remove(i);
                break;
            }
        }
        File f = new File("C:\\D-drive-53140\\Semester 3\\OOP\\Terminal Project\\data\\staffData.ser");
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
