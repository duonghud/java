package Open.ClosedPrinciple.Vidu3.fix;

public class PaymentProcessor {
    private Payment payment;

    public PaymentProcessor(Payment payment) {
        this.payment = payment;
    }

    public void paymentProcess(Payment payment){
        payment.acceptPayment();
    }

}
