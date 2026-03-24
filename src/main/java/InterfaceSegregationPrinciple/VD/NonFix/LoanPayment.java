package InterfaceSegregationPrinciple.VD.NonFix;

import java.util.List;

public class LoanPayment implements Payment{
    @Override
    public Object status() {
        return null;
    }

    @Override
    public List<Object> getPayment() {
        return List.of();
    }

    @Override
    public void initiatelLoanSettlement() {

    }

    @Override
    public void initiatelPayments() {

    }

    @Override
    public void initiatelRePayments() {

    }
}
