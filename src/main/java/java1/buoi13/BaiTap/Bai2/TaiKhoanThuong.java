package java1.buoi13.BaiTap.Bai2;

public class TaiKhoanThuong extends TaiKhoan {

    public TaiKhoanThuong(String soTK, double soDu) {
        super(soTK, soDu);
    }

    @Override
    public void guiTien(double soTien) {
        soDu += soTien;
        System.out.println("Nạp tiền thành công! Số dư hiện tại: " + soDu);
    }

    @Override
    public void rutTien(double soTien) {
        if (soDu >= soTien) {
            soDu -= soTien;
            System.out.println("Rút tiền thành công! Số dư hiện tại: " + soDu);
        } else {
            System.out.println("Không đủ số dư!");
        }
    }
}
