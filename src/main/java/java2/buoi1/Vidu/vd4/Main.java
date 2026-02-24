package java2.buoi1.Vidu.vd4;

import java2.buoi1.Vidu.vd2.person;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] ds = new Product[5];

        for (int i = 1; i <= 5; i++) {
            System.out.print("Tên sản phẩm: ");
            String name = sc.nextLine();
            System.out.print("moTa: ");
            String description = sc.nextLine();
            System.out.print("Giá: ");
            int price = sc.nextInt();
            System.out.println("So luong: ");
            double quantity = sc.nextDouble();
            sc.nextLine();
            ds[i] = new Product().setName(name).setPrice(price).setDescription(description).setQuantity(quantity);
        }
        System.out.println("\n Danh sach san pham");
    }
}
