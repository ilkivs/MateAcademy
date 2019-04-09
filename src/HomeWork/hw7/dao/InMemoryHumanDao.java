package HomeWork.hw7.dao;

import HomeWork.hw7.model.Human;

import java.util.ArrayList;
import java.util.List;

public class InMemoryHumanDao implements HumanDao {

    private static final List<Human> inMemoryStorage = new ArrayList<>();

    @Override
    public void save(Human human) {
        inMemoryStorage.add(human);
    }

    @Override
    public Human get() {
        return inMemoryStorage.get(0);
    }
}
