/*
 * Assessment 2
 * write a program to consturce argument constructor and 
 * creating the object and define instance variables.
 * */

public class A2 {
    String name;

    A2(String username) {
        name = username;
    }

    public static void main(String[] args) {
        A2 assessment = new A2("Satshree");
        System.out.println("Hello " + assessment.name);
    }
}
