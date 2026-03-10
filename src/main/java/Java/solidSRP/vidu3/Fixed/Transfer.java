package Java.solidSRP.vidu3.Fixed;

import Java.solidSRP.vidu3.NonFix.BankAccount;

public class Transfer {
    public void transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount){
        if(fromAccount.getBalance() >= amount){
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transferred " + amount + " from "
                    + fromAccount.getAccountNumber() + " to "
                    + toAccount.getAccountNumber());
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
