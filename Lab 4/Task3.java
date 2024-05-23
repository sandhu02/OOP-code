class Fraction{
    private int int1;
    private int int2;

    Fraction(){
        int1=1;
        int2=1;
    }
    Fraction(int int1,int int2){
        this.int1=int1;
        this.int2=int2;
    }

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    public void setInt2(int int2) {
        this.int2 = int2;
    }
    public int getInt1() {
        return int1;
    }
    public int getInt2() {
        return int2;
    }

    public boolean equals(Fraction frac){
        if ( (frac.int1/frac.int2) == (int1/int2) ){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        Fraction frac1 = new Fraction(6,2);

        Fraction frac2 = new Fraction(8,3);

        System.out.println(frac2.equals(frac1));
    }
    
}
