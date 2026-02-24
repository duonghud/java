package java1.buoi11.BaiTap.Bai3;

public class Main {
    public static void main(String[] args) {
        ThongTinKhachHang t = new ThongTinKhachHang("01", "SKibidi@gmail.com");
        System.out.println("===Thong khach hang===");
        System.out.println(t.getMaKhachHang());
        System.out.println(t.getEmail());
    }
}
