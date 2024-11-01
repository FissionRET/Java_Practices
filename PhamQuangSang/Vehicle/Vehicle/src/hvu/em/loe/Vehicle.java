package hvu.em.loe;

public class Vehicle {
    private int id;
    private Boolean isImported = false;

    // conn
    public Vehicle() {

    }

    public Vehicle(int id, Boolean isImported) {
        this.id = id;
        this.isImported = isImported;
        
    }

    // getter
    public int getId() {
        return id;
    }

    public Boolean getImported() {
        return isImported;
    }

    // setter
    public void setId(int id) {
        this.id = id;
    }

    public void setImported(Boolean imported) {
        isImported = imported;
    }

    // other methods
    public void write() {
        if (isImported == true)
            System.out.println("Vehicle is imported item!");
        else
            System.out.println("Vehicle is not imported item!");
    }

    
}
