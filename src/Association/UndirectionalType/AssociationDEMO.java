package Association.UndirectionalType;
import java.util.ArrayList;
import java.util.List;

public class AssociationDEMO {
       public static void main(String[] args){
           Student student1 = new Student("Thou Rayuth");
           Student student2 = new Student("Rop Lina");

           List<Student> Students = new ArrayList<>();
           Students.add(student1);
           Students.add(student2);
           School school = new School("Hun Sen Sekkong");
           school.setStudents(Students);

           for(Student student : school.getStudents()){
               System.out.println(student.getName()
                       + " belongs to bank "
                       + school.getNameSchool());
           }

       }

}
