package inner_classes;

public class MemberInnerDemo {
    private int number;
    private static String msg;
    public void display(){
        number = 10;
        msg = "Hello";
        System.out.println("Number : "  + number);
        System.out.println("Message : "  + msg);

    }
    class InnerClass{
        void show(){
            display();
            number = 20;
            msg = "Inner Demo";
            System.out.println("Number : " + number);
            System.out.println("Msg : " + msg);
        }
    }

    public static void main(String[] args) {
        MemberInnerDemo obj = new MemberInnerDemo();
        obj.display();
        MemberInnerDemo.InnerClass inner = obj.new InnerClass();  // need object of outer class for creation of object of inner class
        inner.show();
    }
}
