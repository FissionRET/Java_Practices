package hvu.hrm.fte;

public class Staff {
    private Boolean isLeturer;
    private int id;

    // conn
    public Staff() {
    }
    public Staff(Boolean isLeturer, int id) {
        this.isLeturer = isLeturer;
        this.id = id;
    }

    // getter, setter
    public Boolean getIsLeturer() {
        return isLeturer;
    }

    public void setIsLeturer(Boolean isLeturer) {
        this.isLeturer = isLeturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // other methods
    public void display() {
        System.out.println("Staff: " + isLeturer + " " + id);
    }

    // run (Main)
    public static void run(){
        Staff staff1 = new Staff();
        Staff staff2 = new Staff(true, 1);

        System.out.println("Staff 1:");
        staff1.display();
        System.out.println("Staff 2:");
        staff2.display();

        staff1.setIsLeturer(false);
        staff1.setId(2);

        System.out.println("Staff 1 after update:");
        staff1.display();
    }
}
