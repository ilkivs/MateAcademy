package main.java.HomeWork.hw1;

/*
    Task 1.3
 */

public class MathOperations {

    public int pow(int a, int power) {
        int result = 1;

        if (power < 0) {
            System.out.println("You entered wrong power ...");
            return -1;
        }
        for (int i = 0; i < power; i++) {
            result *= a;
        }
        return result;
    }
}
