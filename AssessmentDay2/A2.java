/*
* Assessment 2
* */

public class A2 {
    String name;

    A2 (String username) {
        name = username;
    }

    public static void main(String[] args) {
        A2 assessment = new A2("Satshree");
        System.out.println("Hello " + assessment.name);
    }
}
