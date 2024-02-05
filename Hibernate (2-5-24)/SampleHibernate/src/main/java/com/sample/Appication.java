package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sample.entity.Department;
import com.sample.entity.Employee;



class Appication {
	
	public static void main(String[] args) {
		SessionFactory factory =null;
		factory=new Configuration().configure().buildSessionFactory();
		
	Session session=factory.openSession();
	
	Transaction transaction=session.beginTransaction();

	// assigning department
	Department dept1 = new Department();
	dept1.setDeptName("HR");
	
	Department dept2 = new Department();
	dept2.setDeptName("Developer");
	
	
	Employee emp1 = new Employee();
	emp1.setCity("New York");
	emp1.setFirstName("uday");
	emp1.setLastName("kumar");
	emp1.setPostalCode("6002");
	emp1.setStreet("Crest");
	
	emp1.addDepartment(dept1);
	emp1.addDepartment(dept2);
	
	session.save(emp1);
	transaction.commit();
	session.close();
	
		
	}

}
