package inputoutput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputDemo {
    public static void main(String[] args) {
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            System.out.println("Enter Message : ");
            String msg = br.readLine();
            System.out.println("Received msg is " + msg);
            System.out.println("Enter Employee Details ");
            System.out.println("Enter ID ");
            int id = Integer.parseInt(br.readLine());
            System.out.println("Enter NAme ");
            String name = br.readLine();
            System.out.println("Enter Salary ");
            float salary = Float.parseFloat(br.readLine());

            System.out.println();

            System.out.println("Employee Details ");
            System.out.println("Name : " + name);
            System.out.println("Id  : " + id);
            System.out.println("Salary : " + salary);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
