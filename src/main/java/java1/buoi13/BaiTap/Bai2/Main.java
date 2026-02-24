package java1.buoi13.BaiTap.Bai2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<TaiKhoan> danhSach = new ArrayList<>();

        // Tạo tài khoản
        TaiKhoan tk1 = new TaiKhoanThuong("TK001", 100000);
        TaiKhoan tk2 = new TaiKhoanKyHan("TK002", 5000);

        // Thêm vào danh sách
        danhSach.add(tk1);
        danhSach.add(tk2);

        // Duyệt danh sách
        for (TaiKhoan tk : danhSach) {
            System.out.println("\n=== Tài khoản: " + tk.getSoTaiKhoan() + " ===");

            tk.guiTien(500000);
            tk.rutTien(2000000);

            // Kiểm tra instanceof
            if (tk instanceof ITaiKhoanCoKyHan) {
                ITaiKhoanCoKyHan tkKyHan = (ITaiKhoanCoKyHan) tk;
                tkKyHan.tatToanSoKy(3); // ví dụ 3 tháng
            }
        }
    }
}
