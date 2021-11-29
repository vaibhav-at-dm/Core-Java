package Exception;

public class DivisionDemo {
    public static void main(String[] args) {
        int a = 0,b = 0;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please pass two command line arguments ");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Pass proper numbers");
        }
        try {
            System.out.println("Inside division try block ");
            System.out.println("Division Result  : " + (a/b));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero not possible");
        }
        System.out.println("End of main !! ");
    }
}
