package sprint.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 7);

        List<Integer> ascendingOrder = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Ascending: " + ascendingOrder);

        List<Integer> descendingOrder = numbers.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());

        System.out.println("Descending: " + descendingOrder);
    }
}
