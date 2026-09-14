package BankingSystem;

public class Bank {
    private final Customer customer;
    private final BankAccount bankAccount;

    public Bank(Customer customer , BankAccount bankAccount){
        this.customer = customer;
        this.bankAccount = bankAccount;
    }

    public void displayAccountInfo(){
        customer.displayInfo();

        System.out.println("Account Balance : $"
                + bankAccount.getBalance());
    }
}
