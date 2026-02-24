package java1.buoi6.huongDoiTuong.baitap.bai2;

public class SinhVien {
    public String maSV;
    public String tenSV;
    public double diemTB;

    public SinhVien ( String maSV, String tenSV, double diemTB){
        this.maSV = maSV;
        this.diemTB = diemTB;
        this.tenSV = tenSV;
    }

    public String xepLoai() {
        if(diemTB >= 8.0){
            return "gioi";
        } else if (diemTB >= 6.5) {
            return  "Kha";
        } else if (diemTB >= 5.0) {
            return "TrungBinh";
        } else {
            return "Yeu";
        }
    }


    public void hienThiThongTin(){
        System.out.println("Thong tin: "+"MaSV:" + this.maSV +
                ", TenSV:" + this.tenSV +
                ", DiemTB:" + this.diemTB +
                ", Xep loai:" + this.xepLoai());

    }
    public static void main(String[] args) {
        SinhVien[] danhSachSV = new SinhVien[4];
        danhSachSV[0] = new SinhVien("Bkc1620", "SKibiDi", 6.8);
        danhSachSV[1] = new SinhVien("4687", "SKibiDi", 8.0);
        danhSachSV[2] = new SinhVien("Bkc1620", "Lo Van So", 8.2);
        for (int i = 0;  i < 4;  i++){
            danhSachSV[i].hienThiThongTin();
        }
    }
}
