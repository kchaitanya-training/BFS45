package com.comparable;

import java.util.*;
//
public class Grades implements Comparable{

	private int id;
	private String name;
	private char grade;
	
	public Grades(int id, String name, char grade) {
		this.id=id;
		this.name = name;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public char getGrade() {
		return grade;
	}
	
	public String toString() {
		return "[Id: "+id+", Name: "+name+", Grade: "+grade+"]";
	}

	@Override
	public int compareTo(Object o) {
		Grades g = (Grades)o; // must downcast o to be of type Grades to use its methods.
		return this.getId()-g.getId();
	}

	
	

}
