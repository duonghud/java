package java1.buoi13.BaiTap.viDu;

public class PartTimeEmployee extends Employee{
    public PartTimeEmployee(String name, int age){
        super(name, age);
    }
    @Override
    public double calculateSalary() {
        // Ví dụ: làm part-time 20 giờ, 50k/giờ
        return 20 * 50000;
    }
}
