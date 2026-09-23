package Association.BiderectionalType;
import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;

public class Student {
    private String name;
    private Course[] courses;

    public Student(String name) {
        this.name = name;
    }
    public void setCourse(Course[] courses){
        this.courses = courses;
    }
    public Course[] getCourse(){
        return this.courses;
    }
    public String getName() {
        return name;
    }
}
