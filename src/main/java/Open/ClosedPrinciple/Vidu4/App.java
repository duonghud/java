package Open.ClosedPrinciple.Vidu4;

import java.util.List;

public class App {
    public static void main(String[] args) {

        /// 1. Gửi email
        NotificationSender emailSender = new EmailSender();
        NotificationService emailService = new NotificationService(emailSender);
        emailService.notify("Chào mừng bạn đã trúng tuyển vào công ty chung tôi ở vị trí senior. Bạn sẽ bắt đầu đi làm vào ngày mai chúc bạn may mắn", "sepCTCP@KTH.com");

        System.out.println("------");

        /// 2. Gửi SMS
        NotificationSender smsSender = new SmsSender();
        NotificationService smsService = new NotificationService(smsSender);
        smsService.notify("Bạn đã chúng một chiếc iphone 16Promax chuyển cho chúng tôi 5.000.000 để nhận thưởng", "0287692544");

        System.out.println("------");

        /// 3. Gửi Push Notification
        NotificationSender pushSender = new PushSender();
        NotificationService pushService = new NotificationService(pushSender);
        pushService.notify("Lỗi hệ thống máy chủ", "device tại Hà Nội");

    }
}
