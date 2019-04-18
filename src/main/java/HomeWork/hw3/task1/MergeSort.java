package main.java.HomeWork.hw3.task1;

import java.util.Arrays;
import java.util.Random;

/*
    Task 1
 */

public class MergeSort {
    private int[] firstArray;
    private int[] secondArray;
    private int[] resultArray;
    private static final int RANDOM_BOUND_FOR_ARRAYS = 10;
    private static final int RANDOM_BOUND_FOR_NUMBERS = 100;

    public MergeSort() {
        initArrays();
    }

    public void mergeArrays() {
        if (firstArray.length > 0 && secondArray.length > 0) {
            int resultArrIndex = 0, firstArrIndex = 0, secondArrIndex = 0;
            while (resultArrIndex < resultArray.length) {
                if (firstArray[firstArrIndex] <= secondArray[secondArrIndex]) {
                    resultArray[resultArrIndex] = firstArray[firstArrIndex];
                    if (firstArrIndex < firstArray.length - 1) {
                        firstArrIndex++;
                    } else {
                        for (int i = secondArrIndex; i < secondArray.length; i++) {
                            resultArray[resultArrIndex + 1] = secondArray[i];
                            resultArrIndex++;
                        }
                        break;
                    }
                } else {
                    resultArray[resultArrIndex] = secondArray[secondArrIndex];
                    if (secondArrIndex < secondArray.length - 1) {
                        secondArrIndex++;
                    } else {
                        for (int i = firstArrIndex; i < firstArray.length; i++) {
                            resultArray[resultArrIndex + 1] = firstArray[i];
                            resultArrIndex++;
                        }
                        break;
                    }
                }
                resultArrIndex++;
            }
        } else {
            if (firstArray.length == 0) {
                resultArray = secondArray;
            } else {
                resultArray = firstArray;
            }
        }
    }

    public void printStartArrays() {
        System.out.println("First array:");
        System.out.println(Arrays.toString(firstArray));
        System.out.println("Second array:");
        System.out.println(Arrays.toString(secondArray));
    }

    public void printResultArray() {
        System.out.println("Result array:");
        System.out.println(Arrays.toString(resultArray));
    }

    private int[] createArray() {
        Random r = new Random();
        int arrSize = r.nextInt(RANDOM_BOUND_FOR_ARRAYS);
        int[] array = new int[arrSize];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(RANDOM_BOUND_FOR_NUMBERS);
        }
        return array;
    }

    private void initArrays() {
        firstArray = createArray();
        secondArray = createArray();
        resultArray = new int[firstArray.length + secondArray.length];
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
    }
}
