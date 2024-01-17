/*
    ASSESSMENT 1
 */

public class Satshree {

    int numOne = 15;
    int numTwo = 30;

    int sum() {
        return numOne + numTwo;
    }

    int diff() {
        return numOne - numTwo;
    }

    public static void main(String[] args) {
        Satshree assessment = new Satshree();

        int sum = assessment.sum();
        int diff = assessment.diff();

        System.out.println(sum);
        System.out.println(diff);
    }
}
