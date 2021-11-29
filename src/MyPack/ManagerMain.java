package MyPack;

public class ManagerMain {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(13);
        emp.setSalary(12000);
        emp.setName("Vaibhav D");

        System.out.println("Employee Details ");
        System.out.println("Id : " + emp.getId());
        System.out.println("Name : " + emp.getName());
        System.out.println("Salary : " + emp.getSalary());

        Manager mng = new Manager();
        mng.setId(5);
        mng.setSalary(20000);
        mng.setName("Preeti D");    // set id, salary, name is coming from employee class since manager extends employee
        mng.setProjId(437);
        mng.setProjName("ETL Transformation");

        System.out.println();

        System.out.println("Manager Details ");
        System.out.println("Id : " + mng.getId());
        System.out.println("Name : " + mng.getName());
        System.out.println("Salary : " + mng.getSalary());
        System.out.println("Project ID : " + mng.getProjId());
        System.out.println("Project Name : " + mng.getProjName());

    }
}
