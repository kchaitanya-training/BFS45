package com.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

	@Bean(name = "circle")
	public Circle circle() {
		return new Circle();
	}
	
	@Bean(name = "shape1")
	@Scope(value= "prototype")
	// calls default constructor
	public Shape method1() {
		return new Shape();
	}
	
	@Bean(name = "shape2")
	// calling constructor argument with some value
	public Shape method2() {
		return new Shape(4.5f, circle());
	}
}
