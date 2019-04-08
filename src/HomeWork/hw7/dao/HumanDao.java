package HomeWork.hw7.dao;

import HomeWork.hw7.model.Human;

public interface HumanDao {
    void save(Human client);
    Human get();
}
