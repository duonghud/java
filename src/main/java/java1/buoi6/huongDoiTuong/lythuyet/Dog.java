package java1.buoi6.huongDoiTuong.lythuyet;

public class Dog {
    String ten;
    String mauLong;

    public void an(){
        System.out.println(ten + " dang hup");
    }

    public void trongNha(){
        System.out.println(ten +" dang trong nha");
    }

    public static void main(String[] args){
        Dog a = new Dog();
        a.ten = "Corgi";
        a.mauLong = "Vang";
        a.an();
        a.trongNha();
        a.ten = "Husky";
        a.mauLong = "Trang den";
        a.an();
        a.trongNha();
    }
}
