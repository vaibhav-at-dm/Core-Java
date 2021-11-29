package TestPackage;

public class TestChild implements Test{
    public void display(){
        System.out.println("Display in TestChild !!");
    }

    public static void main(String[] args) {
        Test t ; // Only reference can be created just like abstract class
        t = new TestChild();   // parent reference is storing object of child
        t.display();
        ((TestChild)t).show("Hello");
        System.out.println("Static number from Test interface : " + Test.number);
        t.print();  // No need to typecast since interface has extended other test
    }
    public void show(String st)
    {
        System.out.println("Show in TestChild : " + st);
    }
    public void print()
    {
        System.out.println("Print in TestChild : " );
    }
}
