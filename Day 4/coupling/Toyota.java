package coupling;

public class Toyota implements Car{

	String make;
	String model;
	int year;

	Toyota(String make, String model, int year){
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
