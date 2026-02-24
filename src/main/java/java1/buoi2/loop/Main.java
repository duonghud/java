
package java1.buoi2.loop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();

        boolean isPrime = true;

        if (a < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(a + " là số nguyên tố.");
        } else {
            System.out.println(a + " không phải số nguyên tố.");
        }
    }
}

