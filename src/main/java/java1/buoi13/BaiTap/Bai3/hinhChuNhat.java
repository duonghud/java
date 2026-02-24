package java1.buoi13.BaiTap.Bai3;

public class hinhChuNhat implements hinhHoc {
    private double chieuDai;
    private double chieuRong;

    public hinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }
}
