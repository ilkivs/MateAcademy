package main.java.HomeWork.hw7;

import HomeWork.hw7.di.Injector;
import HomeWork.hw7.handler.ConsoleHandler;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Injector.injectDependency();
        ConsoleHandler.handle();
    }
}
