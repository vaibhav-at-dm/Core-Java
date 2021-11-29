package jdbc;

import java.sql.*;

public class GetEmployee {
    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded ! ");
            String url = "jdbc:mysql://localhost:3306/test";
            con = DriverManager.getConnection(url,"root","Admin@123");
            System.out.println("Connected ! ");

            String sql = "select * from employee";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);     // for Select Query
            while (rs.next()){
                System.out.println("ID : " + rs.getInt(1));
                System.out.println("Name : " + rs.getString(2));
                System.out.println("Salary : " + rs.getFloat("salary"));
                System.out.println();
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            try
            {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
