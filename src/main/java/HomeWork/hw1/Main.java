package HomeWork.hw1;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("===== Task 1.1 =====");
        Bets task1 = new Bets();
        System.out.println(task1.footballMatch(2, 3, 0, 1));

        System.out.println("===== Task 1.2 =====");
        FigureDrawing task2 = new FigureDrawing();
        task2.drawRhombus(3);

        System.out.println("===== Task 1.3 =====");
        MathOperations task3 = new MathOperations();
        System.out.println(task3.pow(3, 4));

        System.out.println("===== Task 1.4 =====");
        Recursion task4 = new Recursion();
        System.out.println("1) Fibonacci numbers: ");
        task4.printFiboNumbers(10);
        System.out.println("2) Factorial: ");
        System.out.println(task4.factorial(5));
        System.out.println("3) Taylor series: ");
        System.out.println("Sum = " + task4.taylorSeries(3, 3));

        System.out.println("===== Task 1.6 =====");
        MatrixOperations task6 = new MatrixOperations(5);
        task6.printMatrix();
        System.out.println("Max value = " + task6.maxValue());
        System.out.println("Min value = " + task6.minValue());

        System.out.println("===== Task 1.7 =====");
        Car task7 = new Car("Volkswagen", "Golf", 2016);
        Car cloneTask7 = task7;
        System.out.println("1) Shallow copy:");
        System.out.println(task7);
        System.out.println(cloneTask7);
        cloneTask7 = (Car) task7.clone();
        System.out.println("1) Deep copy:");
        System.out.println(task7);
        System.out.println(cloneTask7);
    }
}
