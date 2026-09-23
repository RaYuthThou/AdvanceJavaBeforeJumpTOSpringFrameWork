package Association.BiderectionalType;

import java.util.List;

public class Course {

    private String courseName;
    private Student[] students;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public String getCourseName() {
        return courseName;
    }
}