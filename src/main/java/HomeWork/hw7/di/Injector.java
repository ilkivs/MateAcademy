package main.java.HomeWork.hw7.di;

import main.java.HomeWork.hw7.dao.*;
import main.java.HomeWork.hw7.factory.ClientDaoFactory;
import main.java.HomeWork.hw7.factory.HumanDaoFactory;
import main.java.HomeWork.hw7.handler.ConsoleHandler;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Injector {

    private static final List<Class> classList = new ArrayList<>();

    public static void injectDependency() throws IllegalAccessException {

        initClassList();

        Field[] fields = classList.get(0).getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                boolean fileDao = false, inMemoryDao = false;
                for (Class clazz : classList) {
                    if (clazz.getSimpleName().equals("File" + field.getType().getSimpleName())) {
                        fileDao = classList.get(classList.indexOf(clazz)).isAnnotationPresent(Component.class);
                    }
                    if (clazz.getSimpleName().equals("InMemory" + field.getType().getSimpleName())) {
                        inMemoryDao = classList.get(classList.indexOf(clazz)).isAnnotationPresent(Component.class);
                    }
                }
                if (fileDao) {
                    System.out.println("Work with files allowed (" + field.getType().getSimpleName() + ")");
                }
                if (inMemoryDao) {
                    System.out.println("Work with RAM allowed (" + field.getType().getSimpleName() + ")");
                }
                switch (field.getType().getSimpleName()) {
                    case "ClientDao":
                        ClientDao clientDao = ClientDaoFactory.getClientDao(fileDao, inMemoryDao);
                        field.set(null, clientDao);
                        break;
                    case "HumanDao":
                        HumanDao humanDao = HumanDaoFactory.getHumanDao(fileDao, inMemoryDao);
                        field.set(null, humanDao);
                        break;
                }
            }
        }
    }

    private static void initClassList() {
        classList.add(ConsoleHandler.class);
        classList.add(FileClientDao.class);
        classList.add(InMemoryClientDao.class);
        classList.add(FileHumanDao.class);
        classList.add(InMemoryHumanDao.class);
    }
}