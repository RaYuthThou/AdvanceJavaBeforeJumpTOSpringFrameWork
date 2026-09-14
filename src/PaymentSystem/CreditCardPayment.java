package PaymentSystem;

public class CreditCardPayment implements PaymentMethod {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println(
                "Paid $" + amount +
                        " using Credit Card ****" +
                        cardNumber.substring(cardNumber.length() - 4)
        );
    }

    @Override
    public void refund(double amount) {
        System.out.println(
                "Refunded $" + amount +
                        " to Credit Card."
        );
    }

    @Override
    public String getPaymentName() {
        return "Credit Card";
    }
}