package AssessmentDay8.recursion;

public class Main {]
    int factorial(int num) {
        if (num > 0) {
            return num * factorial(num - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Main f = new Main();

        int num = 10;
        int factorial = f.factorial(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
}