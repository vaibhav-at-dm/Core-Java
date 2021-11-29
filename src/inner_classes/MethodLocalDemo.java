package inner_classes;

public class MethodLocalDemo {
    private int number ;
    private static String msg;
    public void show(){
        System.out.println("In Show() ");
        System.out.println("Number  : "  +number);
        System.out.println("Message  : "  +msg);
    }
    public void display(String str){
        class LocalInner{
            void myMethod(){
                number = 100;
                msg = " Local class inside a method";
                show();
                System.out.println("str : "  +str);
            }
        }
        LocalInner obj = new LocalInner();
        obj.myMethod();
    }

    public static void main(String[] args) {
        MethodLocalDemo obj = new MethodLocalDemo();
        obj.display("Passed to display where Inner Class is created");
    }
}
