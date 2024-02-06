package com.bfs45.bookmanagment.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	
	private static Connection connection;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/bfs45","root","root");  
					return connection;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return connection;
		
	}
	
	public static void closeConnection() {
		if(connection!=null) {
			try {
				connection.close();
				connection=null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
