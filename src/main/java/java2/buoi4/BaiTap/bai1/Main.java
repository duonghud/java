package java2.buoi4.BaiTap.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyThuVien service = new QuanLyThuVien();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm Sách");
            System.out.println("2. Thêm Độc giả");
            System.out.println("3. Hiển thị danh sách Sách");
            System.out.println("4. Hiển thị danh sách Độc giả");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> service.themSach();
                case 2 -> service.themDocGia();
                case 3 -> service.hienThiDanhSachSach();
                case 4 -> service.hienThiDanhSachDocGia();
                case 0 -> System.out.println("Thoát chương trình!");
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }
}

