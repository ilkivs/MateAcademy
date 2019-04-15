package HomeWork.hw8.Mail;

public interface Sendable<T> {

    String getFrom();

    String getTo();

    T getContent();
}
