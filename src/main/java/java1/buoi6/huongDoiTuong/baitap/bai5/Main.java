package java1.buoi6.huongDoiTuong.baitap.bai5;

public class Main {
    public static void main(String[]args){
        Diem2D diemA = new Diem2D(3,4);
        Diem2D diemB = new Diem2D();
        System.out.println("Toa do diem A: ");
        diemA.inToaDo();
        System.out.println("Toa do diem B: ");
        diemB.inToaDo();
        System.out.println("\nKhoang cach tu A den B la: " + diemA.tinhKhoangCach(diemB));
    }
}
