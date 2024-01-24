package referenceandinstance;

public class Main {
    public static void main(String[] args) {

        Vehicle obj = new Car();
        obj.capacity();
        obj.capacity(5);

//        obj.model(); This is not possible as the datatype of 'obj' is a parent class
        //which only allows the methods of parent class or the over ridden methods.
    }
}
