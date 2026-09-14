package BankingSystem;

public class Customer {
   private final String name;
   private final String tel;

   public Customer(String name , String tel){
       this.name = name;
       this.tel = tel;
   }

   public void displayInfo(){
       System.out.println("======= Information ========");
       System.out.println("Name : " + this.name);
       System.out.println("Telephone : " + this.tel);
       System.out.println("============================");
   }



}
