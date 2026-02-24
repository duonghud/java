package java2.buoi2.BaiTap.Bai2;

public class Office extends Employee{
    private String chuyenmon;
    public Office(String id, String name, String fullname, int age, String address, String gender){
        super(id, fullname, age, address, gender);
        this.chuyenmon = chuyenmon;
    }


    @Override
    public String toString() {
        return "Office{" +
                "chuyenmon='" + chuyenmon + '\'' +
                '}';
    }
}
