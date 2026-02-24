package java1.buoi6.huongDoiTuong.baitap.bai8;

public class Rectangle {
    double width;
    double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return width * height;
    }

    // Phương thức tính chu vi
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Phương thức hiển thị thông tin
    public void display() {
        System.out.println("Chiều rộng: " + width);
        System.out.println("Chiều cao: " + height);
        System.out.println("Diện tích: " + getArea());
        System.out.println("Chu vi: " + getPerimeter());
    }
}
