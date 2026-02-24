package java2.buoi4.BaiTap.bai1;

public class DocGia {
    private String MaDocGia;
    private String TenDocGia;
    private String SoDienThoai;
    private String LoaiThe;
    private int NgayDangKy;

    public DocGia(String maDocGia, String tenDocGia, String soDienThoai,String loaiThe, int ngayDangKy){
        this.MaDocGia = maDocGia;
        this.TenDocGia = tenDocGia;
        this.SoDienThoai = soDienThoai;
        this.LoaiThe = loaiThe;
        this.NgayDangKy = ngayDangKy;
    }

    public String getMaDocGia(){
        return MaDocGia;
    }

    public void setMaDocGia(String maDocGia){
        this.MaDocGia = maDocGia;
    }

    public String getTenDocGia(){
        return TenDocGia;
    }

    public void setTenDocGia(String tenDocGia){
        this.TenDocGia = tenDocGia;
    }

    public String getSoDienThoai(){
        return SoDienThoai;
    }

    public void setSoDienThoai(String soDienThoai){
        this.SoDienThoai = soDienThoai;
    }

    public String getLoaiThe(){
        return LoaiThe;
    }

    public void setLoaiThe(String loaiThe){
        this.LoaiThe = loaiThe;
    }

    public int getNgayDangKy(){
        return NgayDangKy;
    }

    public void setNgayDangKy(int ngayDangKy){
        this.NgayDangKy = ngayDangKy;
    }
    @Override
    public String toString() {
        return "DocGia{" +
                "MaDocGia=" + MaDocGia +
                ", TenDocGia='" + TenDocGia + '\'' +
                ", SoDienThoai='" + SoDienThoai + '\'' +
                ", LoaiThe=" + LoaiThe +
                ", NgayDangKy=" + NgayDangKy +
                '}';
    }
}
