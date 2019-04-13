package HomeWork.hw8.Mail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {

    private Map<String, List<T>> mailBox;

    public MailService() {
        mailBox = new HashMap<>() {
            @Override
            public List<T> get(Object key) {
                return super.get(key) == null ? new ArrayList<>() : super.get(key);
            }
        };
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(Sendable<T> sendable) {
        List<T> list = mailBox.get(sendable.getTo());
        list.add(sendable.getContent());
        mailBox.put(sendable.getTo(), list);
    }
}
