package com.bfs45.book.dao;

import com.bfs45.book.model.User;
import com.bfs45.book.util.DBUtil;

import java.sql.*;

public class UserDAO {

    Connection connection;

    public UserDAO() throws SQLException, ClassNotFoundException {
        this.connection = DBUtil.getConnection();
    }

    public String saveUser(User user) throws SQLException {

        PreparedStatement ps=connection.prepareStatement("INSERT INTO user(user_id,name,password,role) VALUES(?,?,?,?)");
        ps.setString(1, user.getUserID());
        ps.setString(2, user.getUsername());
        ps.setString(3, user.getPassword());
        ps.setString(4, user.getRole());
        ps.execute();

        ps.close();
//        DBUtil.closeConnection();

        return user.getUserID();
    }

    public User getUser(String username) throws SQLException {
        User user;


        PreparedStatement ps = connection.prepareStatement("SELECT user_id, name, password, role FROM user WHERE name=?");
        ps.setString(1, username);
        ps.execute();

        ResultSet result = ps.getResultSet();
        result.next();

        user = new User(
                result.getString(1),
                result.getString(2),
                result.getString(3),
                result.getString(4)
        );

        ps.close();

        return user;
    }

    public User getUserWithID(String userID) throws SQLException {
        User user;


        PreparedStatement ps = connection.prepareStatement("SELECT user_id, name, password, role FROM user WHERE user_id=?");
        ps.setString(1, userID);
        ps.execute();

        ResultSet result = ps.getResultSet();
        result.next();

        user = new User(
                result.getString(1),
                result.getString(2),
                result.getString(3),
                result.getString(4)
        );

        ps.close();

        return user;
    }
}
