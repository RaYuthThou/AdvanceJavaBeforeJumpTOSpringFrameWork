package ErrorHandle;

public class ExceptionDEMO {
    public static void main(String[] args){
        int x = 56;
        int y = 2;
//        This is unchecked exception
        System.out.println("First line");
        try{
            System.out.println("Before Result");
            int nums = x / y;
            System.out.println(nums);
            return;
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurred");
        } finally {
            System.out.println("This is at the end");
        }

        System.out.println("Second line");
    }
}
