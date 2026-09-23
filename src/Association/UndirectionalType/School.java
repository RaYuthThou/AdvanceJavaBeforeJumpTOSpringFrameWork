package Association.UndirectionalType;
import java.util.List;
import java.util.ArrayList;

public class School {
//    Attribute
    private String nameSchool;
    private List<Student> students;

    public School(String nameSchool){
        this.nameSchool = nameSchool;
    }
    public String getNameSchool(){
        return this.nameSchool;
    }
    public void setStudents(List<Student> students){
        this.students = students;
    }
    public List<Student> getStudents(){
        return this.students;
    }
}
