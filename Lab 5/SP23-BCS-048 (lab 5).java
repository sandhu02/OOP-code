class Point{
    private int x;
    private int y;
    Point(){
        x=0;
        y=0;
    }
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void move(int movex,int movey){
        x+=movex;
        y+=movey;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class Task{
    public static void main(String[] args) {
        Point[] pointArray = new Point[10];
        for (int i=0;i<10;i++){
            if (i<5){
                pointArray[i]=new Point();
            }
            else{
                pointArray[i]=new Point(1,3);
            }
        }
        for (int i=0;i<5;i++){
            if (i<5){
                pointArray[i].setY(19);
            }
            else{
                pointArray[i].move(3, 4);
            }
        }  
    }
}