package Composition.MiniBank;

public class Account {

    private double amount;
    private Transaction transaction;

    public Account(double amount){
        this.amount = amount;
        transaction = new Transaction();
    }

    public void deposit(double balance){
        this.amount += balance;
        transaction.recordTransaction(balance);
    }
}
