package Java8Features;

public class TestInterfaceChild implements TestInterface{
    @Override
    public void method() {
        System.out.println("method() from TestInterfaceChild ! ");
    }

    public static void main(String[] args) {
        TestInterface.display();
        TestInterfaceChild obj = new TestInterfaceChild();
        obj.show();
        obj.method();
    }
}
