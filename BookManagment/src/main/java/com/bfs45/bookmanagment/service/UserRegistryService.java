package com.bfs45.bookmanagment.service;
import java.util.Random;

import com.bfs45.bookmanagment.dao.UserDao;
import com.bfs45.bookmanagment.model.User;;
public class UserRegistryService {
	
	
	public String userCreation(User usr) {
		UserDao userDao=new UserDao();
		Random rd=new Random();
		int randomNum=rd.nextInt(1000);
		usr.setUserId(usr.getUserName()+"_"+randomNum);
		return	userDao.saveUser(usr);

	}
}
