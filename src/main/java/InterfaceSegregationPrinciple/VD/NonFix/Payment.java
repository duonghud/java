package InterfaceSegregationPrinciple.VD.NonFix;

import java.util.List;

public interface Payment {
    Object status();
    List<Object> getPayment();
    void initiatelLoanSettlement();
    void initiatelPayments();
    void initiatelRePayments();
}
