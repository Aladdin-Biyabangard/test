package lesson;

abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Yetərli balans yoxdur!");
        }
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount; // overdraft icazəlidir
    }
}

public class BankTask {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount(100);
        BankAccount acc2 = new CheckingAccount(50);

        acc1.deposit(50);
        acc1.withdraw(120);
        System.out.println("Savings balance: " + acc1.getBalance());

        acc2.withdraw(80);
        System.out.println("Checking balance: " + acc2.getBalance());
    }
}
