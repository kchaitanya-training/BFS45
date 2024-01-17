/*
* Assessment 3
* */

public class A3 {
    public static void main(String[] args) {
        House h = new House();

        h.bedroom();
        h.kitchen();
        h.livingRoom();
    }
}

class House {

    public void bedroom() {
        int bed = 1;
        int shelves = 1;

        System.out.println("Bedroom has " + bed + " beds and " + shelves + " shelves");
    }

    public void kitchen() {
        int bed = 0;
        int shelves = 2;

        System.out.println("Kitchen has " + bed + " beds and " + shelves + " shelves");
    }

    public void livingRoom() {
        int bed = 0;
        int shelves = 0;

        System.out.println("Living room has " + bed + " beds and " + shelves + " shelves");
    }
}
