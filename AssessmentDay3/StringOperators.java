public class StringOperators {
    public static void main(String[] args) {
        String data = "HelloWorld";

        System.out.println(data.toUpperCase());
        System.out.println(data.toLowerCase());
        System.out.println(data.concat("Java"));
        System.out.println(data + "Java");
        System.out.println(data.substring(5));
        System.out.println(data.contains("Hello"));
        System.out.println(data.charAt(5));
        System.out.println(data.indexOf("World"));
    }
}
