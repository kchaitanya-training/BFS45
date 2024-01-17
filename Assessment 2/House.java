// Qno 3
// Write a program to describe a house with encapsulation
package encapsulation;

public class House {

	String hallway = "Connecting passage to rooms";
	String livingRoom = "Comfortable & fun space";
	String bedroom = "Relaxation room";
	String bathroom = "Clean space for restroom and shower";
	String kitchen = "Well-furnished cooking space"; 
	String city, state, squareFt;
	int numOfrooms, numOfShelves;

	House(String city, String state,String squareFt){
		this.city = city;
		this.state = state;
		this.squareFt = squareFt;
	}

	void houseInfo() {
		System.out.println("Location (city,State): "+ city +","+state);
		System.out.println("Total House square foot: "+ squareFt);
	}
	void kitchenInfo(int numOfroom, int numOfShelves) {
		String contents = "Refrigerator, Stove, Dishwasher";
		System.out.println("\nKitchen: "+ kitchen);
		System.out.println("\tNumber of Kitchen:"+ numOfroom);
		System.out.println("\tNumber of Shelves:"+ numOfroom);
		System.out.println("\tKitchen contents:"+ contents);
	}
	void bathroomInfo(int numOfroom, int numOfShelves) {
		String contents = "Bathtub, Shower, Toilet";
		System.out.println("\nBathroom: "+ bathroom);
		System.out.println("\tNumber of Bathroom:"+ numOfroom);
		System.out.println("\tNumber of Shelves:"+ numOfroom);
		System.out.println("\tBathroom contents:"+ contents);
	}
	void livingRoomInfo(int numOfroom, int numOfShelves) {
		String contents = "Coffee table, Sofa, TV, Book shelves";
		System.out.println("\nLiving Room: "+ livingRoom);
		System.out.println("\tNumber of Living Room:"+ numOfroom);
		System.out.println("\tNumber of Shelves:"+ numOfroom);
		System.out.println("\tLiving Room On-Sale contents:"+ contents);
	}
	void bedroomInfo(int numOfroom, int numOfShelves) {
		String contents = "Bed, Mirror Dresser, Nightstands";
		System.out.println("\nBedroom: "+ bedroom);
		System.out.println("\tNumber of Bedroom:"+ numOfroom);
		System.out.println("\tNumber of Shelves:"+ numOfroom);
		System.out.println("\tBedroom on-sale contents:"+ contents);
		
	}
	
	public static void main(String[] args) {
		
		House house1 = new House("Dallas", "TX", "2850 sqft");
		
		System.out.println("*****House For Sale*****");
		house1.houseInfo();
		house1.bedroomInfo(4,6);
		house1.livingRoomInfo(1,7);
		house1.bathroomInfo(3,8);
		house1.kitchenInfo(1,10);
		
	}
}
