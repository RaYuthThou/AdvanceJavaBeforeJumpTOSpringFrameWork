package Composition.ChanmonyStore;

public class Order {

    private final  Customer customer;
    private final Payment payment;
    private final Product product;
    private final Shipping shipping;
    private final Purchase purchase;

    public Order(Customer customer , Payment payment , Product product ,
                 Shipping ship , Purchase purchase){
        this.customer = customer;
        this.payment = payment;
        this.product = product;
        this.purchase = purchase;
        this.shipping = ship;
    }

    public void checkout() {

        System.out.println("=========== CHECKOUT ===========");

        System.out.println("Customer: " + customer.getName());
        System.out.println("Product: " + product.getProductName());
        System.out.println("Price: $" + product.getPriceProduct());

        boolean successful = purchase.pusechase(payment, product);

        if (successful) {
            shipping.shipper();
        } else {
            System.out.println("Purchase failed: insufficient funds.");
        }

        System.out.println("================================");
    }


}
