package java2.buoi4.BaiTap.bai1;

public class Sach {
    private String TenSach;
    private String MaSach;
    private String TacGia;
    private String TheLoai;
    private int NamXuatBan;

    public Sach(String maSach, String tenSach, String tacGia, String theLoai, int namXuatBan) {
        this.MaSach = maSach;
        this.TenSach = tenSach;
        TacGia = tacGia;
        TheLoai = theLoai;
        NamXuatBan = namXuatBan;
    }

    public String MaSach() {
        return MaSach;
    }

    public void setMaSach(String maSach){
        this.MaSach = maSach;
    }

    public int NamXuatBan() {
        return NamXuatBan;
    }

    public void setNamXuatBan(int namXuatBan){
        this.NamXuatBan = namXuatBan;
    }

    public String TheLoai() {
        return TheLoai;
    }

    public void setTheLoai(String theLoai){
        this.TheLoai = theLoai;
    }

    public String TacGia() {
        return TacGia;
    }

    public void setTacGia(String tacGia){
        this.TacGia = tacGia;
    }

    public String TenSach() {
        return TenSach;
    }

    public void setTenSach(String tenSach){
        this.TenSach = tenSach;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "TenSach='" + TenSach + '\'' +
                ", MaSach=" + MaSach +
                ", TacGia='" + TacGia + '\'' +
                ", TheLoai='" + TheLoai + '\'' +
                ", NamXuatBan=" + NamXuatBan +
                '}';
    }
}
