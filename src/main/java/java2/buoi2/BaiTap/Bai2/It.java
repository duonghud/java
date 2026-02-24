package java2.buoi2.BaiTap.Bai2;

public class It extends Employee {
    private String languageIt;
    private int numberPj;
    public It(String id, String name, String fullname, int age, String address, String gender){
        super(id, fullname, age, address, gender);
        this.languageIt = languageIt;
        this.numberPj = numberPj;
    }

    @Override
    public String toString() {
        return "It{" +
                "languageIt='" + languageIt + '\'' +
                ", numberPj=" + numberPj +
                '}';
    }
}
