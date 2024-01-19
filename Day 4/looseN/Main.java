import looseN.House;

public class Main {
    void method() {
        System.out.println("It is Main");

        House myHome=new SFH();

        myHome.roomType();
    }



    public static void main(String[] args) {
        Main m = new Main();
        m.method();
    }
}
