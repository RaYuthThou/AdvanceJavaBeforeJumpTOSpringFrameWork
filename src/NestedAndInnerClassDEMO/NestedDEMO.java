package NestedAndInnerClassDEMO;

class Outer{
//    Static it means not the instance value it as class
    static int outerStaticVar = 20;

    static class StaticNested{
        void display(){
            System.out.println("Outer static var:" + outerStaticVar);
        }
    }
}
public class NestedDEMO {
    public static void main(String[] args){
       Outer.StaticNested outer = new Outer.StaticNested();
       outer.display();
    }
}
