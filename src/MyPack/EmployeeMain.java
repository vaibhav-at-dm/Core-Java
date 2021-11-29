package MyPack;

public class EmployeeMain {
    public static void  main(String args[])
    {
        Employee emp = new Employee();
        emp.setId(437);
        emp.setName("Vaibhav Dubewar");
        emp.setSalary((float) 10000.567);

        System.out.println("Here are the Employee Details");
        System.out.println("Name is " + emp.getName());
        System.out.println("Salary : " + emp.getSalary());
        System.out.println("ID is " + emp.getId());
    }
}
