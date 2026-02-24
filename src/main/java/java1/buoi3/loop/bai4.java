package java1.buoi3.loop;
import java.util.Scanner;
public class bai4 {
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
    public static void sapxep(int[] numbers, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] > numbers[j]) {
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
    public static int inputInteger() {
        int n;
        do {
            System.out.println("Nhập n:");
            n = sc.nextInt();
        }while(n < 1 || n > 100);
        return n;
    }
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int n = inputInteger();
        create(numbers, n);
        System.out.println("------------Hiển thị mạng------------");
        display(numbers,n);
        System.out.println("\n----------------Mảng");
        sapxep(numbers, n);
    }
    }



