package java2.buoi2.BaiTap.Bai2;

public class salle extends Employee{
    private String languages;
    public salle(String id, String name, String fullname, int age, String address, String gender){
        super(id, fullname, age, address, gender);
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "salle{" +
                "languages='" + languages + '\'' +
                '}';
    }
}
