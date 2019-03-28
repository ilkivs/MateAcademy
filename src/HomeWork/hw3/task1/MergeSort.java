package HomeWork.hw3.task1;

import java.util.Arrays;
import java.util.Random;

/*
    Task 1
 */

public class MergeSort {
    private int[] firstArray;
    private int[] secondArray;
    private int[] resultArray;

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

    private int min(int firstValue, int secondValue) {
        return firstValue < secondValue ? firstValue : secondValue;
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

    private void initArrays() {
        Random r = new Random();
        int firstArrSize = r.nextInt(10);
        int secondArrSize = r.nextInt(10);
        firstArray = new int[firstArrSize];
        secondArray = new int[secondArrSize];
        resultArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = r.nextInt(100);
        }
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = r.nextInt(100);
        }
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
    }
}
