package main.java.HomeWork.hw7.dao;

import main.java.HomeWork.hw7.model.Client;

public interface ClientDao extends Dao {
    void save(Client client);

    Client get();
}
