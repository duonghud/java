package java1.buoi11.BaiTap.Bai1;

public class Main {
    public static void main(String[] args) {
        User u = new User("Khanh", 20);
        System.out.println("===Thong tin ban dau===");
        u.Getter();

        u.setTen("Khanh anh");
        u.setTuoi(21);
        u.Getter();

        u.setTen("");
        u.setTuoi(20);
        u.Getter();
    }
}
