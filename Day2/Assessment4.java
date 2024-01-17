//Write program to express overloading and override method in between parent and child relation
public class Assessment4 {
    public static void main(String[] args) {
        Child result = new Child();
        result.sum(2, 3.50f);
        result.sum(2, 3.14f, 10);
    }

}

class Parent {

    String message = "The sum is: ";
    void sum(int a, float b) {
        System.out.println(message + (a+b));
    }

    void sum(int a, float b, int c) {
        System.out.println(message + (a+b+c));
    }
}

class Child extends Parent {
    void sum(int a, float b) {
        System.out.println(message + (a+b));
    }
}
