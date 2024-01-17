/*
* Assessment 4
* */

public class A4 {
    public static void main(String[] args) {
        Child c = new Child();

        int result1 = c.sum(10, 20); // OVERRIDE
        int result2 = c.sum(10, 20, 30); // OVERLOAD

        System.out.println("Sum function from overriding = " + result1);
        System.out.println("Sum function from overloading = " + result2);
    }
}

class Parent {
    public int sum(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public int sum(int numOne, int numTwo, int numThree) {
        // OVERLOADING
        return numOne + numTwo + numThree;
    }
}

class Child extends Parent {
    public int sum(int numOne, int numTwo) {
        // OVERRIDING
        return numOne + numTwo;
    }
}