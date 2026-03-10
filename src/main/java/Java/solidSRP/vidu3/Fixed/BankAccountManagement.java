package Java.solidSRP.vidu3.Fixed;

import Java.solidSRP.vidu3.NonFix.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class BankAccountManagement {
    private List<BankAccount> accounts = new ArrayList<>();

    public void openAccount(BankAccount account){
        accounts.add(account);
        System.out.println("Account opened: " + account.getAccountNumber());
    }

    public void closeAccount(BankAccount account){
        accounts.remove(account);
        System.out.println("Account closed: " + account.getAccountNumber());
    }
}
