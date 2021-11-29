package Exception;

import TestPackage.Test;

public class TestThrow {
    void division(int a , int b )
    {
        if (b == 0)
        {
            try {
                throw new ArithmeticException();
            }catch (ArithmeticException e){
                System.out.println("Division by Zero Not possible !");
            }
        }
        else{
            System.out.println("Division Result : " + (a/b));
            System.out.println("End of division");
        }
    }

    public static void main(String[] args) {
        TestThrow t = new TestThrow();
        t.division(10,2);
    }
}
