package Open.ClosedPrinciple.Vidu3.fix;

public class App {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.getPaymentMethod(PaymentMode.CREDIT_CARD);

        PaymentProcessor processor = new PaymentProcessor(payment);
        processor.paymentProcess(payment);
    }
}
