package java1.buoi6.huongDoiTuong.baitap.bai9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin nhân viên
        System.out.println("Nhập thông tin nhân viên:");
        System.out.print("Mã nhân viên: ");
        int id = sc.nextInt();
        sc.nextLine(); // bỏ dòng trống
        System.out.print("Họ tên: ");
        String name = sc.nextLine();
        System.out.print("Tuổi: ");
        int age = sc.nextInt();
        System.out.print("Lương: ");
        double salary = sc.nextDouble();

        // Tạo đối tượng Employee
        Employee emp = new Employee(id, name, age, salary);

        // Hiển thị thông tin ban đầu
        System.out.println("\n--- Thông tin nhân viên ---");
        emp.showInfo();

        // Tăng lương 10%
        emp.increaseSalary(10);

        // Hiển thị lại thông tin sau khi tăng lương
        System.out.println("\n--- Sau khi tăng lương 10% ---");
        emp.showInfo();
    }
}
