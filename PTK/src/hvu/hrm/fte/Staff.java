package hvu.hrm.fte;

public class Staff {
    // Fields

    private boolean isLeturer;
    private int id;

    // Constructors

    public Staff() {
        this.isLeturer = false;
        this.id = 0;
    }

    public Staff(boolean isLeturer, int id) {
        this.isLeturer = isLeturer;
        this.id = id;
    }

    // Getter / setter

    public boolean getIsLeturer() {
        return isLeturer;
    }

    public int getId() {
        return id;
    }

    public void setIsLeturer(boolean isLeturer) {
        this.isLeturer = isLeturer;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Methods

    public void display() {
        System.out.println("Ma nhan vien: " + getId() + " | Giang vien: " + (getIsLeturer() ? "Co" : "Khong"));
    }

    public static void main(String[] args) {
        Staff s = new Staff(true, 1);
        s.display();

        Staff s1 = new Staff();
        s1.setIsLeturer(false);
        s1.setId(2);
        s1.display();
    }
}
