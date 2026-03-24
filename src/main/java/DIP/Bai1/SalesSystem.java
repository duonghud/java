package DIP.Bai1;

public class SalesSystem {
    public static void main(String[] args) {
        NotificationService smsSer = new SMS();
        NotificationService emailSer = new Email();

        smsSer.send("Chúc mừng bạn đã chúng thưởng 1 chiếc Ip 20 promax", "0123456789");
        System.out.println("-------------------");
        emailSer.send("Chào mừng bạn đã trở thành hội viên của ....", "lovuong@gmail.com");
    }
}
