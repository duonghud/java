package java1.buoi6.huongDoiTuong.baitap.bai4;

import  java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sach:");
        int n = sc.nextInt();
        sc.nextLine();
        Sach[] dsSach = new Sach[n];
        for(int i = 0; i < n; i++){
            System.out.println("Moi nhap thong tin sach "+ (i + 1) + ":");
            System.out.println("Tieu de: ");
            String tieuDe = sc.next();
            System.out.println("Tac gia: ");
            String tacGia = sc.next();
            System.out.println("Nam Xuat Ban: ");
            int namXuatBan = sc.nextInt();
            System.out.println("Gia ban: ");
            double giaBan = sc.nextDouble();
            dsSach[i] = new Sach(tieuDe, tacGia, namXuatBan, giaBan);
        }
        System.out.println("Danh sach sach");
        for(int i = 0; i < n; i++){
            System.out.println("Sach thu 1 " + (i+1) + ":");
            dsSach[i].hienThiChiTiet();
        }
    }
}
