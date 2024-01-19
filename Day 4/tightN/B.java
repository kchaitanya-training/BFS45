

public class B {

    void method() {
        System.out.println("It is A");

        Apartment myHome=new Apartment();

        myHome.roomType();
    }



    public static void main(String[] args) {
        B m = new B();
        m.method();
    }


}
