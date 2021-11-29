package MyPack;

public class Student {
    private int rollNo;
    private String name;
    private float percentage;

    public Student(int r,String n, float per)
    {
        System.out.println("Parametrized Constructor called");
        rollNo = r;
        name = n;
        percentage = per;
    }

    public Student(){
        System.out.println("Default Constructor");
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public static void main(String[] args) {
        Student st = new Student(13,"Vaibhav Dubewar", (float) 84.16);  // parametrized cons called
        System.out.println("Student Details");
        System.out.println(st.name);
        System.out.println(st.rollNo);
        System.out.println(st.percentage);

        Student st1 = new Student(); // Default Constructor
        st1.setName("Vaibhav D");
        st1.setRollNo(14);
        st1.setPercentage(86);
        System.out.println(st1.percentage);
        System.out.println(st1.rollNo);
        System.out.println(st1.name);

    }
}
