package java1.buoi15.baitap;

public class NhanVien {
    //maNV, hoTen, luongCoBan, heSoLuong
    private String maNV;
    private String hoTen;
    private double luongCoBan;
    private double heSoLuong;

    public NhanVien(String maNV, String hoTen, double luongCoBan, double heSoLuong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        if(luongCoBan > 0) {
            this.luongCoBan = luongCoBan;
        }
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        if(heSoLuong > 0) {
            this.heSoLuong = heSoLuong;
        }
    }

    public String thongTinNhanVien() {
        String str = "MaNV: " + maNV;
        str += " | Họ Tên: " + hoTen;
        str += " | Lương cơ bản: " + luongCoBan;
        str += " | Hệ số lương: " + heSoLuong;
        return str;
    }
}
