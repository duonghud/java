package java1.buoi15.baitap2;

public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private double gia;
    private int soLuong;
    public Sach(String maSach, String tenSach, String tacGia, double gia, int soLuong){
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public int capNhapSoLuong(int soLuongMoi){
        return this.soLuong = soLuongMoi;
    }

    public double tinhThanhTien(int soLuongMua){
        return soLuongMua * gia;
    }

    public String hienThiThongTin(){
        String str = "MaSach " + maSach;
        str += "TenSach" + tenSach;
        str += "TacGia" + tacGia;
        str += "Gia" + gia;
        str += "So Luong" + soLuong;
        return str;
    }
}
