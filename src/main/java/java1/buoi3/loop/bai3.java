package java1.buoi3.loop;

import java.util.HashSet;
import java.util.Scanner;

public class bai3 {
    public static Scanner scanner = new Scanner(System.in);


    public static void createArray(int[] array, int n) {
        HashSet<Integer> uniqueValues = new HashSet<>();
        int count = 0;

        while (count < n) {
            System.out.print("Nhập phần tử thứ " + (count + 1) + ": ");
            int value = scanner.nextInt();

            if (uniqueValues.contains(value)) {
                System.out.println(" Giá trị bị trùng, vui lòng nhập lại!");
            } else {
                uniqueValues.add(value);
                array[count] = value;
                count++;
            }
        }
    }

    public static void displayArray(int[] array, int n) {
        System.out.print(" Mảng vừa nhập: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void searchElement(int[] array, int n) {
        System.out.print("Nhập số nguyên dương k cần tìm: ");
        int k = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == k) {
                System.out.println(" Giá trị " + k + " nằm ở index " + i
                        + " (phần tử thứ " + (i + 1) + ")");
                found = true;
            }
        }

        if (!found) {
            System.out.println(" Không tìm thấy giá trị " + k + " trong mảng.");
        }
    }

    public static void main(String[] args) {
        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        createArray(array, n);
        displayArray(array, n);
        searchElement(array, n);

        scanner.close();
    }
}
