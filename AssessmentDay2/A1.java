/*
* Assessment 1
* */

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
