package Interface;

public class ABA implements Payment{
//    if you implements from it set as it Public
     public void payment(double amount){
        System.out.println("Pay by ABA Bank : $" + amount);
    }
}
