package java1.buoi6.huongDoiTuong.baitap.bai3;

public class LaiXe {
    public String tenLaiXe;

    public LaiXe(String tenLaiXe){
        this.tenLaiXe = tenLaiXe;
    }

    public void lai(XeHoi xe){
        System.out.println(tenLaiXe+ "TenLaiXe" + xe.tocDo +"TocDo");
        xe.tangToc(20);
        xe.giamToc(10);
        xe.intTocDo();
    }

    public static void main(String[] args){
        XeHoi mazda3 = new XeHoi("Mazda3");
        LaiXe anhBinh = new LaiXe("AnhBinh");
        anhBinh.lai(mazda3);
    }
}
