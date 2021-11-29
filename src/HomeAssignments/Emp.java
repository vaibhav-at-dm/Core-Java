package HomeAssignments;
import Exception.LowSalaryException;

public class Emp {
    private int empId;

    public boolean getEmpId() {
        if (this.empId > 0){
            return true;
        }
        return false;
    }

    private String empName, designation;
    private double basic, hra;

    public Emp(int empId,String empName,String designation,double basic){
        if (basic < 500){
            try {
                throw new LowSalaryException("Basic Limit Not Satisfying");
            } catch (LowSalaryException e) {
                System.out.println("Cant make an employee object " + e.getMessage());
            }
        }
        else {
            this.empId = empId;
            this.empName = empName;
            this.designation = designation;
            this.basic = basic;
            this.hra = calculateHRA(this.basic);
        }
    }

    private double calculateHRA(double basic) {
        if (this.designation.equals("Manager")){
            return 10*(basic/100);
        }else if (this.designation.equals("Officer")){
            return 12*(basic/100);
        }else {
            return 5*(basic/100);
        }
    }
    public void printDET(){
        System.out.println("Employee Details ");
        System.out.println("ID : " + this.empId);
        System.out.println("Name : " + this.empName);
        System.out.println("Designation : " + this.designation);
        System.out.println("Basic : " + this.basic);
        System.out.println("HRA : " + this.hra);
    }
}
