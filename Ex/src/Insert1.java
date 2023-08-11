import java.sql.*;
public class Insert1 {
public static void main(String args[]) throws Exception{
	insert1();
}
public static void insert1() throws Exception{
	String url ="jdbc:mysql://127.0.0.1:3306/info";
	String username = "root";
	String password = "1811";
	String Query = "insert into test values(?,?)";
	Connection con = DriverManager.getConnection(url,username,password);
	PreparedStatement pst = con.prepareStatement(Query);
	pst.setInt(1, 5);
	pst.setString(2, "praveen");
	pst.setInt(1, 8);
	pst.setString(2, "guru");
	int rows=pst.executeUpdate();
	System.out.println(rows);
	con.close();
}
}
