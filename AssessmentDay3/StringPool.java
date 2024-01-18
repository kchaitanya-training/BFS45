public class StringPool {
    public static void main(String[] args) {

        // STRING POOL
        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");
        String s4 = new String("Hello");

        // TRUE -> THEY BOTH POINT TOWARDS SAME LITERAL
        System.out.println(s1 == s2);

        // FALSE -> THEY ARE TWO DIFFERENT OBJECTS
        System.out.println(s3 == s4);
    }
}