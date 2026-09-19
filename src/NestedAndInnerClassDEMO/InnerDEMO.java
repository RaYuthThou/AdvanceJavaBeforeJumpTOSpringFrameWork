package NestedAndInnerClassDEMO;
// ========   Regular Inner Class   ==========
class OuterTwo{
    private int OuterVar = 20;
//    This is like normal Value
    class Inner{
        void display(){
            System.out.println("Outer Var: " + OuterVar);
        }
    }
}
// ================================================
// ========   Local Inner Class   ==========
class OuterThree{
     public void outerMethod(){
         final int outerVar = 20;
//         Final because make it can change


         class LocalInner{
             void display(){
                 System.out.println("Outer Var : " + outerVar);
             }
         }
         LocalInner localInner = new LocalInner();
         localInner.display();
     }
}
// ================================================
// ========   Anonymous Inner Class   ==========
interface  Greeting{
    void sayHello();
}

public class InnerDEMO {
    public static void main(String[] args){
// ========   Regular Inner Class   ==========
//        OuterTwo outerTwo = new OuterTwo();
////      Note the Syntax
//        OuterTwo.Inner inner = outerTwo.new Inner();
//        inner.display();
// ================================================
// ============   Local Inner Class   ==========
//        OuterThree outerthree = new OuterThree();
//        outerthree.outerMethod();
// ================================================
     Greeting greeting = new Greeting() {
         @Override
         public void sayHello() {
             System.out.println("Hello World");
         }
     };
     greeting.sayHello();

     Runnable task = new Runnable() {
         @Override
         public void run() {
             System.out.println("Running in a thread...");
         }
     };
        new Thread(task).start();
    }
}
