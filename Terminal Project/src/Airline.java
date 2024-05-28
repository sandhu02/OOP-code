package src;

import java.io.Serializable;

public class Airline implements Serializable{
    private String name;
    private String code;
    
    public Airline(){
        name="";
        code="";
    }
    public Airline(String name,String code){
        this.name=name;
        this.code=code;
    }

    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "Name : "+name+"\nCode : "+code+"\n";
    }
}
