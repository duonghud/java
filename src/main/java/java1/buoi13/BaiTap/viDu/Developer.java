package java1.buoi13.BaiTap.viDu;

public class Developer extends Employee implements ChamCong{
    private int numberOfProject;
    private double awards = 500000.0;
    private double basicSalary = 20000000.0;
    public Developer(String name, int age) {
        super(name, age);
    }

    @Override
    public double calculateSalary(){
        return basicSalary + numberOfProject * awards;
    }
    @Override
    public void chamcong() {
        System.out.println("Developer chấm công bằng máy nhận diện.");
    }
}
