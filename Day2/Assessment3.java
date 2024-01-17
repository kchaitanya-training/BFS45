//Encapsulation : Pls write a program to describe a house
public class Assessment3 {

    String roomName;
    String commonText;
    int shelfCount;

    public void room1(int a) {
        roomName = "Bed Room";
        shelfCount = a;
        System.out.println(commonText + roomName + " with " + shelfCount + " shelves.");
    }

    public void room2(int a) {
        roomName = "Child Room";
        shelfCount = a;
        System.out.println(commonText + roomName + " with " + shelfCount + " shelves.");
    }

    public void room3(int a) {
        roomName = "Hall Room";
        shelfCount = a;
        System.out.println(commonText + roomName + " with " + shelfCount + " shelves.");
    }

    public void room4(int a) {
        roomName = "Kitchen";
        shelfCount = a;
        System.out.println(commonText + roomName + " with " + shelfCount + " shelves.");
    }

    public static void main(String[] args) {
        Assessment3 house = new Assessment3();
        house.commonText = "This is ";
        house.room1(3);
        house.room2(2);
        house.room3(5);
        house.room4(8);

    }
}
