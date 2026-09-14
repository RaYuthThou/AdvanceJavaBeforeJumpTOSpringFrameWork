package Composition.ChanmonyStore;

public class Customer {
    private String name;

    public Customer(String name){
        this.name = name;

    }

    public void displayInfo(){
        System.out.println("=========== User Info ===========");
        System.out.println(name);
        System.out.println("====================================");
    }


    public String getName(){
        return this.name;
    }
}
