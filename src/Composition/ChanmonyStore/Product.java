package Composition.ChanmonyStore;
import java.lang.IllegalAccessException;

public class Product {
    private String name = "USER";
    private  double price = 0.00;

    public Product(String productName , double priceProduct){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Product name can't not be empty");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Product price cannot be negative");
        }
        this.name = productName;
        this.price = priceProduct;
    }

    public void displayProduct(){
        System.out.println("=========== Product Info ==========");
        System.out.println(this.name);
        System.out.println(this.price);
        System.out.println("====================================");
    }

    public String getProductName(){
        return this.name;
    }
    public double getPriceProduct(){
        return this.price;
    }


}
