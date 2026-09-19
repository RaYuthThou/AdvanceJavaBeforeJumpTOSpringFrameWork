package InstandOfOperator;
class parent
{

}

class child extends parent
{

}
public class instandOfOperatorDEMO {
    public static void main(String[] args)
    {
//       child is a class and cobj is instance value of class child
        child cobj = new child();
        if(cobj instanceof child ){
            System.out.println("cobj is instance of child");
        }else{
            System.out.println("cobj is not instance of child");
        }
//      Can compare to the parent althougt you extends from parent class
        if(cobj instanceof parent){
            System.out.println("cobj is instance of parent");
        }else{
            System.out.println("cobj is not instance of parent");
        }
        if(cobj instanceof Object){
            System.out.println("cobj is instance of Object");
        }else{
            System.out.println("cobj is not instance of Object");
        }
//        actual is child so it true
        parent pobj = new child();

        if(pobj instanceof child){
            System.out.println("pobj is instance of child");
        }else{
            System.out.println("pobj is not instance of child");
        }

        parent pobj1 = new parent();
        if(pobj1 instanceof child){
            System.out.println("pobj is instance of child");
        }else{
            System.out.println("pobj is not instance of child");
        }
    }
}
