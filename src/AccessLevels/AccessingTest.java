package AccessLevels;


public class AccessingTest {


//    [ Public Accessing ]
//    Same Class ✅ (How it looks like )


    public void Animal(){
        System.out.println("Animal.");
    }

    protected String age = "20";
    String school = "Rupp";
    protected void showAge(){
        System.out.println("My age is : " + age);
//        This is Same Class
//        System.out.println("My School is : " + school);
    }



//    =======================================
//    =======================================


}

