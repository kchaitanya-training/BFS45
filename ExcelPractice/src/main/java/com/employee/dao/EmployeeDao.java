package com.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.employee.model.Employee;
import com.employee.util.DBUtil;


public class EmployeeDao {

	public void saveEmployees(Employee emp) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.getConnection();
		
		PreparedStatement  ps = con.prepareStatement
				     ("insert into employees (emp_id,emp_name,address,salary) values (?,?,?,?)");
		          
	    ps.setInt(1, emp.getEmpId());
	    ps.setString(2, emp.getEmpName());
	    ps.setString(3, emp.getAddress());
	    ps.setInt(4, emp.getSalary());
	    
	    ps.execute();
		
		System.out.println("record has been inserted");
		ps.close();
		con.close();
		}
		
}