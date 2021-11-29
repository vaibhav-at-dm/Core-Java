package jdbc;

import java.sql.*;
import java.util.Scanner;

public class InsertEmployeePrepared {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Id : ");
            int id = sc.nextInt();
            System.out.println("Enter NAme : ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter Salary : ");
            float salary = sc.nextFloat();

            // connect db
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test";
            Connection con = DriverManager.getConnection(url,"root","Admin@123");

            //sql query
            String sql = "insert into employee values("+id+",'"+name+"',"+salary+")";
            String insertPreparedQuery = "insert into employee values(?,?,?)";

            // Associate query with connection
//            Statement st = con.createStatement();
            PreparedStatement pst = con.prepareStatement(insertPreparedQuery);
            pst.setInt(1,id);
            pst.setString(2,name);
            pst.setFloat(3,salary);
            int rows = pst.executeUpdate();     // incase of insert,update,delete queries
            if (rows > 0){
                System.out.println("Employee Record Inserted ! ");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
