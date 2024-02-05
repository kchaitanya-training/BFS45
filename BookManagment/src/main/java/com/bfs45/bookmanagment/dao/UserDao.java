package com.bfs45.bookmanagment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bfs45.bookmanagment.model.User;
import com.bfs45.bookmanagment.util.DBUtil;

public class UserDao {
	
	public String saveUser( User user) {
		
		Connection con=DBUtil.getConnection();
		PreparedStatement ps=null;
		try {
			 ps=
					con.prepareStatement("Insert into user(user_id,user_name,password,role) values(?,?,?,?)");
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
	
	
	
	public User validateUser(String userId,String password) {
		Connection con=DBUtil.getConnection();
		PreparedStatement ps=null;
		User user=null;
		try {
			 ps=
					con.prepareStatement("SELECT * FROM USER u WHERE u.USER_ID=? AND u.PASSWORD=?");
			 ps.setString(1, userId);
			 ps.setString(2, password);
			ResultSet rs= ps.executeQuery();
	
			while(rs.next()) {
				 user=new User(rs.getString(1),
						           rs.getString(2),
						           rs.getString(3),
						           rs.getString(4)
						             );
			}} catch (SQLException e) {
				
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
				
				return user;
			 
	}


}
