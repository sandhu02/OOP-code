package src;

import java.io.Serializable;

public class Person implements Serializable{
    private String name;
    private String contactNumber;
    private String email;
    
    public Person() {
        name="";
        contactNumber="";
        email="";
    }
    public Person(String name, String contactNumber, String email) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "name=" + name + ", contactNumber=" + contactNumber + ", email=" + email+", ";
    } 
    
    
}
