package HomeWork.hw11;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputData = scanner.nextLine().split("[^\\p{L}\\p{Digit}_]+");

        Map<String, List<String>> groupedWords = Arrays.stream(inputData)
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(o -> o));

        groupedWords.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .sorted((o1, o2) -> o2.getValue().size() - o1.getValue().size())
                .limit(10)
                .forEach(word -> System.out.println(word.getKey() + "\t-\t" + word.getValue().size() + " times"));
    }
}
