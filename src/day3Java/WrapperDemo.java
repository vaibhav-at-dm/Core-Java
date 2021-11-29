package day3Java;

public class WrapperDemo {
    public static void main(String[] args) {
        Integer obj1  = new Integer(10);  // Boxing
        System.out.println("Obj1 : " + obj1);

        Float obj2 = new Float("10.32F");   // Boxing or Float obj2 = new Float(10.32F); or Float obj2 = new Float(10.32);
        System.out.println("Obj2 : " + obj2);

        Double obj3  = new Double(35628.765);  // Boxing
        System.out.println("Obj3 : " + obj3);

        int a = obj1.intValue();   // unboxing into primitive
        obj1 = new Integer(a + 20);  // Boxing (Wrapping)  This was to do before JDK5

        //After JDK5 we can perform operations directly
        // Auto-unboxing and auto-boxing introduced
        obj2 = obj2 + 30;
        System.out.println("Obj2 : " + obj2);

        Short obj4 = 10; // AutoBoxing
        System.out.println("Obj4 : " + obj4);

        Integer obj5 = 100; // AutoBoxing
        System.out.println("Obj5 : " + obj5);

        // Check Out more about wrapper classes in diary
    }
}
