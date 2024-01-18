/*
 * Encapsulation : Pls write a program to describe a house
 */
public class House {
	String color;
	int floors;
    int bathroom;
	int kitchen;
	
	public void color(String color) {
	
		System.out.println("House color:"+ color);
		
	}
	public void noOfFloors(int floors) {
		System.out.println("Number of rooms:" + floors);
	}
	public void noOfBathrooms(int bathrooms) {
		System.out.println("Number of bathrooms:" + bathrooms);
	}
	public void noOfKitchens(int kitchens) {
		System.out.println("Number of kitchens:" + kitchens);
	}
	
	public static void main(String[] args) {
		House ref = new House();
		ref.color("blue");
		ref.noOfFloors(6);
		ref.noOfBathrooms(12);
		ref.noOfKitchens(12);
		
	}
	
}
