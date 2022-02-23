import java.sql.*;
public class jdbceg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3308/core","root","7492Riy@");
			Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from student ");
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " +rs.getString(2) + " " +rs.getInt(3));
			
		}
		con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
