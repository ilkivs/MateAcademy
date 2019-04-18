package main.java.HomeWork.hw9;

/*
    Task 2.
    https://stepik.org/lesson/12781/step/12?unit=3128
 */

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMaxValue {

    public static <T> void findMinMax(Stream<? extends T> stream, Comparator<? super T> order,
                                      BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> streamList = stream.collect(Collectors.toList());

        minMaxConsumer.accept(
                streamList.stream().min(order).orElse(null),
                streamList.stream().max(order).orElse(null));
    }
}
