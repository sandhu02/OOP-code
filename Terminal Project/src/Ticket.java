package src;
public class Ticket {
    private String ticketNumber;
    private String seatNumber;
    private double price;
    public Ticket() {
        ticketNumber="";
        seatNumber="";
        price=0;
    }
    public Ticket(String ticketNumber, String seatNumber, double price) {
        this.ticketNumber = ticketNumber;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    public String getTicketNumber() {
        return ticketNumber;
    }
    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(String seatNumber) {
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
}
