package MyPack;

public class AccessDemo {
    private void show()
    {
        System.out.println("Show() with private access");
    }
    void display()
    {
        System.out.println("display() with default access");
    }     // default
    protected void print()
    {
        System.out.println("print() with protected access");
    }
    public void myMethod()
    {
        System.out.println("myMethod() with public access");
    }

    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        obj.show();
        obj.display();
        obj.print();
        obj.myMethod();
    }
}
