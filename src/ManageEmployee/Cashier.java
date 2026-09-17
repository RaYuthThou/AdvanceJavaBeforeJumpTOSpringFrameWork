package ManageEmployee;

public class Cashier extends Employee{
    public Cashier(String name , String age , double salary){
        super(name , age , salary);
    }
    @Override
    public void work(){
        System.out.println("Cashier is working....");
    }
    public void cashPayment(){
        System.out.println("Cashier is payment with client...");
    }
}
