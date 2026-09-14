package Composition.ChanmonyStore;

public class Purchase {
    private final Transaction transaction;

    public Purchase(){
        transaction = new Transaction();
    }

    public boolean pusechase(Payment payment , Product product){
        if(!payment.canAfford(product)){
            System.out.println("You don't have engout money");

            return false;
        }
        System.out.println("Purchase successful");
        transaction.recordTransaction(product.getProductName() , product.getPriceProduct());
        return true;
    }
}
