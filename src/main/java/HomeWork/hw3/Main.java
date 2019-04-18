package main.java.HomeWork.hw3;

import main.java.HomeWork.hw3.task1.MergeSort;
import main.java.HomeWork.hw3.task2.StagePlay;

public class Main {

    public static void main(String[] args) {
        System.out.println("===== Task 1 =====");
        MergeSort mergeSort = new MergeSort();
        System.out.println("Two arrays before merge sort:");
        mergeSort.printStartArrays();
        mergeSort.mergeArrays();
        System.out.println("Result array after merge sort:");
        mergeSort.printResultArray();

        System.out.println("\n===== Task 2 =====");
        StagePlay stagePlay = new StagePlay();
        stagePlay.groupTextByRoles();
        stagePlay.printGroupedText();
    }
}
