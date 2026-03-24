package DIP.Bai1;

public class SMS implements NotificationService {

    @Override
    public void send(String message, String recipient) {
        System.out.println("Tin nhắn đuọc gửi từ SMS: " + recipient);
        System.out.println("Message: " + message);
    }
}