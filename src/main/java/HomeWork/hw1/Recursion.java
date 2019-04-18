package HomeWork.hw1;

import java.util.ArrayList;
import java.util.List;

/*
    Task 1.4
 */

public class Recursion {

    public void printFiboNumbers(int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(fiboNumbers(i));
        }
        System.out.println(numbers);
    }

    private int fiboNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fiboNumbers(n - 1) + fiboNumbers(n - 2);
        }
    }

    public int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return factorial(num - 1) * num;
    }

    public double taylorSeries(int n, double x) {
        if (n == 1) {
            return 1;
        }
        return taylorSeries(n - 1, x) + Math.pow(x, n - 1) / factorial(n - 1);
    }
}
