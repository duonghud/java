package InterfaceSegregationPrinciple.VD.Fix;

public interface Loan extends Payment{
    void initiatelLoanSettlement();
    void initiatelRePayments();
}
