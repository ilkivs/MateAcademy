package HomeWork.hw8.Mail;

public class Salary implements Sendable<Integer> {

    private String from;
    private String to;
    private int content;

    public Salary(String from, String to, int content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Integer getContent() {
        return content;
    }
}
