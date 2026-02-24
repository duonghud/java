package java1.buoi15.baitap.bai1;

public class ElectronicProduct extends Product {
    private int warrantyMonths;

    public ElectronicProduct(String code, double price, int warrantyMonths) {
        super(code, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double calculateValue() {
        return price + price * 0.05;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bảo hành: " + warrantyMonths + " Tháng";
    }
}

