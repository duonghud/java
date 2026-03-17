package Open.ClosedPrinciple.Vidu4;

public class NotificationService {
    private NotificationSender sender;

    public NotificationService(NotificationSender sender) {
        this.sender = sender;
    }

    public NotificationSender getSender(){
        return sender;
    }

    public void notify(String message, String recipient) {
        sender.send(message, recipient);
    }
}
