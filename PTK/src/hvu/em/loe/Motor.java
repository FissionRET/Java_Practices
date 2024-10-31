package hvu.em.loe;

public class Motor extends Vehicle {
    // Fields

    private double maxSpeed;

    // Constructors

    public Motor() {
        super();
    }

    public Motor(int id, boolean isImported, double maxSpeed) {
        super(id, isImported);
        this.maxSpeed = maxSpeed;
    }

    // Getter / setter

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    // Methods

    public static void main(String[] args) {
        Motor m = new Motor(1, true, 200);
        Motor m1 = new Motor();

        m1.setId(2);
        m1.setImported(false);
        m1.setMaxSpeed(100);

        m.write();
        m1.write();
    }
}
