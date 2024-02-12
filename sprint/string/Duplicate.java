package sprint.string;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {
    public static void main(String[] args) {
        String word = "HelloWorld";

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : word.toCharArray()) {
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }

        System.out.println("Duplicate:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}
