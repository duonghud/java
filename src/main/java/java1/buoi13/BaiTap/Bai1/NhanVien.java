package java1.buoi13.BaiTap.Bai1;

public abstract class NhanVien {
    private String hoTen;
    private double luongCoBan;

    public NhanVien(String hoTen, double luongCoBan){
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }

    public String getHoTen(){
        return this.hoTen;
    }
    public double getLuongCoBan(){
        return this.luongCoBan;
    }
    public abstract double tinhLuong();
}
