import PaymentSystem.*;
public class Main {

    public static void main(String[] args) {

        PaymentService service = new PaymentService();

        PaymentMethod cash = new cashPayment();

        PaymentMethod card =
                new CreditCardPayment("1234567890123456");

        PaymentMethod aba =
                new ABAPayment("012345678");

        service.processPayment(cash, 50);

        System.out.println();

        service.processPayment(card, 100);

        System.out.println();

        service.processPayment(aba, 25);

        System.out.println();

        service.processRefund(card, 30);
    }
}
