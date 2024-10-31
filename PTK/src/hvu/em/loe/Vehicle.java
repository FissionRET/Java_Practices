package hvu.em.loe;

public class Vehicle {
    // Fields

    private int id;
    private boolean isImported;

    // Constructors

    public Vehicle() {
        this.id = 0;
        this.isImported = false;
    }

    public Vehicle(int id, boolean isImported) {
        this.id = id;
        this.isImported = isImported;
    }

    // Getter / setter

    public int getId() {
        return id;
    }

    public boolean getIsImported() {
        return isImported;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImported(boolean isImported) {
        this.isImported = isImported;
    }

    // Methods

    public void write() {
        if (getIsImported()) {
            System.out.println("Vehicle with id " + getId() + " is imported item!");
        } else {
            System.out.println("Vehicle with id " + getId() + " isn't imported item!");
        }
    }
}
