package ParentToChildCasting;

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        p.printName("Aashirwad");

        //UpCasting
        Child c = (Child) p;
        c.printName("George");

        //DownCasting
        Parent pt = (Parent) c;
        pt.printName("Juan");

    }
}
