package InterfaceSegregationPrinciple.VD.Fix;

import java.util.List;

public class BankPayment implements Bank, Payment{
    @Override
    public void initiatelPayments() {

    }

    @Override
    public Object status() {
        return null;
    }

    @Override
    public List<Object> getPayment() {
        return List.of();
    }
}
