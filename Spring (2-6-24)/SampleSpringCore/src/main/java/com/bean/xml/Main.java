package com.bean.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Object obj=context.getBean("shape");
		Shape shape1 = (Shape)obj;
		System.out.println(shape1);
//		shape1.method();
		
		
		Object obj1=context.getBean("shape");
		Shape shape2 = (Shape)obj1;
		System.out.println(shape2);
		

		
		
	}
}
