package pl.edu.uwm.obiektowe.s162436.kolo2;

public class Book extends Product{
    String isbn;
    String author;

    public Book(String name, long id, double price, String isbn, String author) {
        super(name, id, price);
        this.isbn = isbn;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
