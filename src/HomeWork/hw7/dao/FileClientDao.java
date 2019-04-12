package HomeWork.hw7.dao;

import HomeWork.hw7.di.Component;
import HomeWork.hw7.model.Client;

import java.io.*;

@Component
public class FileClientDao implements ClientDao {

    @Override
    public void save(Client client) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("storage.dat"))) {
            objectOutputStream.writeObject(client);
        } catch (IOException e) {
            System.out.println("Cannot write client to database");
        }
    }

    @Override
    public Client get() {
        try (ObjectInputStream inputObjectStream = new ObjectInputStream(new FileInputStream("storage.dat"))) {
            return (Client) inputObjectStream.readObject();
        } catch (Exception e) {
            System.out.println("Client not found");
            return null;
        }
    }
}
