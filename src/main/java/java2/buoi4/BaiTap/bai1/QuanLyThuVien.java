package java2.buoi4.BaiTap.bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyThuVien {
    List<Sach> dsSach;
    List<DocGia> dsDocGia;
    public static Scanner sc = new Scanner(System.in);
    public QuanLyThuVien(){
        dsSach = new ArrayList<>();
        dsDocGia = new ArrayList<>();
    }

    public void themSach(){
        String MaSach;
        while (true){
            System.out.println("MaSach: ");
            MaSach = sc.nextLine().trim();
            if (!MaSach.startsWith("B")){
                System.out.println("Ma sach phai bat dau tu 'b'. Vui long nhap lai");
                continue;
            }
            String phanSo = MaSach.substring(3);
            if (phanSo.isEmpty() || !phanSo.matches("\\d+")){
                System.out.println("");
                continue;
            }
            break;
        }
    }

    public void themDocGia(){
        String MaDocGia;
        while (true){
            System.out.println("MaDocGia: ");
            MaDocGia = sc.nextLine().trim();
            if (!MaDocGia.startsWith("R")){
                System.out.println("Ma sach phai bat dau tu 'b'. Vui long nhap lai");
                continue;
            }
            String phanSo = MaDocGia.substring(3);
            if (phanSo.isEmpty() || !phanSo.matches("\\d+")){
                System.out.println("");
                continue;
            }
            break;
        }
    }

    public void hienThiDanhSachSach(){

    }

    public void hienThiDanhSachDocGia(){

    }
}
