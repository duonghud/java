package java1.buoi15.baitap.bai1;

public abstract class Product {
    protected String code;
    protected double price;

    public Product(String code, double price){
        this.code = code;
        this.price = price;
    }

    public double calculateValue() {
        return price;
    }
    @Override
    public String toString() {
        return "Mã sản phẩm: " + code + ", Giá: " + price;
    }

}
