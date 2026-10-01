package ErrorHandle;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class checkException {
    public static void main(String[] args){
//        RuntimeException is uncheck exception
//        IOEXCEPTION is checked exception
        try{
          File file = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Java Project\\product.txt.txt");
          Scanner scanner = new Scanner(file);
          while(scanner.hasNext()){
              System.out.println(scanner.nextLine());
          }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
