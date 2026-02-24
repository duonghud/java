package java1.buoi13.BaiTap.Bai1;

public class NVPartTime extends NhanVien {
    private int soGioLam;
    private static final double luongGio = 50000;
    public NVPartTime(String hoTen, int soGioLam) {
        super(hoTen,0);
    }
    @Override
    public double tinhLuong(){
        return soGioLam * luongGio;
    }
}
