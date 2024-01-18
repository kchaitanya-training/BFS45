/*Encapsulation : Pls write a program to describe a house
 * */
public class Q3 {
	
	private String color;
	
	Q3(int numOfRooms, int numOfFloors){
		System.out.println("This house has "+ numOfFloors + " floors and "+ numOfRooms + " rooms.");
	}
	
	void livingRoom(int floor) {
		System.out.println("The living room is on floor "+ floor );
	}
	
	void kitchen(int floor) {
		System.out.println("The kitchen is on floor "+ floor);
	}
	
	int bedRoom(int room) {
		return room;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

	public static void main(String[] args) {
		Q3 house1 = new Q3(5,2);
		house1.setColor("white");
		System.out.println("Color of the house: "+ house1.getColor());
		System.out.println("There are "+ house1.bedRoom(3) + " bedrooms.");
		house1.livingRoom(1);
		house1.kitchen(2);
		
		System.out.println();
		
		Q3 house2 = new Q3(4,1);
		house2.setColor("Beige");
		System.out.println("Color of the house: "+ house2.getColor());
		System.out.println("There are "+ house2.bedRoom(2) + " bedrooms.");
		house2.livingRoom(1);
		house2.kitchen(1);
		
	}

	

}
