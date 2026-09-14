package PaymentSystem;

public class PaymentService
{
    public void processPayment(
            PaymentMethod paymentMethod ,
            double amount
    ){
        System.out.println(
                "Payment Method: " +
                        paymentMethod.getPaymentName()
        );
        paymentMethod.pay(amount);
    }

    public void processRefund(
            PaymentMethod paymentMethod ,
            double amount
    ){
        paymentMethod.refund(amount);
    }
}
