package java1.buoi6.huongDoiTuong.baitap.bai4;

public class Sach {
    public String tieuDe;
    public String tacGia;
    public int namXuatBan;
    public double giaBan;


    public Sach(){
        this.tieuDe = "Chua co tieu de";
        this.tacGia = "Chua ro";
        this.namXuatBan = 0;
        this.giaBan = 0.0;
    }

    public Sach(String tieuDe, String tacGia, int namXuatBan, double giaBan){
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.giaBan = giaBan;
    }


    public  boolean kiemTraSach(){
        return namXuatBan >2020;
    }

    public void hienThiChiTiet(){
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Gia ban: " + giaBan + "VND");
        if(kiemTraSach()){
            System.out.println("Day la sach moi ( xuat ban sau nam 2020 ");
        } else {
            System.out.println("Sach xuat ban truoc nam 2020");
        }
        System.out.println("---------------------");
    }
}
