class Complex{
    private double real;
    private double imag;

    Complex(){
        real=0;
        imag=0;
    }
    Complex(double r,double im){
        real=r;
        imag=im;
    }
    public Complex Add(Complex b){
        Complex c = new Complex(real+b.real,imag+b.imag);

        return c;
    }

    public void Show(){
        System.out.println(real+"   "+imag);
    }
}

public class Activity2 {
    public static void main(String[] args) {
        Complex C1 = new Complex(11, 2.3);
        Complex C2 = new Complex(9, 2.3);
        Complex C3 = C1.Add(C2);
        C3.Show();    
    }
    
}
