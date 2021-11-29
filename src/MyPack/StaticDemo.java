package MyPack;

public class StaticDemo {
    int number;
    static int count;

    //Non Static method
    public  void show()
    {
        System.out.println("Non Staic Method called");
        System.out.println("Number " + this.number);
        System.out.println("Count " + count);
    }

    //Static method
    public static void statMethod()
    {
        System.out.println("Staic Method called");
        //System.out.println("Number " + number);       can't access instance variables in static method
        System.out.println("Count " + StaticDemo.count); // or count
    }


    public static void main(String args[])
    {
        // variables
        StaticDemo.count = 100;
        System.out.println("Count is " + StaticDemo.count);
        // or
        System.out.println("Count is " + count); // becuase we are in same class and main is also in the same class


        // To Access the "Number" Variable we have to create an object

        StaticDemo obj = new StaticDemo();
        obj.number = 1;

        StaticDemo obj1 = new StaticDemo();
        obj1.number = 2;

        System.out.println();
        System.out.println("obj number is " + obj.number);
        System.out.println("obj1 number is " + obj1.number);

        obj.count = 200;  // We can change static members(class variables) by using instances of a class
        System.out.println();
        System.out.println("obj number is " + obj.count);
        System.out.println("obj1 number is " + obj1.count);

        // Methods
        System.out.println();
        statMethod();

        //To access non static method you need instance
        System.out.println();
        obj.show();
        System.out.println();
        obj1.show();


    }
}
