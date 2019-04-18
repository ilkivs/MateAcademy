package HomeWork.hw6;

import java.io.*;
import java.util.Objects;
import java.util.Random;

public class Animal implements Serializable {
    private final String name;
    public static byte[] bytes;
    private final static String FILENAME = "animals.txt";
    private final static int RANDOM_BOUND = 10;

    public Animal(String name) {
        this.name = name;
    }

    public static byte[] fileContentToByteArray() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILENAME))) {
            bytes = in.readAllBytes();
            in.close();
            return bytes;
        } catch (Exception ex) {
            throw new IllegalArgumentException("Illegal argument exception !!!");
        }
    }

    public static void serializeAnimalArray() {
        int size = new Random().nextInt(RANDOM_BOUND);
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILENAME));
            out.writeInt(size);
            for (int i = 0; i < size; i++) {
                Animal animal = new Animal("Dog" + i);
                out.writeObject(animal);
            }
            out.close();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Illegal argument exception !!!");
        }
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int size = in.readInt();
            Animal[] animals = new Animal[size];
            for (int i = 0; i < animals.length; i++) {
                animals[i] = (Animal) in.readObject();
            }
            in.close();
            return animals;
        } catch (Exception ex) {
            throw new IllegalArgumentException("Illegal argument exception !!!");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
