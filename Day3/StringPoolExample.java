public class StringPoolExample {

    public static void main(String[] args) {
        //Creating string by using string literal.

        //While creating string using string literal, it looks for
        //same value in the string pool and stores the new value only
        //if it is not found in the string pool.
        String first = "Hello World";
        String firstCopy = "Hello World";

        //Prints true as they share the same value in the string pool.
        System.out.println(first == firstCopy);

        String firstWord = "Hello";
        String finalString = firstWord + " World";

        //prints false as they are stored as two different values.
        System.out.println(finalString == first);

        //Creating string by making an object
        String second = new String("Hello USA");
        String third = new String("Hello USA");

        //prints false as they are two different objects although having
        //the same values.
        System.out.println(second == third);

    }
}
