package java1.buoi13.BaiTap.Bai1;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<NhanVien> ds = new ArrayList<>();

        ds.add(new NVFullTime("Nguyen Van A", 2000000));
        ds.add(new NVPartTime("Tran Thi B", 18));
        ds.add(new NVPartTime("Le Van C", 36));

        double tong = 0;

        for (NhanVien nv : ds) {
            double luong = nv.tinhLuong();
            System.out.println("Nhân viên: " + nv.getHoTen() + " - Lương: " + luong);
            tong += luong;
        }
        System.out.println("Tổng lương toàn bộ nhân viên: " + tong);
    }
}
