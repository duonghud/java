package java1.buoi3.mang1chieu;

import java.util.Scanner;

public class thuchanh {
    public static Scanner sc = new Scanner(System.in);
    /*
     * Nhập các phần tử ra màn hình
     * */
    public static void create(int[] numbers, int n) {
        for(int i = 0; i < n; i++) {
            System.out.print("numbers[" + i + "] = ");
            numbers[i] = sc.nextInt();
        }
    }
    /*
     * In các phần tử ra màn hình
     * */
    public static void display(int[] numbers, int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }
    /*
     * Tính tổng các phần tử trong mảng
     * */
    public static int sum(int[] numbers, int n) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        return sum;
    }
    public static void MinMax(int[] numbers, int n) {
        int min = numbers[0], max = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
    public static void sapxep(int[] numbers, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] > numbers[j]) {
                    // hoán đổi
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Array after sorting (ASC): ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int n;
        do {
            System.out.println("Enter n:");
            n = sc.nextInt();
        }while(n < 1 || n > 10);
        create(numbers, n);
        System.out.println("------------Display array------------");
        display(numbers,n);
        System.out.println("\n------------Sum------------");
        System.out.println("Sum: " + sum(numbers, n));
        System.out.println("\n------------------MinMax"  );
        MinMax(numbers, n);
        System.out.println("----------------array");
        sapxep(numbers, n);
    }
}
