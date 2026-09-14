package AccessLevels;

//    [ Public Accessing ]
//    Same Package ✅ (How it looks like )


// =================================================
// =================================================
//   [ Method 1 ]
// Take all function from class extends that set as protected and public
public class AccessingTest1 extends AccessingTest {

//    Override on the function that already exist
    @Override
    public void Animal(){
        System.out.println("This is Override on Animal Method");
    }

    public void Cat(){
        Animal();
        System.out.println("Cat is a Animal so they can Eating So....");
    }

    protected String name = "C Cat";
    protected void Display(){
        System.out.println("My Name is : " + name + "and");
        showAge();
        System.out.println("My School is : " + school);
    }

}



//    [ Method 2 ]

// This is a bad method bro i
// Take function which one you want to use in new class you import
//public class AccessingTest1{
//
//    AccessingTest ts = new AccessingTest();
//    public void Dog(){
//        System.out.println("Dog is "); ts.Animal();
//    }
//}

// =================================================
// =================================================
