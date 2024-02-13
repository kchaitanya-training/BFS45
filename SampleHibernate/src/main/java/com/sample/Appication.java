package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sample.entity.Department;

public class Application {

    public static void main(String[] args) {
        SessionFactory factory = null;
        factory = new Configuration().configure().buildSessionFactory();

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        Department department = new Department();
        department.setDeptID(1);
        department.setDeptName("Computerscience");

        session.save(department); // Save the department to the database

        transaction.commit();
        session.close();
    }
}
