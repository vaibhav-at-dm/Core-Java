package Java8Features;

public class TestMain {
    public static void main(String[] args) {
        /*Test t = new Test() {
            @Override
            public void show() {
                System.out.println("show() in TestMain");
            }
        };*/
        // lambda expression to give implementation to functional interface only.
        Test test = () ->{
            System.out.println("show() overridden using lambda expression");
        };
        test.show();

        Printer printer = (msg) -> {
            System.out.println("print() using lambda by passing : " + msg);
        };
        printer.print("Hii its 2nd November");

        Calculator cal = (a,b) -> {return a+b;};
        int res = cal.add(10,5);
        System.out.println("Result of addition by passing a , b and returning sum is " + res);

        // or

        Calculator cal1 = (a,b) -> (a+b);
        res = cal.add(5,20);
        System.out.println("Result of addition by passing a , b and returning sum is ommitted return statement " + res);
    }
}
