package main.java.HomeWork.hw7.factory;

import main.java.HomeWork.hw7.dao.FileHumanDao;
import main.java.HomeWork.hw7.dao.HumanDao;
import main.java.HomeWork.hw7.dao.InMemoryHumanDao;

public class HumanDaoFactory {
    private static final HumanDao fileDao = new FileHumanDao();
    private static final HumanDao inMemoryDao = new InMemoryHumanDao();

    public static HumanDao getHumanDao(boolean isFileDao, boolean isInMemoryDao) {
        return (HumanDao) DaoFactory.chooseDao(isFileDao, isInMemoryDao, fileDao, inMemoryDao);
    }
}