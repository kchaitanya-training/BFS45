package Comparing;
import java.util.*;

public class  Detail implements Comparable <Detail>{
	private String name;
	private int number;
	private int Id;
	
	public Detail(String name, int number, int Id) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.number = number;
		this.Id = Id;
		
	}
	@Override
	public int compareTo(Detail o) {
		// TODO Auto-generated method stub
		return this.Id - o.Id;
	}
	public String toString() {
		return ("Name:"+name + " ,Number:" + number + ",Id: " + Id);
	}
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public int getId() {
		return Id;
	}
	

}
