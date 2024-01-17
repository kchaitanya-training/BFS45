//write program to define two methods with parameters , one method should call to
// another method and execute or call that method with object reference.

public class Assessment1 {
    public void sum(int a, float b) {
        float result = calc(a, b);
        System.out.println("The sum is: " + result);
    }

    float calc(int firstNum, float secondNum){
        return firstNum + secondNum;
    }

    public static void main(String[] args) {
        Assessment1 obj = new Assessment1();
        obj.sum(10, 1.11f);
    }
}
