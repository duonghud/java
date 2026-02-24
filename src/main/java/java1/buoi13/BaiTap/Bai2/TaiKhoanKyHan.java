package java1.buoi13.BaiTap.Bai2;

public class TaiKhoanKyHan extends TaiKhoan implements ITaiKhoanCoKyHan {

    public TaiKhoanKyHan(String soTK, double soDu) {
        super(soTK, soDu);
    }

    @Override
    public void guiTien(double soTien) {
        soDu += soTien;
        System.out.println("Nạp tiền TK Kỳ hạn! Số dư hiện tại: " + soDu);
    }

    @Override
    public void rutTien(double soTien) {
        if (soDu >= soTien) {
            soDu -= soTien;
            System.out.println("Rút tiền TK Kỳ hạn! Số dư hiện tại: " + soDu);
        } else {
            System.out.println("Không đủ số dư TK Kỳ hạn!");
        }
    }

    @Override
    public void tatToanSoKy(int soThang) {
        double lai = soDu * 0.01 * soThang;
        soDu += lai;
        System.out.println("Tất toán kỳ hạn " + soThang + " tháng. Lãi: " + lai + " | Số dư mới: " + soDu);
    }
}
