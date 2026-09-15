package MethodOverloading;
import java.util.Arrays;

public class methodOverloading {
//    Method overloading is the method that have a name is the same
//    different only Parameter if the same parameter it's will be Error
//    Example I have Method name print 4
    public static void print(int age){
        System.out.println("Your Age : " + age);
    }
    public static void print(double price){
        System.out.println("Your Price : " + price);
    }
    public static void print(int[] x){
        System.out.println("Your Age as Array : " + Arrays.toString(x));
    }
    public static void print(double...x){
        System.out.println("Your Price as Array : " + Arrays.toString(x));
    }


}
