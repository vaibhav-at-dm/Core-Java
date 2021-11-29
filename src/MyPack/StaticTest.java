package MyPack;

import java.util.Stack;

public class StaticTest {
    int number;
    static int count;
    static {                                          // static block where you can initialize your static members.Executed even before main method
        System.out.println("Inside Static BLock ");
        count = 100;
    }

    {             // this is init block. Will be called only when object is created. Called even before the constructor of an object.
        System.out.println("Init Block !! ");
        number = 10;
    }

    public static void main(String[] args) {
        System.out.println("Main Method ");
        System.out.println("Count : " + count);
        //System.out.println("number : " + number);
        StaticTest srt = new StaticTest();
        System.out.println(srt.number);

    }
}
