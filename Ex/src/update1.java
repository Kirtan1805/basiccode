import java.sql.*;
public class update1 {
	public static void main(String args[]) throws Exception{
		update1();
	}
	public static void update1() throws Exception{
		String url ="jdbc:mysql://127.0.0.1:3306/info";
		String username = "root";
		String password = "1811";
		int id = 8;
		String Query = "update test set name='harwesh' where id = 2";
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement pst = con.prepareStatement(Query);
		int rows=pst.executeUpdate();
		System.out.println(rows);
		con.close();
	}
	}



