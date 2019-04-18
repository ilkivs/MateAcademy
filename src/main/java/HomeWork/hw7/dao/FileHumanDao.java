package HomeWork.hw7.dao;

import HomeWork.hw7.di.Component;
import HomeWork.hw7.model.Human;

import java.io.*;

@Component
public class FileHumanDao implements HumanDao {

    @Override
    public void save(Human human) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("storage.dat"))) {
            objectOutputStream.writeObject(human);
        } catch (IOException e) {
            System.out.println("Cannot write human to database");
        }
    }

    @Override
    public Human get() {
        try (ObjectInputStream inputObjectStream = new ObjectInputStream(new FileInputStream("storage.dat"))) {
            return (Human) inputObjectStream.readObject();
        } catch (Exception e) {
            System.out.println("Human not found");
            return null;
        }
    }
}
