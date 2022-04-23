package com.shreyosri.JDBCEg1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Helper {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			System.out.println(e);
		}

	}

	public static Connection makeCon() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3308/core", "root", "7492Riy@");
	}
}

