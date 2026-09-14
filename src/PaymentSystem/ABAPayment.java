package PaymentSystem;

public class ABAPayment implements PaymentMethod {

    private String phoneNumber;

    public ABAPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println(
                "Paid $" + amount +
                        " using ABA Pay from " +
                        phoneNumber
        );
    }

    @Override
    public void refund(double amount) {
        System.out.println(
                "Refunded $" + amount +
                        " to ABA account."
        );
    }

    @Override
    public String getPaymentName() {
        return "ABA Pay";
    }
}