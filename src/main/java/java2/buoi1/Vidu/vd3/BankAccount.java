package java2.buoi1.Vidu.vd3;

public class BankAccount {
    private double balance;
    private static final double MINIUM_AMOUNT = 5000;

    public void deposit(double amount){
        if (amount > MINIUM_AMOUNT ){
            this.balance += amount;
            System.out.println("Nap thanh cong so du: " + amount +".");
        } else {
            System.out.println("So tien khong du");
        }
    }

    public boolean withdraw(double amount){
        if (amount > 0 && amount < this.balance){
            this.balance -= amount;
            System.out.println("Rut thanh cong! So du con lai:" + amount +".");
            return true;
        } else {
            System.out.println("So du khong du");
            return false;
        }
    }
}
