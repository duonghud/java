// viet chuong trinh thuc hien 1 vong lap vo han(while(true)). Trong vong lap:
//Nhap 1 so nguyen
//Neu 1 so nhao vao < 10 su dung continue va yeu cau nhap lai
//Neu 1 so nhap bao > 100 su dung break va thoat chuong trinh
//Neu nam trong khoan[10, 100], tinh tong va tiep tuc
package java1.buoi6.baitap;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Nhap 1 so nguyen: ");
            int n = sc.nextInt();

            if (n < 10) {
                System.out.println("Vui long nhap so lon hon 10");
                continue;
            }

            if (n > 100) {
                System.out.println("Thoat chuong trinh!");
                break;
            }
            sum += n;
            System.out.println("-------Tong hien tai: " + sum);
        }
        System.out.println("----------Tong cuoi cung = " + sum);
    }
}

