package java1.buoi13.BaiTap.viDu;

public class Main {
    public static void main(String[] args) {
        Employee dev1 = new Developer("John", 19);
        Employee sale1 = new Developer("Rosie", 18);
        System.out.println(dev1.calculateSalary());
        System.out.println(sale1.calculateSalary());
    }
}
