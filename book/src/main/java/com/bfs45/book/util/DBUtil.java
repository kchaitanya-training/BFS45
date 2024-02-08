package com.bfs45.book.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static Connection connection;

    public static Connection getConnection() throws ClassNotFoundException, SQLException{

        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bfs45","root","root");
        return connection;


    }

    public static void closeConnection() throws SQLException {
        if(connection!=null) {
            connection.close();
            connection=null;
        }
    }
}
