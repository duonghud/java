package Open.ClosedPrinciple.Vidu4;

public class EmailSender implements NotificationSender {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending EMAIL to " + recipient + ": " + message);
    }
}
