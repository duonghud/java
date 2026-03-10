package Java.solidSRP.vidu3.NonFix;

import java.util.ArrayList;
import java.util.List;

public class BankAccountManagement {
    private List<BankAccount> accounts;
    public BankAccountManagement(){
        accounts = new ArrayList<>();
    }

    public void openAccount(BankAccount account){
        accounts.add(account);
        System.out.println("Account opened: " + account.getAccountNumber());
    }

    public void closeAccount(BankAccount account){
        accounts.remove(account);
        System.out.println("Account closed: " + account.getAccountNumber());
    }

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

    public void calculateInterest(){
        for(BankAccount account : accounts){
            double interest = account.getBalance() * 0.02;
            account.deposit(interest);
        }
        System.out.println("Interest calculated for all accounts");
    }

    public void sendMonthlyStatement(BankAccount account){
        System.out.println("Sending monthly statement to account: "
                + account.getAccountNumber()
                + " | Balance: " + account.getBalance());
    }

    public void processLoan(BankAccount account, double loanAmount){
        account.deposit(loanAmount);
        System.out.println("Loan processed: " + loanAmount +
                " credited to account " + account.getAccountNumber());
    }
}