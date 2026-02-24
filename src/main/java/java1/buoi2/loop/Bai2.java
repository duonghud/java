package java1.buoi2.loop;

import java.util.Scanner;

//Nhập 1 số nguyên n .Tính tổng các số chẵn từ 1 ->n
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i+=2) {
            sum += i;
        }

        System.out.println("Tổng từ 1 đến " + n + " là: " + sum);
    }
}
