package java1.buoi2.loop;

import java.util.Scanner;

public class Bai1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nhập số nguyên n: ");
            int n = sc.nextInt();
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("Tổng từ 1 đến " + n + " là: " + sum);
        }
    }
