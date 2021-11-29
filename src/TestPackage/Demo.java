package TestPackage;

public abstract class Demo {
    abstract void show(String msg);    // As class has abstract method. Class becomes abstract. Reverse is not compulsory. Abstract class can have concrete methods.
    void display(){
        System.out.println(" Display in demo class (Concrete)");
    }

    public static void main(String[] args) {
//        Demo d = new Demo();  'Demo' is abstract; cannot be instantiated
        Demo d; // Only reference can be created
        d = new DemoChild();    // parent reference is holding object of child
        d.display();
        d.show("Hello");
        // d.print();  parent refernce cant access child method
        // Cast it into childClass object
        ((DemoChild)d).print();
    }
}
