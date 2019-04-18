package main.java.HomeWork.hw9.Mail;

public interface Sendable<T> {

    String getFrom();

    String getTo();

    T getContent();
}
