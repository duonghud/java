package java1.buoi15.baitap2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
    private List<Sach> dsSach;
    public QuanLySach(){
        dsSach = new ArrayList<>();
    }

    public Sach nhapThongTinSach(Scanner sc) {
        System.out.print("Nhập mã sach: ");
        String maSach = sc.nextLine();
        System.out.print("Nhập tên sach: ");
        String tenSach = sc.nextLine();
        System.out.print("Nhập lương tac gia: ");
        String tg = sc.nextLine();
        System.out.print("Nhập hệ số gia: ");
        double gia = sc.nextDouble();
        System.out.println("Nhap so luong");
        int soLuong = sc.nextInt();
        sc.nextLine();
        return new Sach(maSach, tenSach, tg, gia, soLuong);
    }

    public Sach timKiemSachTheoMa(String maSach){
        for (Sach s : dsSach){
            if (s.getMaSach().equalsIgnoreCase(maSach)){
                return s;
            }
        }
        return null;
    }
}
