package Composition.ChanmonyStore;

public class Transaction {

    public void recordTransaction(String productName , double Price){
        System.out.println("=========== Transaction ===========");
        System.out.println(productName);
        System.out.println(Price);
        System.out.println("====================================");
    }


}
