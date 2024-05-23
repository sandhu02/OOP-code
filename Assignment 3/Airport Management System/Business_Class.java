public class Business_Class extends Customer{
    private String[] specialAmenities;
    Business_Class(){
        super();
        specialAmenities=new String[0];
    }
    Business_Class(String name,String email,int age,String[] specialAmenities){
        super(name, email, age);
        this.specialAmenities = specialAmenities;
    }
    public String[] getSpecialAmenities() {
        return specialAmenities;
    }
    public void setSpecialAmenities(String[] specialAmenities) {
        this.specialAmenities = specialAmenities;
    }
    

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Special Amenities : ");
        if (specialAmenities.length==0){
            System.out.println("No amenities");
        }
        else {
            for (String i : specialAmenities){
                System.out.println(i);
            }
        }
    }
}
