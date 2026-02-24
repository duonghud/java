package java1.buoi15.baitap;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void showMenu() {
        System.out.println("========== MENU ===========");
        System.out.println("1. Thêm mới nhân viên.");
        System.out.println("2. Xóa nhân viên.");
        System.out.println("3. Tính lương.");
        System.out.println("4. Tìm nhân viên theo tên.");
        System.out.println("5. Danh sách nhân viên.");
        System.out.println("0. Dừng chương trình.");
    }
    public static void main(String[] args) {
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        int choice;
        boolean isContinue = true;
        do{
            showMenu();
            System.out.println("Nhập lựa chọn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("Nhập thông tin nhân viên:");
                    NhanVien nv = qlnv.nhapThongTinNhanVien(sc);
                    qlnv.themNhanVien(nv);
                    break;
                }
                case 2: {
                    System.out.println("Nhập mã nhân viên: ");
                    String maNV = sc.nextLine();
                    boolean check = qlnv.xoaNhanVien(maNV);
                    if(check) {
                        System.out.println("Xóa thành công nhân viên có mã: " + maNV);
                    }
                    break;
                }
                case 3: {
                    System.out.println("Nhập mã nhân viên: ");
                    String maNV = sc.nextLine();
                    qlnv.tinhLuong(maNV, sc);
                    break;
                }
                case 4: {
                    System.out.println("Tìm nhân viên theo tên: ");
                    String ten = sc.nextLine();
                    NhanVien nv = qlnv.timKiemNhanVien(ten);
                    System.out.println(nv.thongTinNhanVien());
                    break;
                }
                case 5: {
                    System.out.println("Danh sách nhân viên:");
                    qlnv.inDanhSach();
                    break;
                }
                case 0:
                    isContinue = false;
                    System.out.println("Bạn đã dừng chương trình!");
                    System.exit(1);
                    break;
            }
        }while(isContinue);
    }
}

