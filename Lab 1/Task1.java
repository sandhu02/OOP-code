class Student {
    String name;
    int age;
    int regNumber;
    String address;
    String gender;
    String email;
    String contactNum;
    String course;

    void setAge(int value){
        age = value;
    }
    //getter
    int getAge(){
        return age;
    }

    void setName(String name){
        this.name = name;
    }

    void setGender(String gender){
        this.gender = gender;
    }
    void setRegisteration(int reg){
        regNumber = reg;
    }
}

public class Task1{
    public static void main(String[] args){
        Student student = new Student();

        student.setAge(23);
        student.setName("Awais");
        student.setGender("male");
        student.setRegisteration(48);



        System.out.println("student name is : "+student.name);
        System.out.println("student age is : "+student.age);
        System.out.println("student registeratin number is : "+student.regNumber);
        System.out.println("student course is : "+student.course);
        
    }
}