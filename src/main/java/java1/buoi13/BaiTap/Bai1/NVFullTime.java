package java1.buoi13.BaiTap.Bai1;

public class NVFullTime extends NhanVien {
    private double luongCoDinh;
    public NVFullTime(String hoTen, double luongCoDinh){
        super(hoTen, luongCoDinh);
    }
    @Override
    public double tinhLuong(){
        return luongCoDinh;
    }
}
