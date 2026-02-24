package java1.buoi3.loop;

import java.util.Scanner;

public class bai2 {
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
        for(int i = 2; i < a; i++) {
            tong += arr[i];
        }
        System.out.println("Tổng các phần tử chẵn trong mảng = " + tong);
        int tongChan = 0, tongLe = 0;
        for (int i = 0; i < a; i++) {
            if (arr[i] % 2 == 0) {
                tongChan += arr[i];
            } else {
                tongLe += arr[i];
            }
        }
        System.out.println("Tổng các phần tử chẵn = " + tongChan);
        System.out.println("Tổng các phần tử lẻ = " + tongLe);
        sc.close();
    }
}
