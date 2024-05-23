public class AirportManagementSystem {
    public static void main(String[] args) {
        Economy_Class c = new Economy_Class("Awais", "awa.gmail.com", 20, 32);
        Customer[] arr = {c};
        Flight f = new Flight(arr,"2.30","3.00");
        f.displayInfo();
        System.out.println(f.EconomyCustomers());
    }
    
}
