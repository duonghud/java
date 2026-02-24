package java1.buoi3.loop;
import java.util.Scanner;
public class bai5 {
    public static Scanner sc = new Scanner(System.in);
    public static void create(int[] numbers, int n) {
        for(int i = 0; i < n; i++) {
            System.out.print("numbers[" + i + "] = ");
            numbers[i] = sc.nextInt();
        }
    }
    public static void display(int[] numbers, int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }
    public static void countX(int[] numbers, int n) {
        System.out.print("\nNhập số cần đếm x: ");
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == k) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của " + k + " trong mảng là: " + count);
    }

    public static void main(String[] args) {
        int[] numbers = new int[7];
        int n;
        do {
            System.out.println("Nhập n:");
            n = sc.nextInt();
        }while(n < 1 || n > 7);
        create(numbers, n);
        System.out.println("------------Hiển thị mạng------------");
        display(numbers,n);
        countX(numbers, n);
        System.out.print("hiển thị");

    }
}



