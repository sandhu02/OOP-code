import java.io.Serializable;

public class Person implements Serializable{
    private String id; 
    private String name;
    private String age;

    Person(String id,String name,String age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public String getAge() {
        return age;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "ID : "+id+"\nname : "+name+"\nage : "+age+"\n";
    }
}

