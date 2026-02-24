package java1.buoi6.huongDoiTuong.baitap.bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        int n = sc.nextInt();
        sc.nextLine(); // đọc bỏ ký tự xuống dòng

        NhanVien[] dsNV = new NhanVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n---Nhap thong tin nhan vien thu " + (i + 1) + " ---");
            System.out.print("Ma nhan vien: ");
            String ma = sc.nextLine();
            System.out.print("Ho ten: ");
            String ten = sc.nextLine();
            System.out.print("Luong co ban: ");
            int luongCoBan = sc.nextInt();
            System.out.print("So ngay lam viec: ");
            int soNgay = sc.nextInt();
            sc.nextLine(); // đọc bỏ ký tự xuống dòng

            dsNV[i] = new NhanVien(ma, ten, luongCoBan, soNgay);
        }

        System.out.println("\n-----DANH SACH NHAN VIEN-----");
        for (NhanVien nv : dsNV) {
            nv.inThongTin();
        }

        System.out.println("\n------DANH SACH NHAN VIEN XUAT SAC-------");
        for (NhanVien nv : dsNV) {
            if (nv.laNVXuatsac()) {
                nv.inThongTin();
            }
        }

        sc.close();
    }
}
