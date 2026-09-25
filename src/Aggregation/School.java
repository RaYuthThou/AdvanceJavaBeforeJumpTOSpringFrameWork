package Aggregation;
import java.util.ArrayList;
import java.util.List;
public class School {
    private String name;
    private List<Student> students;

    public School(String name){
        this.name = name;
    }
    public void addStudent(List<Student> students){
        this.students = students;
    }
    public void displayStudent(){
        for(Student student : students){
            student.displayInfo();
        }
    }
}
