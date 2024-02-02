package com.takeo.bookmanagement.service;

import java.util.Random;

import com.takeo.bookmanagement.dao.UserDao;
import com.takeo.bookmanagement.model.User;

public class UserRegisterService {

	public String userCreation(User user) {
		
		Random num = new Random();
		int randId = num.nextInt(1000);
		user.setUserId(user.getUserName()+"_" + randId);
		
		UserDao userDao = new UserDao();
		String id = userDao.saveUser(user);
		return id;
		
	}
}
