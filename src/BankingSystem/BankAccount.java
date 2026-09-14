package BankingSystem;

public class BankAccount {
    private double balance;

    private Transaction transaction;
    public BankAccount(double balance ){
        this.balance = balance;
        transaction = new Transaction();
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than 0.");
            return;
        }

        balance += amount;
        transaction.recordTransaction("DEPOSIT" , amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be greater than 0.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return;
        }

        balance -= amount;

        transaction.recordTransaction("WITHDRAW" , amount);
    }

    public double getBalance() {
        return balance;
    }
}
