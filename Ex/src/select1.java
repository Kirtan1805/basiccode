import java.sql.*;
public class select1 {
	public static void main(String args[]) throws Exception{
		select1();
	}
	public static void select1() throws Exception{
		String url ="jdbc:mysql://127.0.0.1:3306/info";
		String username = "root";
		String password = "1811";
		String Query = "select * from test;";
		Connection con = DriverManager.getConnection(url,username,password);
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery(Query);
		while(rs.next()) {
			System.out.println("student id:"+rs.getInt(1));
			System.out.println("Student name:"+rs.getString(2));
		}
		con.close();
	}
	}
