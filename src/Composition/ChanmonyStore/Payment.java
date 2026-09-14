package Composition.ChanmonyStore;

public class Payment {
    private double amount;

    public Payment(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return  amount;
    }

    public boolean canAfford(Product product) {
        return amount >= product.getPriceProduct();
    }
}
