package com.bfs45.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    String dbName;
    String dbUser;
    String dbPassword;

    Connection dbConnection;

    public DatabaseConnection(String dbName, String dbUser, String dbPassword)
            throws ClassNotFoundException, SQLException {
        this.dbName = dbName;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;

        this.connectDB();
    }

    void connectDB() throws ClassNotFoundException, SQLException {
        // INITIALIZE DATABASE CONNECTION

        Class.forName("com.mysql.cj.jdbc.Driver");

        this.dbConnection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/" + this.dbName, // DATABASE URL
                this.dbUser, // DATABASE USER USERNAME
                this.dbPassword); // DATABASE USER PASSWORD
    }

    public void disconnectDB() throws SQLException {
        // DISCONNECT DATABASE

        this.dbConnection.close();
    }

    public Connection getDbConnection() {
        return this.dbConnection;
    }
}
