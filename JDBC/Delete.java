import java.sql.*;
public class Delete {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//load through class for mysql db
			Class.forName("com.mysql.jdbc.Driver");
			// connection url for mysql db
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3308/core","root","7492Riy@");
			//method  to execute queries
			Statement st=con.createStatement();
			//delete record
			int res=st.executeUpdate("delete from student where sid=2");
					System.out.println("deleted sucessfully");
			//select statement
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


