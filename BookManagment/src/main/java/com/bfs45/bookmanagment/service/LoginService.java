package com.bfs45.bookmanagment.service;

import com.bfs45.bookmanagment.dao.UserDao;
import com.bfs45.bookmanagment.model.User;

public class LoginService {
	
	public User validateUser(String userId,String password) throws Exception {
		if((!userId.isEmpty() || userId!=null)
				|| (!password.isEmpty()||password!=null)) {
			UserDao userDao=new UserDao();
			User user=userDao.validateUser(userId, password);
			return user;
		}else {
			throw new Exception(" Please enter proper details ");
		}
		
		
	}

}
