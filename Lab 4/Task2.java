class Book{
    private String author;
    private String[] chapterNames;
    
    Book(){
        author="-";
        chapterNames=new String[100];
    }
    Book(String author,String[] chapterNames){
        this.author=author;
        this.chapterNames=chapterNames;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setChapterNames(String[] chapterNames) {
        this.chapterNames = chapterNames;
    }
    public String getAuthor() {
        return author;
    }
    public String[] getChapterNames() {
        return chapterNames;
    }

    public boolean compareBooks(Book book2){
        if (book2.author==author){
            return true;
        }
        else{
            return false;
        }
    }
    public Book compareChapterNames(Book book1,Book book2){
        if (book2.chapterNames.length>book1.chapterNames.length){
            return book2;
        }
        else{
            return book1; 
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setAuthor("tesla");
        String[] chapters = {"elec","magn"};
        book1.setChapterNames(chapters);

        String[] chapters2 = {"botany","zoology","microbiology"};
        Book book2  =new Book("hook",chapters2);

        Book book3 = new Book();
        Book bk = book3.compareChapterNames(book1, book2);
        System.out.println(bk.getAuthor());
    }
    
}
