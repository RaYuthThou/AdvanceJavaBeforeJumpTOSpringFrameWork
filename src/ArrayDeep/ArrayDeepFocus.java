package ArrayDeep;
import java.util.Arrays;

public class ArrayDeepFocus {

// How to initialize Array in Java
//    1. int[] a = new int[size];
//    2. int[] a = {1,2,3,4};
//    3. int[] a = new int[]{1,2,3,4};
/*
* Output Array Method in Java
* 1 . Method Array[].toString()
* */
//    Array[].toString()
    public void arrayDisplay1(int[] x){
        if(x == null){
            return;
        }
        System.out.println(Arrays.toString(x));
    }
//    from Index
    public void arrayDisplay2(int[] x){
        for(int i=0; i<x.length; i++){
            System.out.println("\n" + x[i]);
        }
    }
//    from for each loop
    public void arrayDisplay3(int[] x){
        for(int a : x){
            System.out.println("\n" + a );
        }
    }
}
