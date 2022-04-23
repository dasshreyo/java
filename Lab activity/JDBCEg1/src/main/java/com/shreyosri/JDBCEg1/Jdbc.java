package com.shreyosri.JDBCEg1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Jdbc {
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int ch, id;
		String Name,Department;
		try {
			Connection con = Helper.makeCon();
			// execute queries with DB
			Statement st = con.createStatement();

			do {
				System.out.println("1. Insert \n 2. Update \n 3. Delete \n 4. Display \n 5. Exit");
				System.out.println("Enter your choice");
				ch = Integer.parseInt(s.nextLine());
				System.out.println("---------------");
				switch (ch) {
				case 1:
					//System.out.println("how many record you want ?");
					//int n = Integer.parseInt(s.nextLine());

					//for (int i = 0; i < n; i++) {
						System.out.println("Enter Eployee id");
						id = s.nextInt();
						System.out.println("Enter Emplyee name");
						Name = s.next();
						System.out.println("Enter Department");
						Department = s.next();

						st.executeUpdate("insert into jdbcemp values(" + id + ", " + Name + ", " + Department + ")");
						System.out.println("record inserted");
					//}
					break;

				case 2:
					System.out.println("Enter id");
					id = s.nextInt();;
					System.out.println("Enter your Department");
					Department = s.next();
					st.executeUpdate("update jdbcemp set Department='" + Department + "'where id =" + id);
					System.out.println("record updated");
					break;

				case 3:
					System.out.println("Enter id");
					id = Integer.parseInt(s.nextLine());
					st.executeUpdate("delete from jdbcemp where id=" + id);
					System.out.println("record deleted");
					break;

				case 4:
					ResultSet rs = st.executeQuery("Select * from jdbcemp");
					while (rs.next()) {
						System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
					}

				case 5:
					System.exit(0);
				}
			} while (ch != 5);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
