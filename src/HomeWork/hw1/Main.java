package HomeWork.hw1;


public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("===== Task 1.1 =====");
        Task_1_1 task1 = new Task_1_1();
        System.out.println(task1.footballMatch(2, 3, 0, 1));

        System.out.println("===== Task 1.2 =====");
        Task_1_2 task2 = new Task_1_2();
        task2.drawStar(3);

        System.out.println("===== Task 1.3 =====");
        Task_1_3 task3 = new Task_1_3();
        System.out.println(task3.pow(3, 4));

        System.out.println("===== Task 1.4 =====");
        Task_1_4 task4 = new Task_1_4();
        System.out.println("1) Fibonacci numbers: ");
        task4.printFiboNumbers(10);
        System.out.println("2) Factorial: ");
        System.out.println(task4.factorial(5));
        System.out.println("3) Taylor series: ");
        System.out.println("Sum = " + task4.taylorSeries(3, 3));

        System.out.println("===== Task 1.6 =====");
        Task_1_6 task6 = new Task_1_6(5);
        task6.printMatrix();
        System.out.println("Max value = " + task6.maxValue());
        System.out.println("Min value = " + task6.minValue());

        System.out.println("===== Task 1.7 =====");
        Task_1_7 task7 = new Task_1_7("Volkswagen", "Golf", 2016);
        Task_1_7 cloneTask7 = task7;
        System.out.println("1) Shallow copy:");
        System.out.println(task7);
        System.out.println(cloneTask7);
        cloneTask7 = (Task_1_7) task7.clone();
        System.out.println("1) Deep copy:");
        System.out.println(task7);
        System.out.println(cloneTask7);
    }
}
