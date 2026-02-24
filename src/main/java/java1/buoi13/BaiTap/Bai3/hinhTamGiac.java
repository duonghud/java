package java1.buoi13.BaiTap.Bai3;

public class hinhTamGiac implements hinhHoc {
    private double canh1, canh2, canh3;
    private double canhDay;
    private double chieuCao;

    public hinhTamGiac(double canh1, double canh2, double canh3, double canhDay, double chieuCao) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
        this.canhDay = canhDay;
        this.chieuCao = chieuCao;
    }

    @Override
    public double tinhDienTich() {
        return 0.5 * canhDay * chieuCao;
    }

    @Override
    public double tinhChuVi() {
        return canh1 + canh2 + canh3;
    }
}

