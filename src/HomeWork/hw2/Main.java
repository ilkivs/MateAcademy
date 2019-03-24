package HomeWork.hw2;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("===== Task 2.1 =====");
        Pizza pepperoni = new Pizza.Builder()
                .setName("Pepperoni")
                .withPepper(true)
                .withDoubleCheese(true)
                .withCorn(false)
                .withSausage(true)
                .setSize(45)
                .setPrice(75)
                .build();
        System.out.println(pepperoni);

        System.out.println("===== Task 2.2 =====");
        //тест анонімного класу
        Task_2_2.parent.print();
        //тест вложеного класу
        Task_2_2.Nested nested = new Task_2_2().new Nested();
        nested.print();
        //тест внутрішнього статичного класу
        Task_2_2.StaticNested staticNested = new Task_2_2.StaticNested();
        staticNested.print();
        //тест локального класу
        Task_2_2 Task_2_2 = new Task_2_2();
        Task_2_2.printLocal();

        System.out.println("===== Task 2.3 =====");
        System.out.println("1) Bubble sort");
        int[] arr = SortUtils.initArray(5);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(SortUtils.bubbleSort(arr)));
        System.out.println("2) Merge sort");

        System.out.println("===== Task 2.4 =====");
        Footballer task4 = new Footballer("C. Ronaldo", "Juventus", 100);
        System.out.println(task4);
    }
}
