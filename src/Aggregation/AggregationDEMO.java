package Aggregation;
import java.util.List;
import java.util.ArrayList;

public class AggregationDEMO {
    public static void main(String[] args){
        Student student = new Student("1001" , "Thou rayuth");
        Student student1 = new Student("1002" , "Thou narong");
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);

        School school = new School("Rupp");
        school.addStudent(students);

        school.displayStudent();

    }
}
