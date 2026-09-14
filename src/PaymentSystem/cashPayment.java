package PaymentSystem;

public class cashPayment implements PaymentMethod{


    @Override
    public void pay(double amount){
        System.out.println("Paid $" + amount + " using Cash.");
    }

    @Override
    public void refund(double amount){
        System.out.println("Refunded $" + amount + " in Cash.");
    }

    @Override
    public String getPaymentName(){ return "cash"; }

}
