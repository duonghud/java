package java2.buoi2.DemoLyThuyet.Demo4;

public class Account {
    private String accountNumber;
    private double balance;
    private String owner;

    public Account(String accountNumber, String owner){
        // 1. Contructor chaining
        this(accountNumber, owner, 0.0);
    }

    public Account(String accountNumber, String owner, double blance){
        // 2. Phan biet parameter
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = blance;
    }

    public Account deposit(double amount){
        // 3. Method chaining
        if (amount > 0){
            balance += amount;
        } else {
            System.out.println("So tien khong hop le");
        }
        return this;
    }

    public void transfer(Account target, double amount){
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            target.balance += amount;
            this.logTransaction(target, amount);
        } else {
            System.out.println("Giao dich khong hop le!");
        }
    }

    public void logTransaction(Account target, double amount){
        System.out.println(this.owner + "transferred" + amount + "to" + target.owner);
    }
}
