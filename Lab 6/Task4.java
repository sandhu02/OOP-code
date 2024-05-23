abstract class Convert {
    protected double val1;
    protected double val2;
    Convert(double val1,double val2){
        this.val1=val1;
        this.val2=val2;
    }
    public double getVal1() {
        return val1;
    }
    public double getVal2() {
        return val2;
    }
    public void setVal1(double val1) {
        this.val1 = val1;
    }
    public void setVal2(double val2) {
        this.val2 = val2;
    }
    public String toString(){
        return "val1 : "+val1+"\nval2 : "+val2;
    }
    public abstract double compute();
}

class l_to_g extends Convert{
    l_to_g(double val1,double val2){
        super(val1, val2);
    }
    @Override
    public double compute() {
        val2=val1*0.264;
        return val2;
    }
}
class f_to_c extends Convert{
    f_to_c(double val1,double val2){
        super(val1, val2);
    }
    @Override
    public double compute() {
        val2 = (val1-32)/1.8;
        return val2;
    }
}
class f_to_m extends Convert{
    f_to_m(double val1,double val2){
        super(val1, val2);
    }
    @Override
    public double compute() {
        val2 = val1*0.304;
        return val2;
    }
}
public class Task4{
    public static void main(String[] args) {
        
    }
}
