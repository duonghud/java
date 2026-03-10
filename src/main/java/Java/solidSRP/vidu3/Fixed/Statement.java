package Java.solidSRP.vidu3.Fixed;

import Java.solidSRP.vidu3.NonFix.BankAccount;

public class Statement {
    public void sendMonthlyStatement(BankAccount account){
        System.out.println("Sending monthly statement to account: "
                + account.getAccountNumber()
                + " | Balance: " + account.getBalance());
    }
}
