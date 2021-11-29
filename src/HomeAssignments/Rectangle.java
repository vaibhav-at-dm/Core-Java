package HomeAssignments;

public class Rectangle {
    private float length;
    private float breadth;

    public Rectangle()
    {
        length = 0;
        breadth = 0;
    }
    public Rectangle(float length,float breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

    public float getArea(){
        return this.length * this.breadth;
    }
    public void display()
    {
        System.out.println("Length of this Rectangle is " + this.length);
        System.out.println("Breadth of this Rectangle is " + this.breadth);
    }
}
