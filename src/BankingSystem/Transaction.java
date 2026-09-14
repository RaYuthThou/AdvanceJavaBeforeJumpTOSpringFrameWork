package BankingSystem;

public class Transaction {


    public void recordTransaction(String type , double balance){
        System.out.println("========== Transaction ==========");
        System.out.println("Type : " + type);
        System.out.println("Balance : " + balance);
        System.out.println("=================================");
    }
}
