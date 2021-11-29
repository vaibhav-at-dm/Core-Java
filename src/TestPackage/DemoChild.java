package TestPackage;

public class DemoChild extends Demo{
    @Override
    void show(String msg) {
        System.out.println(" Show in child class after overrriding " + msg);
    }

    void print(){
        System.out.println("Print in demoChild`");
    }
}
