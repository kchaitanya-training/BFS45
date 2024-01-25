package com.collection.comparator;
import java.util.Comparator;
public class Dealer {

	private String make;
	private String model;
	private Integer year;
	
	public Dealer( String make, String model,Integer year) {
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
}
