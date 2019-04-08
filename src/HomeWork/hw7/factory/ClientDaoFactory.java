package HomeWork.hw7.factory;

import HomeWork.hw7.dao.ClientDao;
import HomeWork.hw7.dao.FileClientDao;
import HomeWork.hw7.dao.InMemoryClientDao;
import HomeWork.hw7.service.PropertyLoader;

import java.io.IOException;

public class ClientDaoFactory {

    private static final ClientDao fileDao = new FileClientDao();
    private static final ClientDao inMemoryDao = new InMemoryClientDao();

    public static ClientDao getClientDao(boolean isFileDao, boolean isInMemoryDao){
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
