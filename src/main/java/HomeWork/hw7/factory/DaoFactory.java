package HomeWork.hw7.factory;

import HomeWork.hw7.dao.Dao;
import HomeWork.hw7.service.PropertyLoader;

import java.io.IOException;

public class DaoFactory {

    public static Dao chooseDao(boolean isFileDao, boolean isInMemoryDao, Dao fileDao, Dao inMemoryDao) {
        try {
            String dbName = PropertyLoader.getProperty("db.name");
            if (dbName.equals("memory") && isInMemoryDao) {
                return inMemoryDao;
            }
        } catch (IOException e) {
            System.out.println("No access to file. " + e.toString());
        }
        if (isFileDao) {
            return fileDao;
        } else {
            throw new ComponentNotFoundException();
        }
    }
}
