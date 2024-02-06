package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		// shape bean is connected to default constructor
		Object obj=context.getBean("shape1");
		Shape shape1 = (Shape)obj;
		System.out.println("Address of instance shape1 from bean \"shape1\": " + shape1);

		Object obj1=context.getBean("shape1");
		Shape shape2 = (Shape)obj1;
		System.out.println("Address of instance shape2 from bean \"shape1\" with source prototype: " +shape2);
		
		System.out.println("***Bean \"shape2\" is connected to constructor argument.***");
		Object obj2=context.getBean("shape2");
		Shape shape3 = (Shape)obj2;
		shape3.method();

		
		
	}
}
