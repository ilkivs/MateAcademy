package HomeWork.hw1;

import java.util.Random;

public class Task_1_6 {
    private int size;
    private int[][] arr;

    public Task_1_6(int size){
        Random r = new Random();
        this.size = size;
        arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = r.nextInt(100);
            }
        }
    }

    public int maxValue(){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public int minValue(){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    public void printMatrix(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
