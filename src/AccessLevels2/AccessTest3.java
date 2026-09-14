package AccessLevels2;
import AccessLevels.AccessingTest;
import AccessLevels.AccessingTest1;


// Class
public class AccessTest3  {

    private AccessingTest1 test = new AccessingTest1();

       public void Cat1(){
           test.Cat();
           System.out.println("This is Calling From AccessLevels2.");
       }

}
