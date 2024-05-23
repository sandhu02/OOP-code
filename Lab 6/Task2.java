abstract class Movie {
    protected String IDNumber;
    protected String movieTitle;
    protected int daysRented;

    Movie(String IDNumber,String movieTitle,int daysRented){
        this.daysRented = daysRented;
        this.IDNumber = IDNumber;
        this.movieTitle = movieTitle;           
    }
    public int getDaysRented() {
        return daysRented;
    }
    public String getIDNumber() {
        return IDNumber;
    }
    public String getMovieTitle() {
        return movieTitle;
    }
    public void setDaysRented(int daysRented) {
        this.daysRented = daysRented;
    }
    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public boolean equals(Movie movie){
        if (this.IDNumber==movie.IDNumber && this.movieTitle==movie.movieTitle && this.daysRented==movie.daysRented){
            return true;
        }
        else{
            return false;
        }
    }
    public String tosString(){
        return "IDNumber : "+IDNumber+"\nmovieTitle : "+movieTitle+"\ndaysRented : "+daysRented;
    }

    public abstract double calcLateFees(int daysLate);
    
}

class Action extends Movie{
    Action(String IDNumber,String movieTitle,int daysRented){
        super(IDNumber, movieTitle, daysRented);
    }
    @Override
    public double calcLateFees(int daysLate) {
        return 3*daysLate;
    }
}
class Comedy extends Movie{
    Comedy(String IDNumber,String movieTitle,int daysRented){
        super(IDNumber, movieTitle, daysRented);
    }
    @Override
    public double calcLateFees(int daysLate) {
        return 2.50*daysLate;
    }
}
class Drama extends Movie{
    Drama(String IDNumber,String movieTitle,int daysRented){
        super(IDNumber, movieTitle, daysRented);
    }
    @Override
    public double calcLateFees(int daysLate) {
        return 2*daysLate;
    }
}
public class Task2{
    public static void main(String[] args) {
        Action ac1 = new Action("123","john wick",12);
        System.out.println(ac1.toString());
    }
}
