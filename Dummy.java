public class Dummy {
    int x() {

        System.out.println("Hello");
        return 5;
    }

    void y() {
        int b =4;
        System.out.println(b);
        System.out.println(x());
    }

    public static void main(String[] args){
        Dummy myName = new Dummy();
        myName.y();
    }
}
