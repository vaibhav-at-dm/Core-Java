package collection;

public class Student {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name, float percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }

    private float percentage;

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public float getPercentage() {
        return percentage;
    }

    public String toString() {
        return "Roll No : " + this.rollNo + " Name : " + this.name + " Percentage : " + this.percentage;
    }

    public int hashCode() {
        return this.rollNo;
    }

    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student s = (Student) o;
            if (this.name.equals(s.name) && this.percentage == s.percentage) {
                return true;
            }
        }
        return false;
    }

}
