package StaticKeyWord;

public class StaticDemoRun {
    public static void main(String[] args){
       Student s1 = new Student("Dara" , "male" , 12);
       Student s2 = new Student("Thida" , "female" , 10);

//       Initialized The value as a static use Name Class directly
        Student.numberoFStudent = 39;

//       System.out.println(s1.toString());
//       System.out.println(s2.toString());
        Student.print();


    }
}
