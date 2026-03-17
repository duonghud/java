package Open.ClosedPrinciple.Vidu4;

public class SmsSender implements NotificationSender {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}
