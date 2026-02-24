package java1.buoi15.baitap.bai1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> list = new ArrayList<>();

        // Thêm sản phẩm điện tử
        list.add(new ElectronicProduct("E01", 6000, 12));
        list.add(new ElectronicProduct("E02", 15000, 24));

        // Thêm thực phẩm
        list.add(new FoodProduct("F01", 100000, 10));
        list.add(new FoodProduct("F02", 80000, 50));

        // In danh sách
        System.out.println("Danh sách sản phẩm:");
        for (Product p : list) {
            System.out.println(p + " -> Giá: " + p.calculateValue());
        }

        // Tính tổng giá trị kho
        double total = 0;
        for (Product p : list) {
            total += p.calculateValue();
        }

        System.out.println("\nTổng giá trị kho hàng: " + total);
    }
}

