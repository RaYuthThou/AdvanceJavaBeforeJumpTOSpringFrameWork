package Association.BiderectionalType;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class BiderectionalDEMO {

    public static void main(String[] args) {


        Student[] students = new Student[]{
                new Student("Thou Rayuth"),
                new Student("Lom Povthida"),
                new Student("Thou Narong"),
                new Student("Soem Davy")
        };

        Course[] courses = new Course[]{
                new Course("Java Advance"),
                new Course("C# Basic"),
                new Course("Back-End Developer"),
                new Course("Front-End Developer")
        };
        for(Student student : students){
            student.setCourse(courses);
        }
        for(Course course : courses){
            course.setStudents(students);
        }


        System.out.println("===== Student -> Course =====");

        for (Student student : students) {

            System.out.println("\nStudent: " + student.getName());

            for (Course course : student.getCourse()) {

                System.out.println(
                        "Course: " + course.getCourseName()
                );
            }
        }

        System.out.println("\n===== Course -> Student =====");

        for (Course course : courses) {

            System.out.println("\nCourse: " + course.getCourseName());

            for (Student student : course.getStudents()) {

                System.out.println(
                        "Student: " + student.getName()
                );
            }
        }

    }
}