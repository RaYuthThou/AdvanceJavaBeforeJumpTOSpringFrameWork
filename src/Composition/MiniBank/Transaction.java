package Composition.MiniBank;

public class Transaction {

    public void recordTransaction(double amount){
        System.out.println(
                "Transaction recorded: $" + amount
        );
    }
}
