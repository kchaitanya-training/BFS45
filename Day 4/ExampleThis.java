public class ExampleThis {
    int x;

    public ExampleThis(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        ExampleThis myObj = new ExampleThis(5);
        System.out.println("Value of x = " + myObj.x);
    }
}
