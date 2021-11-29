package MyPack;

public class SubClass extends SuperClass{
    void display(String msg)            // this is method overloading
    {
        System.out.println("display() in child with msg : " + msg);
    }
    void display()     // this is method overriding. Same signature is must while overriding. Just implementation(Definition) is different
    {
        System.out.println("Display() in Child !!");
    }
    public SubClass getObject()    // Access must be same or greater in case of referenced type . Must be same for other type. Lower type for referenced.
    {
        return new SubClass();
    }

    public static void main(String[] args) {
        SuperClass sup = new SuperClass();
        sup.display();
        SubClass sub = new SubClass();
        sub.display();

        sup = new SubClass();  // In parent class reference we can hold object of subclass
        sup.display();   // Subclass method will be called . So it depends upon object of the respective class.
        // sup is holding object of subclass thats why subclass methods will be called.
    }
}
