package HomeWork.hw7.factory;

import HomeWork.hw7.dao.FileHumanDao;
import HomeWork.hw7.dao.HumanDao;
import HomeWork.hw7.dao.InMemoryHumanDao;
import HomeWork.hw7.service.PropertyLoader;

import java.io.IOException;

public class HumanDaoFactory {
    private static final HumanDao fileDao = new FileHumanDao();
    private static final HumanDao inMemoryDao = new InMemoryHumanDao();

    public static HumanDao getHumanDao(boolean isFileDao, boolean isInMemoryDao){
        try {
            String dbName = PropertyLoader.getProperty("db.name");
            if (dbName.equals("memory") && isInMemoryDao) {
                return inMemoryDao;
            }
        } catch (IOException e) {
            System.out.println("No access to file");
        }
        if (isFileDao) {
            return fileDao;
        } else {
            throw new ComponentNotFoundException();
        }
    }
}