package TestPackage;

public interface Test extends Test2,Test1{   // one interface can extend multiple interfaces . Not like class which can extend at max only one class.
    void display();   // only declaration. By default, public and abstract because of interface.
    int number = 10;  // public static final by default
}
interface Test1{
    void display();
    void show(String str);
}

interface Test2{
    void print();
}
