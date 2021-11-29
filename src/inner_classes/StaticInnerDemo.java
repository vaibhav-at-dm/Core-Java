package inner_classes;

public class StaticInnerDemo {
    private int n ;
    private static String msg;

    void show(){
        System.out.println("Number : " + n);
        System.out.println("Message : " + msg);
    }
    static void display(){
        System.out.println("msg : " + msg); // static method can only access static properties of a class
    }
    static class Inner{
        void myMethod(){
            msg = "Helllooo from inner classs";
            display();
            // static inner class access only the static properties of outer class
        }
    }

    public static void main(String[] args) {
        StaticInnerDemo.msg = "changed in main";
        StaticInnerDemo.display();
        StaticInnerDemo.Inner obj = new StaticInnerDemo.Inner();
        obj.myMethod();
    }
}
