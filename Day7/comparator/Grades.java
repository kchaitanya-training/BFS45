package com.comparator;

public class Grades {
	
	private int id;
	private String name;
	private char grade;
	
	public Grades(int id, String name, char grade) {
		this.id = id;
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
}
