package sample;

public class Book extends Material {

    String author_first_name;
    String author_last_name;

    public Book(int mid) {
        super(mid);
        checkOutTime = 14;
    }
}
