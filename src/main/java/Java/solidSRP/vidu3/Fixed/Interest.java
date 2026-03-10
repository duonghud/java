package Java.solidSRP.vidu3.Fixed;

import Java.solidSRP.vidu3.NonFix.BankAccount;

public class Interest {
    private BankAccount[] accounts;

    public void calculateInterest(){
        for(BankAccount account : accounts){
            double interest = account.getBalance() * 0.02;
            account.deposit(interest);
        }
        System.out.println("Interest calculated for all accounts");
    }
}
