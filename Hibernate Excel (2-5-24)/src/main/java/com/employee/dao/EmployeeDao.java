package com.employee.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.employee.model.Employee;
import com.employee.util.HibernateUtil;


public class EmployeeDao {

	public void saveEmployees(Employee emp) {
		
	
			SessionFactory factory =null;
			factory=new Configuration().configure().buildSessionFactory();
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();

			Employee saveEmployee = new Employee();
	        saveEmployee.setEmpName(emp.getEmpName());
	        saveEmployee.setAddress(emp.getAddress());
	        saveEmployee.setSalary(emp.getSalary());
	        session.save(saveEmployee);

	        transaction.commit();
	        HibernateUtil.closeSessionFactory();
	        System.out.println("Record has been inserted");
	}

}