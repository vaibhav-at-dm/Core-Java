package inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingObject {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("/home/vaibhav.dubewar/Documents/WritingObject.txt");
            ObjectInputStream in = new ObjectInputStream(fin);

            Employee emp = (Employee) in.readObject();

            System.out.println("Employee Details ");
            System.out.println("Emp NAme : " + emp.getName()) ;
            System.out.println("Emp Id : " + emp.getId());
            System.out.println("Emp Salary : " + emp.getSalary());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
