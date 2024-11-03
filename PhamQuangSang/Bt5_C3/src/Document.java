public class Document {

    // properties
    private int id;
    private double price;

    // ctor
    public Document() {
    }

    public Document(int id, double price) {
        this.id = id;
        this.price = price;
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // other methods
    public void write() {
        System.out.println("Document id is: " + id);
    }
}
