package Java8Features;

public interface TestInterface {
    default void show(){               // from jdk8 default method of interface can have implementation
        System.out.println("Default from interface called ! ");
    }
    static void display(){           // static methods of interface can be implemented
        System.out.println("Static from interface called ! ");
    }
    // static and default can have implementation only from jdk8 inside interface
    void method();

    public static void main(String[] args) {
        TestInterface.display();
        TestInterface obj = new TestInterface() {
            @Override
            public void method() {
                System.out.println("method() called using anonymous class in TestInterface ");
            }
        };  // anonymous inner class
        obj.show();
        obj.method();
        // this is also called as functional interface as this has only one abstract method to be overridden. It has N static and default methods.
    }
}
