public class Book extends Document {
    // props
    private String publisher;

    // ctor
    public Book(){
        super();
    }
    
    public Book(int id, double price, String publisher){
        super(id, price);
        this.publisher = publisher;
    }

    // getters and setters
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    // main (theo y/c)
    public static void main(String[] args) {
        Book book = new Book(1, 100, "Imperium of Man");
        book.write();

        Document document = new Document(2, 200);
        document.write();
    }
}


