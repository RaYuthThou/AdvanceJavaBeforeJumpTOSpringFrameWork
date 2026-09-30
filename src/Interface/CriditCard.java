package Interface;

public class CriditCard implements Payment{
    public void payment(double amount){
        System.out.println("Pay by CreditCard : $" + amount);
    }
}
