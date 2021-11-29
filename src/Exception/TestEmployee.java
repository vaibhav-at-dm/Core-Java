package Exception;

public class TestEmployee {
    public static void main(String[] args) {
        int id = Integer.parseInt(args[0]);
        String name = args[1];
        float salary = Float.parseFloat(args[2]);


        if (salary < 10000)
        {
            try
            {
            throw new LowSalaryException("Salary 10k peksha kami ahe ");
        }
            catch (LowSalaryException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        }
        else {
            Empolyee emp = new Empolyee(id,name,salary);
            System.out.println("Employee Details ");
            System.out.println("ID is " + emp.getId());
            System.out.println("Salary is " + emp.getSalary());
            System.out.println("NAme is : " + emp.getName());
        }
    }
}
