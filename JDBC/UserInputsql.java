import java.sql.*;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class UserInputsql {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//load through class for mysql db
			Class.forName("com.mysql.jdbc.Driver");
			// connection url for mysql db
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3308/core","root","7492Riy@");
			//method  to execute queries
			
			//bufferreader
			PreparedStatement st= con.prepareStatement("insert into student values(?,?,?)");
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			do {
				System.out.println("enter id");
				int sid =Integer.parseInt(br.readLine());
				System.out.println("enter name");
				String  sname =(br.readLine());
				System.out.println("enter sage");
				int sage =Integer.parseInt(br.readLine());
				
				st.setInt(1,sid);
				st.setString(2,sname);
				st.setInt(3, sage);
				 st.executeUpdate();
				 System.out.println("insert sucessfully");
				 System.out.println("Do you want to continue: y/n");
				 String s =br.readLine();
				 if(s.startsWith("n")) {
					 break;
				 }
			}
				 while(true);
				 
			
			//System.out.println("");
	
		con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	}