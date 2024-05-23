class Student{
    private String name;
    private int[] Result_array=new int[5];

    Student(String name,int[] Result_array){
        this.name=name;
        this.Result_array=Result_array;
    }
    Student(){
        name="-";
        for (int i=0;i<Result_array.length;i++){
            Result_array[i]=0;
        }
    }
    public double Average(){
        double sum=0;
        for (int i=0;i<Result_array.length;i++){
            sum+=Result_array[i];
        }
        return sum/Result_array.length;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setResult_array(int[] result_array) {
        Result_array = result_array;
    }
    public String getName() {
        return name;
    }
    public int[] getResult_array() {
        return Result_array;
    }
}

public class Task3 {
    public static void main(String[] args) {
        
    }
    
}
