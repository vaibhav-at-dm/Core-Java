package Java8Features;

@FunctionalInterface
public interface Test {
    void show();
    // void show1();  only one abstract method can be there in functional interface.
    default void hello(){

    }
    static void bye(){

    }
}
