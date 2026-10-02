package ErrorHandle.throwAndthorws;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class throwsDEMO {
    public static void main(String[] args){
//        if it as checked exception should me mute the thorw at the {
//        can if it not can use throw with new operator
//        if u use the checked exception in must me declare the throws at the first

//        if you are not it will be error immediately

         try{
             readFile1();
         }catch (FileNotFoundException e){
             e.printStackTrace();
             System.out.println(" >> file is not found <<");
         }
    }
    public static void readFile(){
        File file = new File("C:\\Users\\Admin\\OneDrive\\Destop\\Java Project\\product.txt.txt");
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("File not found");
        }

    }
    public static void readFile1() throws FileNotFoundException {
//        Write this style is easy to read , maintain
//
        File file = new File("C:\\Users\\Admin\\OneDrive\\Destop\\Java Project\\product.txt.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }


    }
}
