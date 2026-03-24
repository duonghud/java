package InterfaceSegregationPrinciple.VD.Fix;

import java.util.List;

public class LoanPayment implements Loan, Payment{
    @Override
    public void initiatelLoanSettlement() {

    }

    @Override
    public void initiatelRePayments() {

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
