package hvu.em.loe;

public class Motor {
    // Fields

    public int price;
    private double maxSpeed;

    // Constructors

    public Motor() {
        this.price = 0;
        this.maxSpeed = 0;
    }

    public Motor(int price, double maxSpeed) {
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    // Getter / setter

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    // Methods

    public void display() {
        System.out.println("Gia: " + getPrice() + " VND | Toc do toi da: " + getMaxSpeed() + " km/h");
    }

    public static void main(String[] args) {
        Motor m = new Motor(100000, 500.0);
        m.display();

        Motor m1 = new Motor();
        m1.setPrice(300000);
        m1.setMaxSpeed(5000);
        m1.display();
    }
}
