package java2.buoi2.BaiTap.Bai2;

public class Employee {
    protected String id;
    protected String fullname;
    protected int age;
    protected String address;
    protected String gender;

    public Employee(String id, String fullname, int age, String address, String gender){
        this.address = address;
        this.age = age;
        this.fullname = fullname;
        this.id = id;
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", fullname='" + fullname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
