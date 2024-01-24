package ParentToChildCasting;

public class Child extends Parent{

    void printName(String name) {
        System.out.println("Name from child: " + name);
    }

    void printAddress(){
        System.out.println("Illinois");
    }
}
