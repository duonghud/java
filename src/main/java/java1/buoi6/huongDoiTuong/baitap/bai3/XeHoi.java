package java1.buoi6.huongDoiTuong.baitap.bai3;

public class XeHoi {
    public String tenXe;
    public int tocDo;

    public XeHoi(String tenXe){
        this.tenXe = tenXe;
        this.tocDo = 0;
    }

    public void tangToc(int luongTang){
        tocDo += luongTang;
    }

    public void giamToc(int luongGiam){
        tocDo -= luongGiam;
        if(tocDo < 0) tocDo = 0;
    }

    public void intTocDo(){
        System.out.println("TocDoHienTai:" + "-----TenXe:" + tenXe +  "----" + tocDo + "km/h" );
    }
    public String getTenXe(){
        return tenXe;
    }
}
