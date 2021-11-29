package MyPack;

public class Child extends Parent{
    private int number;
    public Child(){                                 //compiler internally adds super statement(if we have not written explicitly) here, so it will go to default constructor of parent class.
        //super();     // This will call default constructor of Parent
        super("Vaibhav");         // here we wrote explicitly so compiler will not add this time. This will call parametrized constructor of parent
        System.out.println("Child Default Constructor ");  //Super() is for executing constructors of SuperClass.Present only in constructor
    }

    // Super is by default added by compiler at the start of every constructor. Super is very first statement of constructor
    // this() is same as super. Used for executing default or parametrized constructor(Depending upon argument passed) of same class.


    public Child(int number){
        this();                   // goes to default constructor of same class
        this.number = number;
        System.out.println("Child Parametrized Constructor " + this.number);

    }
    public static void main(String[] args) {
        Child c = new Child(2);

    }
}
