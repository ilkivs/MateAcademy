package HomeWork.hw7.handler;

import HomeWork.hw7.dao.ClientDao;
import HomeWork.hw7.dao.HumanDao;
import HomeWork.hw7.di.Inject;
import HomeWork.hw7.model.Client;
import HomeWork.hw7.model.Human;

import java.util.Scanner;

public class ConsoleHandler {

    @Inject
    private static ClientDao clientDao;
    @Inject
    private static HumanDao humanDao;

    public static void handle() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What model do you want to use? 1 - Client, 2 - Human, 0 - exit");
            int consoleChoice = scanner.nextInt();
            switch (consoleChoice) {
                case 1:
                    addClientInfo(scanner);
                    break;
                case 2:
                    addHumanInfo(scanner);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong data");
                    break;
            }
        }
    }

    private static void addHumanInfo(Scanner scanner) {
        System.out.println("1 - add a human, 2 - get a human");
        int consoleChoice = scanner.nextInt();
        switch (consoleChoice) {
            case 1:
                System.out.println("Enter information about human");
                System.out.println("Enter human name");
                String name = scanner.next();
                System.out.println("Enter human age");
                int age = scanner.nextInt();
                Human human = new Human(name, age);
                humanDao.save(human);
                break;
            case 2:
                System.out.println(humanDao.get());
                break;
        }
    }

    private static void addClientInfo(Scanner scanner) {
        System.out.println("1 - add a client, 2 - get a client");
        int consoleChoice = scanner.nextInt();
        switch (consoleChoice) {
            case 1:
                System.out.println("Enter information about client");
                System.out.println("Enter client name");
                String name = scanner.next();
                System.out.println("Enter client phone number");
                String phone = scanner.next();
                Client client = new Client(name, phone);
                clientDao.save(client);
                break;
            case 2:
                System.out.println(clientDao.get());
                break;
        }
    }
}
