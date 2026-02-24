package java2.buoi1.Vidu.vd2;

public class Main {
    public static void main(String[] args) {
        person p = new person();
        p.setName("Nguyen Hoang Phuc")
                .setAddress("Ha Noi")
                .setAge(20);
        System.out.println(p);
        System.out.println(p.setName("A"));
    }
}
