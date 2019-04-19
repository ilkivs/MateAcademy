package HomeWork.hw11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputData = scanner.nextLine().split("[^\\p{L}\\p{Digit}_]+");

        Map<String, List<String>> groupedWords = Arrays.stream(inputData)
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity()));

        groupedWords.entrySet()
                .stream()
                .sorted((o1, o2) -> o2.getValue().size() - o1.getValue().size())
                .limit(10)
                .forEach(word -> System.out.println(word.getKey() + "\t-\t" + word.getValue().size() + " times"));
    }
}
