package com.employee.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	static Connection con;
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost/test";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName(DRIVER);
		
		con =	DriverManager.getConnection(URL,USERNAME,PASSWORD);
		return con;
	}

	public static void closeConnetion() throws SQLException {
		if(con!= null) {
			con.close();
			con.clearWarnings();
		}
	}
}
