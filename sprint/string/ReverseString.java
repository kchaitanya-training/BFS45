package sprint.string;

public class ReverseString {
    public static void main(String[] args) {
        String word = "HelloWorld";
        StringBuilder reversed = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        System.out.println(reversed.toString());
    }
}
