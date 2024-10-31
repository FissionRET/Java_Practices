package hvu.em.loe;

public class Motor {
    private int price;
    private double maxSpeed;

    // con
    public Motor() {
    }

    public Motor(int price, double maxSpeed) {
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    // getter, setter
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // other methods
    public void display() {
        System.out.println("Price: " + price);
        System.out.println("Max speed: " + maxSpeed);
    }

    // run (Main)
    public static void run(){
        Motor motor1 = new Motor();
        Motor motor2 = new Motor(100, 200);

        System.out.println("Motor 1:");
        motor1.display();
        System.out.println("Motor 2:");
        motor2.display();

        motor1.setPrice(200);
        motor1.setMaxSpeed(300);

        System.out.println("Motor 1 after update:");
        motor1.display();

        System.out.println("Getter by Motor 2");
        System.out.println(motor2.getPrice());
        System.out.println(motor2.getMaxSpeed());
    }
}