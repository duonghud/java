package DIP.Bai1;

public class Email implements NotificationService{
    @Override
    public void send(String message, String recipient) {
        System.out.println("Tin nhắn đuọc gửi từ EMAIL: " + recipient);
        System.out.println("Message: " + message);
    }
}
