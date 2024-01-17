/*
 * Assessment 5
 * define argument method and pass input and return value in the same class.
 */

public class A5 {
    float sum(float numOne, float numTwo) {
        return numOne + numTwo;
    }

    int sum(int numOne, int numTwo, int numThree) {
        return numOne + numTwo + numThree;
    }

    public static void main(String[] args) {
        A5 assessment = new A5();

        float sum1 = assessment.sum(10.5f, 22.7f);
        int sum2 = assessment.sum(10, 20, 30);

        System.out.println("Sum 1 = " + sum1);
        System.out.println("Sum 2 = " + sum2);
    }
}
