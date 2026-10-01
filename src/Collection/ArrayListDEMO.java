package Collection;
import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListDEMO {
    public static void main(String[] args){
//        arrayList is implementation of List
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("vanna");
        namesList.add("rayuth");

        System.out.println(namesList);
//      Access and assign
        String name = namesList.get(1);
        System.out.println(name);
//        update
        namesList.set(1,"tena");
        System.out.println(namesList);
//        remove
        namesList.remove(0);
        System.out.println(namesList);

//        add from index
        namesList.add(0,"vanda");
        System.out.println(namesList);
//      size
        System.out.println(namesList.size());
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(70);
        nums.add(20);
        nums.add(90);
        nums.add(54);
        nums.add(32);
        System.out.println(nums);

        Comparator<Integer> sortNums = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        };
        nums.sort(sortNums);

        System.out.println();
        System.out.println("========= After Sort ============");
        System.out.println(nums);
        System.out.println();
        System.out.println("========= Clone Sort ============");
        ArrayList<Integer> nums1 = (ArrayList<Integer>) nums.clone();
        System.out.println(nums1);

        boolean exist = namesList.contains("tena");
        System.out.println(exist);



        System.out.println();

    }
}
