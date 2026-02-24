// viet 1 chuong trinh cho phep nguoi dung nhap 10 so nguyen
// hay dung ngay lap tuc vong lap va thong bao neu ng dung nhap so am dau tiene java
package java1.buoi6.baitap;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (count < 10) {
            System.out.print("Nhập số nguyên thứ " + (count + 1) + ": ");

            // kiểm tra xem input có phải int không
            if (!sc.hasNextInt()) {
                System.out.println("Không phải số nguyên. Vui lòng nhập lại.");
                sc.next(); // bỏ token không hợp lệ
                continue;
            }

            int n = sc.nextInt();

            if (n < 0) {
                System.out.println("Bạn đã nhập số âm (" + n + "). Dừng vòng lặp ngay lập tức.");
                break;
            }
            count++;
        }

        if (count == 10) {
            System.out.println("Bạn đã nhập đủ 10 số nguyên không âm.");
        } else {
            System.out.println("Kết thúc chương trình sau " + count + " số hợp lệ được nhập (do nhập số âm).");
        }

        sc.close();
    }
}

