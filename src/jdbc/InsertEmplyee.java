package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertEmplyee {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Id : ");
            int id = sc.nextInt();
            System.out.println("Enter NAme : ");
            String name = sc.next();
            System.out.println("Enter Salary : ");
            float salary = sc.nextFloat();

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test";
            Connection con = DriverManager.getConnection(url,"root","Admin@123");
            String sql = "insert into employee values("+id+",'"+name+"',"+salary+")";
            Statement st = con.createStatement();
            int rows = st.executeUpdate(sql);     // incase of insert,update,delete queries
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
