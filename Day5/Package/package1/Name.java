package com.sonam.package1;

// public keyword makes this class visible to other packages.
public class Name {
	
	// default access specifier won't make this method visible to other 
	// packages. 
	public void printName(String name) {
		System.out.println("Name: "+ name);
	}

}
