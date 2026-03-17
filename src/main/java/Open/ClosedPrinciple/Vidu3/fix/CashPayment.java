package Open.ClosedPrinciple.Vidu3.fix;

public class CashPayment implements Payment{
    @Override
    public void acceptPayment() {
        System.out.println("Process cash payment....");
    }
}
