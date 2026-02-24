package java1.buoi15.baitap.bai1;

public class FoodProduct extends Product{

        private int expiryDaysRemaining;

        public FoodProduct(String code, double price, int expiryDaysRemaining) {
            super(code, price);
            this.expiryDaysRemaining = expiryDaysRemaining;
        }

        @Override
        public double calculateValue() {
            if (expiryDaysRemaining < 30) {
                return price * 0.9;
            }
            return price;
        }

        @Override
        public String toString() {
            return super.toString() + ", Số ngày còn lai: " + expiryDaysRemaining;
        }
    }

