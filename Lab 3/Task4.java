class HotDogs{
    private int id;
    private int unitsSold;

    HotDogs(){
        id=0;
        unitsSold=0;
    }
    HotDogs(int id,int unitsSold){
        this.id=id;
        this.unitsSold=unitsSold;
    }
    public void justSold(){
        unitsSold++;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setUnitsSold(int unitsSold) {
        this.unitsSold = unitsSold;
    }
    public int getId() {
        return id;
    }
    public int getUnitsSold() {
        return unitsSold;
    }
}

public class Task4 {
    public static void main(String[] args) {
        
    }
    
}
