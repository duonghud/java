package java1.buoi6.huongDoiTuong.baitap.bai1;

public class HinhChuNhat {
    public double chieuDai;
    public double chieuRong;

    public HinhChuNhat() {
        System.out.println("Hinh Chu Nhat");
    }

    public HinhChuNhat(double chieuDai, double chieuRong){
        this.chieuRong = chieuRong;
        this.chieuDai = chieuDai;
    }

    public double tinhChuVi(){
        double chuVi = (this.chieuDai+this.chieuRong)*2;
        return chuVi;
    }

    public double tinhDienTich(){
        double dienTich = this.chieuDai * this.chieuRong;
        return dienTich;
    }

    public String display(){
        return "HinhChuNhat{"+
                "chieuDai:" + chieuDai +
                ", chieuRong: \n" + chieuRong +
                ", Chu Vi:" + this.tinhChuVi() +
                ", Dien tich:" + this.tinhDienTich() +
                "}";
    }



    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat( 5, 6);
        hcn1.chieuDai = 8;
        hcn1.chieuRong = 4;
        HinhChuNhat hcn2 = new HinhChuNhat(7,8);
        System.out.println(hcn1.display());
        System.out.println(hcn2.display());
    }
}

