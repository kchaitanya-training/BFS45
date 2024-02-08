package com.bfs45.book.service;

import com.bfs45.book.dao.UserDAO;
import com.bfs45.book.model.User;

//import java.sql.SQLException;

public class LoginService {
    public User authenticate(String username, String password) {
        UserDAO dao;
        User user;
        try {
            dao = new UserDAO();
            user = dao.getUser(username);
            if (user == null) {
                throw new Exception("Unable to authenticate");
            } else if (!user.getPassword().equals(password)) {
                throw new Exception("Unable to authenticate");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return user;
    }
}
