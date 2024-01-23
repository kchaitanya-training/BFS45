package AssessmentDay6.parentChild;

public class Child extends Parent {
    public void method1() {
        System.out.println("This is child method 1");
    }

    public void method2(int a) {
        System.out.println("This is child method 2, " + a);
    }

    public void method3() {
        System.out.println("This is child method 3");
    }

    public static void main(String[] args) {
        Parent ch = new Child();
        ch.method1();
        // ch.method3(); // ERROR

        Child ch1 = new Child();
        ch1.method1();
        ch1.method3();
    }
}