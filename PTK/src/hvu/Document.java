package hvu;

public class Document {
    // Props

    private int id;
    private double price;

    // Constructors

    public Document() {
        id = 0;
        price = 0;
    }

    public Document(int id, double price) {
        this.id = id;
        this.price = price;
    }

    // Getter - setter

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Methods

    public void write() {
        System.out.println("Document's id is: " + getId());
    }
}
