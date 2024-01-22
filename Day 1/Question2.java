public class Question2 {

    public void method1() {
        System.out.println("Method 1 is calling Method 2");
        method2();
    }

    public void method2() {
        System.out.println("Method 2 is being called");
    }

    public static void main(String[] args) {
        Question2 q2instance = new Question2();

        q2instance.method1();
    }
}
