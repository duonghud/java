package java1.buoi13.BaiTap.Bai3;

public class hinhTron implements hinhHoc {
    private double banKinh;
    private final double PI = 3.14;

    public hinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhDienTich() {
        return PI * banKinh * banKinh;
    }

    @Override
    public double tinhChuVi() {
        return 2 * PI * banKinh;
    }
}
