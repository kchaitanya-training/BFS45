package com.bfs45.book.service;

import com.bfs45.book.dao.UserDAO;
import com.bfs45.book.model.User;

import java.sql.SQLException;
import java.util.Random;

public class UserRegisterService {
    public String createUser(User user) throws SQLException, ClassNotFoundException {
        UserDAO dao = new UserDAO();

        Random rd=new Random();
        int randomNum=rd.nextInt(1000);
        user.setUserID(user.getUsername()+"_"+randomNum);

        return	dao.saveUser(user);

//        if (dao.getUser(user.getUsername()) == null) {
//            Random rd=new Random();
//            int randomNum=rd.nextInt(1000);
//            user.setUserID(user.getUsername()+"_"+randomNum);
//
//            return	dao.saveUser(user);
//        } else {
//            throw new SQLException("User already exists");
//
//        }
    }
}
