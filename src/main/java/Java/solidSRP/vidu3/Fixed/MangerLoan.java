package Java.solidSRP.vidu3.Fixed;

import Java.solidSRP.vidu3.NonFix.BankAccount;

public class MangerLoan {
    public void processLoan(BankAccount account, double loanAmount){
        account.deposit(loanAmount);
        System.out.println("Loan processed: " + loanAmount +
                " credited to account " + account.getAccountNumber());
    }
}
