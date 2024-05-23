public class Flight{
    private Customer[] c_array;
    private String arrival;
    private String departure;
    Flight(){
        c_array=new Customer[0];
        arrival="";
        departure="";
    }
    Flight(Customer[] c_array, String arrival,String departure){
        this.c_array = c_array;
        this.arrival=arrival;
        this.departure=departure;
    }
    public String getArrival() {
        return arrival;
    }
    public String getDeparture() {
        return departure;
    }
    public Customer[] getC_array() {
        return c_array;
    }
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
    public void setDeparture(String departure) {
        this.departure = departure;
    }
    public void setC_array(Customer[] c_array) {
        this.c_array = c_array;
    }

    public int TotalCustomers(){
        if (c_array.length==0){
            return 0;
        }
        else {
            return c_array.length;
        }
    }
    public int EconomyCustomers(){
        if (c_array.length==0){
            return 0;
        }
        else {
            int count=0;
            for (Customer i : c_array){
                if (i instanceof Economy_Class){
                    count++;
                }
            }
            return count;
        }
    }
    public int Business_Class(){
        if (c_array.length==0){
            return 0;
        }
        else {
            int count=0;
            for (Customer i : c_array){
                if (i instanceof Business_Class){
                    count++;
                }
            }
            return count;
        }
    }
    public void displayInfo(){
        System.out.println("Arrival : "+arrival);
        System.out.println("Departure : "+departure);
        System.out.println("Customers :");
        if (c_array.length==0){
            System.out.println("No customer on flight ");
        }
        else {
            for (Customer i : c_array){
                i.displayInfo();
            }
            System.out.println();
        }
    }
}
