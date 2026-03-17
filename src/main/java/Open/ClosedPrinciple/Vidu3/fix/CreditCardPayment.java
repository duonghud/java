package Open.ClosedPrinciple.Vidu3.fix;

public class CreditCardPayment implements Payment{
    @Override
    public void acceptPayment() {
        System.out.println("Process credit card payment.....");
    }
}
