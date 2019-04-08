package HomeWork.hw7.dao;

import HomeWork.hw7.model.Client;

public interface ClientDao {
    void save(Client client);
    Client get();
}
