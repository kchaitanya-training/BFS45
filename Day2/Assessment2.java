//write a program to constructor argument
// constructor and creating the object and define
// instance variables.

public class Assessment2 {

    String message;

    Assessment2(int a, float b){
        message = "The sum is: ";
        System.out.println(message + (a+b));
    }

    public static void main(String[] args) {
        Assessment2 obj = new Assessment2(10, 20.50f);
    }
}
