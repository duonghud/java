package Open.ClosedPrinciple.Vidu4;

public class PushSender implements NotificationSender {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending PUSH to " + recipient + ": " + message);
    }
}
