package java1.buoi6.huongDoiTuong.baitap.bai8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập dữ liệu cho 2 hình chữ nhật
        Rectangle[] rects = new Rectangle[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Nhập thông tin cho hình chữ nhật thứ " + (i + 1) + ":");
            System.out.print("Chiều rộng: ");
            double width = sc.nextDouble();
            System.out.print("Chiều cao: ");
            double height = sc.nextDouble();

            rects[i] = new Rectangle(width, height);
        }

        // Hiển thị kết quả
        System.out.println("\n--- Kết quả ---");
        for (int i = 0; i < rects.length; i++) {
            System.out.println("\nHình chữ nhật thứ " + (i + 1) + ":");
            rects[i].display();
        }

    }
}
