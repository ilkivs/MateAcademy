package HomeWork.hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Task_1_4 {

    public void printFiboNumbers(int n){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(fiboNumbers(i));
        }
        System.out.println(numbers);
    }

    private int fiboNumbers(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return fiboNumbers(n - 1) + fiboNumbers(n - 2);
        }
    }

    public int factorial(int num){
        int result;
        if (num == 1) {
            return 1;
        }
        result = factorial(num - 1) * num;
        return result;
    }

    public double taylorSeries(int n, double x){
        double result;
        if( n == 1) {
            return 1;
        }
        result = taylorSeries(n - 1, x)+ Math.pow(x, n-1) / factorial(n-1);
        return result;
    }

}
