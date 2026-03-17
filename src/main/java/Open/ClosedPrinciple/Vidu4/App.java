package Open.ClosedPrinciple.Vidu4;

import java.util.List;

public class App {
    public static void main(String[] args) {

        // 1. Gửi email
        NotificationSender emailSender = new EmailSender();
        NotificationService emailService = new NotificationService(emailSender);
        emailService.notify("Hello Email", "user@example.com");

        System.out.println("------");

        // 2. Gửi SMS
        NotificationSender smsSender = new SmsSender();
        NotificationService smsService = new NotificationService(smsSender);
        smsService.notify("Hello SMS", "0123456789");

        System.out.println("------");

        // 3. Gửi Push Notification
        NotificationSender pushSender = new PushSender();
        NotificationService pushService = new NotificationService(pushSender);
        pushService.notify("Hello Push", "device_token_123");

    }
}
