
public class TestThree {
	int numberOfRooms = 3;
	String address = "3500 Sun Bowl";
	
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	void Kitchen() {
		int numberOfUtensils = 20;
		int numberOfCookery = 10;
		System.out.println("Kitchen");
		System.out.println("Utensils: "+ numberOfUtensils);
		System.out.println("Pots and Pans: "+ numberOfCookery);
		
	}
	
	void bedroom() {
		System.out.println("Bed room");
		boolean toilet = true;
		if( toilet = true) {
		System.out.println("Has Tiolet");
		}
		else {
			System.out.println("No Tiolet");
		}
	}
	
	void livingRoom() {
		int noOfSofa=3;
		boolean tv = true;
		System.out.println("Living room");
		System.out.println("Number of Sofa: "+noOfSofa);
		System.out.println("Has TV: "+tv);
	}
	

	public static void main(String[] args) {
		TestThree house = new TestThree();
		System.out.println("House address: "+house.getAddress());
		System.out.println("Number of Rooms: "+house.getNumberOfRooms());
		house.Kitchen();
		house.bedroom();
		house.livingRoom();
		
		
	}
}
