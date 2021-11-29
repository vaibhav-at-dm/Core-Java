package Map;

public class Employee {
    private int id;
    private String name;
    private float salary;

    public Employee(int id, String name, float salary) {
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
    public int hashCode(){
        return this.id;
    }
    public boolean equals(Object o){
        if (o instanceof Employee){
            Employee e = (Employee) o;
            if (this.name.equals(e.name) && this.salary == e.salary)
            return true;
        }
        return false;
    }
}
