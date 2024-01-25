package com.collection.comparable;

public class Car implements Comparable{

	private String make;
	private String model;
	private Integer year;
	
	public Car( String make, String model,Integer year) {
		super();
		this.model = model;
		this.make = make;
		this.year = year;
	}


	public String getModel() {
		return model;
	}

	public String getMake() {
		return make;
	}

	public Integer getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model= " + model + ", year=" + year + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		Car a=(Car)o;
		   return (this.getYear() < a.getYear() ) ? -1 : ((this.getYear() == a.getYear() ) ? 0 : 1);
	}
	
}
