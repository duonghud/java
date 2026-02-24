package java1.buoi5.baitap;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        float a, b;

        do {
            System.out.println("\n===== Xem chuong trinh =====");
            System.out.println("1. Phep cong");
            System.out.println("2. Phep tru");
            System.out.println("3. Phep nhan");
            System.out.println("4. Phep chia lay du");
            System.out.println("5. Thoat");
            System.out.print("bantumlum: ");
            n = sc.nextInt();

            if (n >= 1 && n <= 4) {
                System.out.print("a: ");
                a = sc.nextInt();
                System.out.print("b: ");
                b = sc.nextInt();

                switch (n) {
                    case 1:
                        System.out.println("Ket qua: " + a + " + " + b + " = " + (a + b));
                        break;
                    case 2:
                        System.out.println("Ket qua: " + a + " - " + b + " = " + (a - b));
                        break;
                    case 3:
                        System.out.println("Ket qua: " + a + " * " + b + " = " + (a * b));
                        break;
                    case 4:
                        if (b != 0) {
                            System.out.println("Ket qua: " + a + " % " + b + " = " + (a % b));
                        } else {
                            System.out.println("Loi: khong the chia cho 0!");
                        }
                        break;
                }
            } else if (n == 5) {
                System.out.println("Thoat chuong trinh...");
            } else {
                System.out.println("Lua chon khong hop le!");
            }

        } while (n != 5);
    }
}
