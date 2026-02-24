package java1.buoi6.huongDoiTuong.baitap.bai6;

public class NhanVien {
    public String maSo;
    public String hoTen;
    public int luongCoBan;
    public int soNgayLamViec;

    public NhanVien(String maSo, String hoTen, int luongCoBan, int soNgayLamViec){
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.soNgayLamViec = soNgayLamViec;
    }

    public int tinhTongLuong(){
        return luongCoBan * soNgayLamViec;
    }

    public boolean laNVXuatsac(){
        return soNgayLamViec > 25;
    }
    public void inThongTin(){
        System.out.println("Ma so: " + maSo);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Luong co ban: " + luongCoBan);
        System.out.println("So ngay lam viec: " + soNgayLamViec);
        if(laNVXuatsac()){
            System.out.println("Nhan vien xuat sac");
        }
        System.out.println("----------------------------");
    }
}
