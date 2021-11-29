package HomeAssignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEmp {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Enter ID : ");
            int empId = Integer.parseInt(br.readLine());
            System.out.println("Enter NAme : ");
            String empName = br.readLine();
            System.out.println("Enter Designation : ");
            String designation = br.readLine();
            System.out.println("Enter basic : ");
            double basic = Double.parseDouble(br.readLine());


            Emp e = new Emp(empId, empName, designation, basic);
            e.printDET();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
