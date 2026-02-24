package java1.buoi6.huongDoiTuong.baitap.bai7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        // Nhập thông tin 3 sinh viên
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Tên: ");
            String name = sc.nextLine();
            System.out.print("Tuổi: ");
            int age = sc.nextInt();
            System.out.print("Điểm: ");
            double score = sc.nextDouble();
            sc.nextLine(); // bỏ dòng trống sau khi nhập số

            students[i] = new Student(name, age, score);
        }

        // In ra sinh viên có điểm >= 8.0
        System.out.println("\nDanh sách sinh viên có điểm >= 8.0:");
        for (Student st : students) {
            if (st.score >= 8.0) {
                st.display();
            }
        }

        sc.close();
    }
}