package Open.ClosedPrinciple.Vidu3.fix;

public class PaymentFactory {

    public static final Payment getPaymentMethod(PaymentMode mode) {
        switch (mode) {
            case CASH:
                return new CashPayment();
            case CREDIT_CARD:
                return new CreditCardPayment();
            default:
                throw new IllegalArgumentException("Invalid payment mode");
        }
    }
}
