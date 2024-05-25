package src;
public class Passenger extends Person{
    private String passportNumber;
    private Ticket ticket;
    public Passenger() {
        super();
        passportNumber="";
        ticket=null;
    }
    public Passenger(String name, String contactNumber, String email, String passportNumber, Ticket ticket) {
        super(name, contactNumber, email);
        this.passportNumber = passportNumber;
        this.ticket = ticket;
    }
    public String getPassportNumber() {
        return passportNumber;
    }
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    @Override
    public String toString() {
        return super.toString()+"passportNumber=" + passportNumber + ", ticket=" + ticket + "\n";
    }

}
