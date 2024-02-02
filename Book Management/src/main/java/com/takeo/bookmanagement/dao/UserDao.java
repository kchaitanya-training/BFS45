package com.takeo.bookmanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.takeo.bookmanagement.model.User;
import com.takeo.bookmanagement.util.DBUtil;

public class UserDao {

	public String saveUser(User user) {
		
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement("Insert into user(user_id, user_name, password, role) values (?,?,?,?)");
			
			ps.setString(1, user.getUserId());
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getRole());
			ps.execute();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				DBUtil.closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		return user.getUserId();
		
	}

}
