package HomeWork.hw8;

import HomeWork.hw8.Mail.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== Task 1 =====");

        System.out.println("assert test started");
        new Test().test();
        System.out.println("assert test finished");

        System.out.println("===== Task 2 =====");

        List<Integer> numbers = Arrays.asList(14, 5564, 234, 989, 5, 43, 99, 100);
        Comparator<Integer> comparator = Comparator.naturalOrder();
        BiConsumer<Integer, Integer> biConsumer =
                (minValue, maxValue) -> System.out.println("minValue = " + minValue + ", maxValue = " + maxValue);

        MinMaxValue.findMinMax(numbers.stream(), comparator, biConsumer);

        System.out.println("===== Task 3 =====");

        NumberGenerator.pseudoRandomStream(13).limit(10).forEach(System.out::println);
    }
}
