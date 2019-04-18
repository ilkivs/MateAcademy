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
        if (seed < 0) {
            throw new IllegalArgumentException("Seed is less than 0");
        }
        currentNumber = seed;
        return IntStream.generate(() -> mid(currentNumber, index++));
    }

    private static int mid(int number, int index) {
        if (index == 0) {
            return number;
        }
        currentNumber = (int) Math.pow(number, 2) % 10000 / 10;
        return currentNumber;
    }
}
