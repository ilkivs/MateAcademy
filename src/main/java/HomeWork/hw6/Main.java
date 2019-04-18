package main.java.HomeWork.hw6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== Task 2 =====");

        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        System.out.println("Integer i = " + i);
        System.out.println("String s = " + s);

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println("Boolean mustBeTrue = " + mustBeTrue);
        System.out.println("Boolean mustAlsoBeTrue = " + mustAlsoBeTrue);

        System.out.println("===== Task 3 =====");

        Animal a1 = new Animal("aaa1");
        Animal a2 = new Animal("aaa2");
        Animal a3 = new Animal("aaa3");
        Animal a4 = new Animal("aaa4");
        Animal a5 = new Animal("aaa5");
        Animal a6 = new Animal("aaa6");
        Set<Animal> set1 = new HashSet<>();
        Set<Animal> set2 = new HashSet<>();

        set1.add(a1);
        set1.add(a3);
        set1.add(a4);
        set1.add(a6);

        set2.add(a2);
        set2.add(a4);
        set2.add(a5);
        set2.add(a6);

        System.out.println(SetActions.symmetricDifference(set1, set2));

        System.out.println("===== Task 1 =====");

        Animal.serializeAnimalArray();
        System.out.println("Serialized");
        Animal[] animals = Animal.deserializeAnimalArray(Animal.fileContentToByteArray());
        System.out.println("Deserialized");
        System.out.println(Arrays.toString(animals));
    }
}
