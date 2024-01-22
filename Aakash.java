public class Aakash {
    // Method 1: This method prints a welcome message
    public void greet() {
        System.out.println("Hello, Aakash!");
    }

    // Method 2: This method performs a simple calculation
    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    // Main method to test the class
    public static void main(String[] args) {

        Aakash aakashInstance = new Aakash();

        // Calling the greet method
        aakashInstance.greet();

        // Calling the addNumbers method
        int result = aakashInstance.addNumbers(10,2);
        System.out.println("The sum of two numbers is: " + result);
    }
}
