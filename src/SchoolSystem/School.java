package SchoolSystem;

public class School {
    private final Student student;
    private final Teacher teacher;
    private final ClassRoom classRoom;
    private final Course course;

    public School(Student student, Teacher teacher, ClassRoom classRoom, Course course) {
        this.student = student;
        this.teacher = teacher;
        this.classRoom = classRoom;
        this.course = course;
    }
    public void displayInfo(){
        student.displayInfo();
        teacher.displayInfo();
        classRoom.displayClassRoom();
        course.displayInfo();
    }
}
