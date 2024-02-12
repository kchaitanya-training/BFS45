package sprint.string;

public class StringCase {
    public static void main(String[] args) {
        String word = "HeLLoWoRLd";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            if (currentChar >= 97 && currentChar <= 122) {
                result.append((char) (currentChar - 32));
            } else if (currentChar >= 65 && currentChar <= 90) {
                result.append((char) (currentChar + 32));
            } else {
                result.append(currentChar);
            }
        }

        System.out.println(result.toString());
    }
}
