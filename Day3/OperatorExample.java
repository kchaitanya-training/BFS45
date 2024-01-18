//some examples on operators like % ,/ (division) and a++,a--

public class OperatorExample {
    int a;
    float b;

    int sum(int a){
        return a++;
    }

    int diff(int a){
        return a--;
    }

    float mul(int a, float b) {
        return a*b;
    }

    float div(int a, float b){
        return a/b;
    }

    float div2(int a, float b){
        return a % b;
    }

    public static void main(String[] args) {
        OperatorExample res = new OperatorExample();
        System.out.println("The sum is: " + res.sum(10));
        System.out.println("The difference is: " +res.diff(21));
        System.out.println("The product is: " +res.mul(12, 3.9f));
        System.out.println("The division is: " +res.div(10, 1.50f));
        System.out.println("The remainder is: " +res.div(10, 2.5f));
    }


}
