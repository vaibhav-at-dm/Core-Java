package jdbc;

import java.sql.*;

public class CallableDemo {
    public static void main(String[] args) {
        try {
            // Connect to MySQl
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test";
            Connection con = DriverManager.getConnection(url,"root","Admin@123");

            //SQL query
            String sqlQ = "{call getEmp1(?,?,?)}";
            CallableStatement cs = con.prepareCall(sqlQ);

            cs.setInt(1,189);
            cs.registerOutParameter(2, Types.VARCHAR);
            cs.registerOutParameter(3,Types.FLOAT);

            cs.execute();

            System.out.println("EMployee Details ");
            System.out.println("Name : " + cs.getString(2));
            System.out.println("Salary : " + cs.getFloat(3));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
