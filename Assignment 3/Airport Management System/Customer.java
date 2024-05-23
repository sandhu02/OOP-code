public class Customer{
    protected String name;
    protected String email;
    protected int age;
    Customer(){
        name="";
        email="";
        age=0;
    }
    Customer(String name,String email,int age){
        this.name=name;
        this.email=email;
        this.age=age;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Email : "+email);
    }
}