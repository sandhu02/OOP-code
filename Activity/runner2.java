class Rectangle {
    public int length, width;
    public Rectangle() {
    length = 5;
    width = 2;
    }
    public Rectangle(int l, int w) {
   
    length = l;
    width = w;
    }
    public int Calculatearea() {
    return (length * width);
    }
   }
   public class runner2 {
    public static void main(String args[]) {
    Rectangle rect = new Rectangle();
    System.out.println(rect.Calculatearea());
    Rectangle rect1 = new Rectangle(10, 20);
    System.out.println(rect1.Calculatearea());
    }
   } 
   