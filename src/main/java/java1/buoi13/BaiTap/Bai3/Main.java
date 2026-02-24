package java1.buoi13.BaiTap.Bai3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<hinhHoc> danhSach = new ArrayList<>();

        danhSach.add(new hinhTron(5));
        danhSach.add(new hinhChuNhat(4, 6));
        danhSach.add(new hinhTamGiac(3, 4, 5, 3, 4));

        for (hinhHoc h : danhSach) {
            System.out.println("Diện tích: " + h.tinhDienTich());
            System.out.println("Chu vi: " + h.tinhChuVi());
            System.out.println("-----------------------");
        }
    }
}

