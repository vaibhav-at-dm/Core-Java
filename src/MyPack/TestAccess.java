package MyPack;

public class TestAccess {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        obj.myMethod();  // public, so anywhere
        obj.display(); // default access, so anywhere inside package only
        obj.print(); // protected access, so anywhere in package + inherited classes outside package
        // obj.show() will give error cause of private
    }
}
