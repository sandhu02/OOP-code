class Aeroplane{
    String manufacturer;
    String model;
    String regNumber;
    String airline;
    String type;
    String capacity;

    void setInfo(String manufacturer,String model,String regNumber,String airline,String type,String capacity){
        this.manufacturer = manufacturer;
        this.model = model;
        this.type = type;
        this.regNumber = regNumber;
        this.airline = airline;
        this.capacity = capacity;
    }

    void displayInfo(){
        System.out.println(manufacturer+" : \n"+model+" : \n"+regNumber+" : \n"+airline+" : \n"+type+" : \n"+capacity+" : \n" );
    }
}

public class Task3 {
    public static void main(String[] args) {
        Aeroplane plane = new Aeroplane();
        plane.setInfo("Airbus", "A350-200", "PB700X", "PIA", "Passenger", "200000kg");
        plane.displayInfo();
        
    }
    
}
