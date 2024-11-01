package hvu;

public class Book extends Document {
    // Props

    private String publisher;

    // Constructors

    public Book() {
        super();
    }

    public Book(int id, double price, String publisher) {
        super(id, price);
        this.publisher = publisher;
    }

    // Getter - setter

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher() {
        this.publisher = publisher;
    }

    // Methods

    public static void main(String[] args) {
        Book b = new Book(1, 200, "Kim Dong");
        Book b1 = new Book(2, 300, "Thanh nien");

        b.write();
        b1.write();
    }
}
