package java1.buoi11.BaiTap.Bai2;

public class Product {
    private String tenSP;
    private double gia;
    private int soLuongTonKho;

    public Product(String tenSP, double gia, int soLuongTonKho){
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuongTonKho = soLuongTonKho;
    }

    public String getTenSP() {
        return this.tenSP;
    }

    public double getGia() {
        return this.gia;
    }

    public int getSoLuongTonKho() {
        return this.soLuongTonKho;
    }

    public void setGia(double giaMoi) {
        if(giaMoi > 0){
            this.gia = giaMoi;
        }
    }

    public void setSoLuongTonKho(int soLuongMoi) {
        if(soLuongMoi > 0){
            this.soLuongTonKho = soLuongMoi;
        }
    }

    public void banHang(int soLuongBan){
        if(soLuongBan <= soLuongTonKho){
            this.soLuongTonKho = this.soLuongTonKho - soLuongBan;
        }else {
            System.out.println("San pham trong kho khong du so luong");
        }
    }

    public void nhapKho(int soLuongNhap){
        if(soLuongNhap > 0){
            this.soLuongTonKho = soLuongNhap;
        }else {
            System.out.printf("So luong nhap vao khong hop le");
        }
    }

}
