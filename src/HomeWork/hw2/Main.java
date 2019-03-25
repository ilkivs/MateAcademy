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
        //Anonymous class test
        TestClass.parent.print();
        //Nested class test
        TestClass.Nested nested = new TestClass().new Nested();
        nested.print();
        //Static Nested class test
        TestClass.StaticNested staticNested = new TestClass.StaticNested();
        staticNested.print();
        //Local class test
        TestClass TestClass = new TestClass();
        TestClass.printLocal();

        System.out.println("===== Task 2.3 =====");
        System.out.println("1) Bubble sort");
        int[] arr1 = SortUtils.initArray(5);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(SortUtils.bubbleSort(arr1)));
        System.out.println("2) Merge sort");
        int[] arr2 = SortUtils.initArray(5);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString((SortUtils.mergeSort(arr2, 0, arr2.length))));

        System.out.println("===== Task 2.4 =====");
        Footballer task4 = new Footballer("C. Ronaldo", "Juventus", 100);
        System.out.println(task4);
    }
}
