package main.java.HomeWork.hw7.factory;

import main.java.HomeWork.hw7.dao.ClientDao;
import main.java.HomeWork.hw7.dao.FileClientDao;
import main.java.HomeWork.hw7.dao.InMemoryClientDao;

public class ClientDaoFactory {

    private static final ClientDao fileDao = new FileClientDao();
    private static final ClientDao inMemoryDao = new InMemoryClientDao();

    public static ClientDao getClientDao(boolean isFileDao, boolean isInMemoryDao) {
        return (ClientDao) DaoFactory.chooseDao(isFileDao, isInMemoryDao, fileDao, inMemoryDao);
    }
}
