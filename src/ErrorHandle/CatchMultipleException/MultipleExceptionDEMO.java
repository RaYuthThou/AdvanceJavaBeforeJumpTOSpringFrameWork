package ErrorHandle.CatchMultipleException;

public class MultipleExceptionDEMO {
    public static void main(String[] args){
        String[] name = {"dara" , "rith" , "Kunthea"};
        int x = 5;
        int y = 0;
        try{
            String name1 = name[3];
            int nums = x /y;
        }catch (RuntimeException e){
            e.printStackTrace();
        }
//        }catch (Exception e){
//            e.printStackTrace();
//        }


//      Multi Exception in catch Block
//        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
//            e.printStackTrace();
//        }

//            Multi Catch block
//        }catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//        }catch(ArithmeticException e){
//            e.printStackTrace();
//        }
            System.out.println("Finish Line");
    }
}
