package ontap.Bai1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCanBo {
    private List<CanBo> dsCanbo;
    public QuanLyCanBo() {
        dsCanbo = new ArrayList<>();
        dsCanbo.add(new CongNhan("Nguyen Van A", 19, "Nam", "HN", 10));
        dsCanbo.add(new NhanVien("Le Thi B", 20, "Nu", "BG", "NV Nhân Sự"));
        dsCanbo.add(new KySu("Tran Van C", 25, "Nam", "HP", "CNTT"));
    }
    // 1: Công nhân | 2: kỹ sư | 3: nhân viên
    public void add(Scanner sc) {
        System.out.println("Nhập loại cán bộ: ");
        int loaiCB = sc.nextInt(); //Bổ sung thêm kiểm tra nhập loaiCB
        sc.nextLine();
        System.out.print("Họ tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Tuổi: ");
        int tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Giới tính: ");
        String gioiTinh = sc.nextLine();
        System.out.print("Địa chỉ: ");
        String diaChi = sc.nextLine();
        switch (loaiCB) {
            case 1: { //Công nhân
                System.out.print("Bậc: ");
                int bac = sc.nextInt();
                sc.nextLine();
                CongNhan congNhan = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
                dsCanbo.add(congNhan);
                break;
            }
            case 2: { // Kỹ sư
                System.out.print("Ngành đào tạo: ");
                String nganhDaoTao = sc.nextLine();
                KySu kySu = new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
                dsCanbo.add(kySu);
                break;
            }
            case 3: { //Nhân viên
                System.out.print("Công việc: ");
                String congViec = sc.nextLine();
                NhanVien nhanVien = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
                dsCanbo.add(nhanVien);
                break;
            }
        }
    }

    public void search(String hoTen) {
        for(CanBo cb : dsCanbo) {
            if(cb.getHoTen().equalsIgnoreCase(hoTen)) {
                if(cb instanceof CongNhan) {
                    CongNhan congNhan = (CongNhan) cb;
                    System.out.println(congNhan.toString());;
                } else if (cb instanceof KySu) {
                    KySu kySu = (KySu) cb;
                    System.out.println(kySu.toString());;
                }else{
                    NhanVien nhanVien = (NhanVien) cb;
                    System.out.println(nhanVien.toString());
                }
            }
        }
    }

    public void displayAll() {
        for (CanBo cb: dsCanbo) {
            if(cb instanceof CongNhan) {
                CongNhan congNhan = (CongNhan) cb;
                System.out.println(congNhan.toString());;
            } else if (cb instanceof KySu) {
                KySu kySu = (KySu) cb;
                System.out.println(kySu.toString());;
            }else{
                NhanVien nhanVien = (NhanVien) cb;
                System.out.println(nhanVien.toString());
            }
        }
    }
}
