public class Economy_Class extends Customer{
    private int baggageLimit;
    Economy_Class(){
        super();
        baggageLimit=0;
    }
    Economy_Class(String name,String email,int age,int baggageLimit){
        super(name, email, age);
        this.baggageLimit=baggageLimit;
    }
    public int getBaggageLimit() {
        return baggageLimit;
    }
    public void setBaggageLimit(int baggageLimit) {
        this.baggageLimit = baggageLimit;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Baggae Limit : "+baggageLimit);
    }
}