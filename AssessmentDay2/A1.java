/*
 * Assessment 1
 * write program to define two methods with parameters , 
 * one method should call to another method and execute 
 * or call that method with object reference.
 */

public class A1 {

    int sum(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    void executeSum(int numOne, int numTwo) {
        int result = sum(numOne, numTwo);

        System.out.println(result);
    }

    public static void main(String[] args) {
        int numOne = 10;
        int numTwo = 25;

        A1 assessment = new A1();
        assessment.executeSum(numOne, numTwo);
    }

}
