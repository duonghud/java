package java2.buoi2.DemoLyThuyet.Demo1.Demo2;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.toString());
        Employee e2 = new Employee(2, "John");
        System.out.println(e2.toString());
        Employee e4 = new Employee(3, "Mary");
        System.out.println(e4.toString());
        Employee e5 = new Employee(4, "Syn", 19, "Hn");
        System.out.println(e5.toString());
    }
}
