package HomeWork.hw8;

import java.util.stream.IntStream;

/*
    Task 3.
    https://stepik.org/lesson/12781/step/11?unit=3128
 */

public class NumberGenerator {

    private static int currentNumber;
    private static int index = 0;

    public static IntStream pseudoRandomStream(int seed) {
        currentNumber = seed;
        return IntStream.generate(() -> mid(currentNumber, index++));
    }

    private static int mid(int number, int index) {
        if (index == 0) {
            return number;
        }
        number *= number;
        int first = 0, second = 0, third = 0;
        if (number > 9) {
            first = number % 100 / 10;
        }
        if (number > 99) {
            second = number % 1000 / 100;
        }
        if (number > 999) {
            third = number % 10000 / 1000;
        }
        currentNumber = third * 100 + second * 10 + first;
        return currentNumber;
    }
}
