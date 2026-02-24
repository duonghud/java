package java1.buoi13.BaiTap.Bai2;

public abstract class TaiKhoan {
    protected String soTaiKhoan;
    protected double soDu;

    public TaiKhoan(String soTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.soDu = soDu;
    }

    public abstract void guiTien(double soTien);

    public abstract void rutTien(double soTien);

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }
    public interface ITaiKhoanCoKyHan {
        void tatToanSoKy(int soThang);
    }

}
