class Point{
    private int x=0;
    private int y;

    Point(){
        x=0;
        y=0;
    }
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public Point Add(Point Pa,Point Pb){
        Point pc = new Point(Pa.x+Pb.x,Pa.y+Pb.y);
        return pc;
    }

    public void display() {
        System.out.println(x);
        System.out.println(y);
    } 
}

public class Activity3 {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(30, 40);
        Point p3 = new Point();
        p3 = p3.Add(p1, p2);
        p3.display();
    }
    
}
