package ComparableAndComparator;
import java.util.Arrays;
import java.util.Comparator;

public class ComparableDEMO {
    public static void main(String[] args){
           Movies[] movies = new Movies[]{
                   new Movies("Bleach" , 9.0 , 2022),
                   new Movies("Re:Zero" , 8.3 , 2016),
                   new Movies("Attack on titan" , 9.1 , 2013),
                   new Movies("One piece" , 9.0 , 1999),
                   new Movies("Naruto" , 8.7 , 2007)

           };
           for(Movies ms : movies){
               System.out.println(ms);
           }
           System.out.println();
           System.out.println();


           System.out.println("=============== After Sort By Comparable ================");
            Arrays.sort(movies);
            for(Movies ms : movies){
                System.out.println(ms);
            }
            System.out.println();
            System.out.println();


            System.out.println("=============== After Sort By Comparator ================");
            Comparator<Movies> sortYears = new Comparator<Movies>() {
                @Override
                public int compare(Movies o1, Movies o2) {
                    return Integer.compare(o1.getYears() , o2.getYears());
                }
            };
            Arrays.sort(movies , sortYears);
            for(Movies ms : movies){
                System.out.println(ms);
            }

    }
}
