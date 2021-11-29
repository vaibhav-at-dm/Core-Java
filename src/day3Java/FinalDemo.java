package day3Java;

public class FinalDemo {
    private final int number = 10;  // declared and initialized . Now cant be changed afterwards

    public static void main(String[] args) {
        FinalDemo fd = new FinalDemo();
        System.out.println("Final Number is : " + fd.number);
    }

    final void display(){
        System.out.println("Final Display method in FinalDemo ");
    }
}

class childFinalDemo extends FinalDemo{
//    void display();    we cant override since this is final method in FinalDemo Class (parent class)
    void display(String msg)    // we can overload but not override
    {
        System.out.println("overloaded display in childFinalDemo + " + msg);
    }

    public static void main(String[] args) {
        childFinalDemo cfd = new childFinalDemo();
        cfd.display();
        cfd.display("Hello");
    }
}

// Final class we can't inherit
