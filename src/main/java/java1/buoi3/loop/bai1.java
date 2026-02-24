package java1.buoi3.loop;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Nhập phần tử arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Các phần tử trong mảng là:");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int tong = 0;
        for (int i = 0; i < a; i++) {
            tong += arr[i];
        }
        System.out.println("Tổng các phần tử trong mảng = " + tong);

        sc.close();
     }
}
