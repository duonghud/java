package java1.buoi6.huongDoiTuong.baitap.bai5;

public class Diem2D {
    public double x;
    public double y;

    public Diem2D(){
        this.x = 0;
        this.y = 0;
    }

    public Diem2D(double x, double y ){
        this.x = x;
        this.y = y;
    }
    public void inToaDo(){
        System.out.println("(" + x + "," + y +")");
    }

    public double tinhKhoangCach(Diem2D diemKhac){
        double dx = diemKhac.x - this.x;
        double dy = diemKhac.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
