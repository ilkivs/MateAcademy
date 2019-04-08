package HomeWork.hw7.di;

import HomeWork.hw7.dao.*;
import HomeWork.hw7.factory.ClientDaoFactory;
import HomeWork.hw7.factory.HumanDaoFactory;
import HomeWork.hw7.handler.ConsoleHandler;
import HomeWork.hw7.model.Human;

import java.lang.reflect.Field;

public class Injector {

    public static void injectDependency() throws IllegalAccessException {
        Class consoleHandlerClass = ConsoleHandler.class;
        Class fileClientDaoClass = FileClientDao.class;
        Class inMemoryClientDaoClass = InMemoryClientDao.class;
        Class fileHumanDaoClass = FileHumanDao.class;
        Class inMemoryHumanDaoClass = InMemoryHumanDao.class;

        Field[] fields = consoleHandlerClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                boolean clientFileDao = fileClientDaoClass.isAnnotationPresent(Component.class);
                if (clientFileDao) {
                    System.out.println("Work with files allowed (Client)");
                }
                boolean clientInMemoryDao = inMemoryClientDaoClass.isAnnotationPresent(Component.class);
                if (clientInMemoryDao) {
                    System.out.println("Work with RAM allowed (Client)");
                }
                boolean humanFileDao = fileHumanDaoClass.isAnnotationPresent(Component.class);
                if (humanFileDao) {
                    System.out.println("Work with files allowed (Human)");
                }
                boolean humanInMemoryDao = inMemoryHumanDaoClass.isAnnotationPresent(Component.class);
                if (humanInMemoryDao) {
                    System.out.println("Work with RAM allowed (Human)");
                }
                ClientDao clientDao = ClientDaoFactory.getClientDao(clientFileDao, clientInMemoryDao);
                field.set(null, clientDao);
                HumanDao humanDao = HumanDaoFactory.getHumanDao(humanFileDao, humanInMemoryDao);
                field.set(null, humanDao);
            }
        }
    }
}