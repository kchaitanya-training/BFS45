package coupling;

public class Bmw implements Car{

	String make;
	String model;
	int year;

	Bmw(String make, String model, int year){
		this.make= make;
		this.model = model;
		this.year = year;
	}
	
	public void carDetails() {
		System.out.println("\tMake: "+ make);
		System.out.println("\tModel: "+ model);
		System.out.println("\tYear: "+ year);
	}
}
