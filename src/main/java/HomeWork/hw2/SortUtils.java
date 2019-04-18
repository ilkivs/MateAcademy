package main.java.HomeWork.hw2;

import java.util.Arrays;

import static java.lang.System.arraycopy;

/*
    Task 2.3
 */

public class SortUtils {

    public static final int RANDOM_MULTIPLIER = 10;

    public static int[] initArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * RANDOM_MULTIPLIER);
        }
        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    private static int[] merge(int[] a1, int[] a2) {
        int[] resultArr = new int[a1.length + a2.length];
        int i = 0, j = 0, k = 0;
        while ((i < a1.length) && (j < a2.length)) {
            resultArr[k++] = (a1[i] <= a2[j]) ? a1[i++] : a2[j++];
        }
        if (i < a1.length) {
            arraycopy(a1, i, resultArr, k, a1.length - i);
        } else if (j < a2.length) {
            arraycopy(a2, j, resultArr, k, a2.length - j);
        }
        return resultArr;
    }

    public static int[] mergeSort(int[] array, int lower, int upper) {
        int[] result;
        if (lower >= upper - 1) {
            return array;
        } else {
            int middle = (lower + upper) / 2;
            int[] buffer1 = Arrays.copyOfRange(array, 0, middle);
            int[] buffer2 = Arrays.copyOfRange(array, middle, upper);
            int[] sorted1 = mergeSort(buffer1, 0, buffer1.length);
            int[] sorted2 = mergeSort(buffer2, 0, buffer2.length);
            result = merge(sorted1, sorted2);
        }
        return result;
    }
}
