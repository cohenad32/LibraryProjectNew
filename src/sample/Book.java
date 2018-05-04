package sample;

public class Book extends Material{

    String author_first_name;
    String author_last_name;

    public Book(String title){
        super(title);
        checkOutTime = 14;
    }



}
