package java1.buoi15.baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * o   themNhanVien(NhanVien nv)
 * o   xoaNhanVien(String maNV)
 * o   tinhLuong(String maNV) tính lương = lương cơ bản * hệ số
 * o   timKiemNhanVien(String ten) tìm kiếm theo tên
 * */
public class QuanLyNhanVien {
    List<NhanVien> dsNhanVien;
    public QuanLyNhanVien() {
        dsNhanVien = new ArrayList<>();
    }

    public NhanVien nhapThongTinNhanVien(Scanner sc) {
        System.out.print("Nhập mã nhân viên: ");
        String maNV = sc.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        double luongcb = sc.nextDouble();
        System.out.print("Nhập hệ số lương: ");
        double heSoLuong = sc.nextDouble();
        sc.nextLine();
        return new NhanVien(maNV, hoTen, luongcb, heSoLuong);
    }

    public void themNhanVien(NhanVien nv) {
        if(nv != null) {
            if(timKiemNhanVienTheoMa(nv.getMaNV()) != null) {
                System.out.println("Nhân viên đã tồn tại.");
                return;
            }
            dsNhanVien.add(nv);
        }else{
            System.out.println("Nhân viên không hợp lệ.");
        }
    }

    public boolean xoaNhanVien(String maNV) {
        if(timKiemNhanVienTheoMa(maNV) == null) {
            System.out.println("Mã nhân viên không tồn tại.");
            return false;
        }
        NhanVien nv = timKiemNhanVienTheoMa(maNV);
        dsNhanVien.remove(nv);
        return true;
    }

    public double tinhLuong(String maNV, Scanner sc) {
        if(timKiemNhanVienTheoMa(maNV) == null) {
            System.out.println("Mã nhân viên không tồn tại. Nhập lại mã nhân viên:");
            do{
                maNV  = sc.nextLine();
                if(timKiemNhanVienTheoMa(maNV) == null) {
                    System.out.println("Mã nhân viên không tồn tại. Nhập lại mã nhân viên:");
                }
            }while(timKiemNhanVienTheoMa(maNV) == null);
        }
        NhanVien nv = timKiemNhanVienTheoMa(maNV);
        double luong = nv.getHeSoLuong() * nv.getLuongCoBan();
        return luong;
    }

    public NhanVien timKiemNhanVien(String ten) {
        for(NhanVien nv : dsNhanVien) {
            if(nv.getHoTen().equalsIgnoreCase(ten)) {
                return nv;
            }
        }
        return null;
    }
    private NhanVien timKiemNhanVienTheoMa(String maNV) {
        for(NhanVien nv : dsNhanVien) {
            if(nv.getMaNV().equalsIgnoreCase(maNV)) {
                return nv;
            }
        }
        return null;
    }

    public void inDanhSach() {
        if(dsNhanVien.size() == 0) {
            System.out.println("Danh sách nhân viên rỗng.");
            return;
        }
        for(NhanVien nv: dsNhanVien) {
            System.out.println(nv.thongTinNhanVien());
        }
    }
}