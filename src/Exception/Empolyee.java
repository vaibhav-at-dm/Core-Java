package Exception;

public class Empolyee {
    private int id;
    private String name;
    private float salary;

    public Empolyee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }
}
