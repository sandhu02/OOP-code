package src;
public class Gate {
    private String gateNumber;

    public Gate(){
        gateNumber="";
    }
    public Gate(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public String getGateNumber() {
        return gateNumber;
    }
    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }
    
    public String toString(){
        return "Gate Number : "+gateNumber+"\n";
    }
    public void display(){
        System.out.println("Gate Number : "+gateNumber);
    }

    
}
