import java.sql.*;
public class delete1 {
	public static void main(String args[]) throws Exception{
		delete1();
	}
	public static void delete1() throws Exception{
		String url ="jdbc:mysql://127.0.0.1:3306/info";
		String username = "root";
		String password = "1811";
		int id = 8;
		String Query = "delete from test where id="+id;
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement pst = con.prepareStatement(Query);
		int rows=pst.executeUpdate();
		System.out.println(rows);
		con.close();
	}
	
	}



