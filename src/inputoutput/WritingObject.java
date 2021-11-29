package inputoutput;


import java.io.*;
import java.util.Scanner;

public class WritingObject  {    // serializable is a marker interface . Due to this state of object(data members of a class) will be automatically converted into byte stream.
    public static void main(String[] args) {
        FileOutputStream fout = null;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ID : " );
            int id = sc.nextInt();
            System.out.println("Enter Name : ");
            String name = sc.next();
            System.out.println("Enter Salary : ");
            float salary = sc.nextFloat();

            Employee emp = new Employee(id,name,salary);

            fout = new FileOutputStream("/home/vaibhav.dubewar/Documents/WritingObject.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);    // to write object on file

//            out.writeObject(emp);            // here we have to do serialization. Convert state of object (data members) into byte stream.

            // if a class implements serializable , it will automaticaly does the convertion
            out.writeObject(emp);
            System.out.println("Writing employee object on file !");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fout != null){
                fout.close();}
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
