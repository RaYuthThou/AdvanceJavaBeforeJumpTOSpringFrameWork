package SchoolSystem;

public class Course {
    private final String shortCourse;

    public Course(String shortCourse) {
        this.shortCourse = shortCourse;
    }
    public void displayInfo() {
        System.out.println("========== Course Information ==========");
        System.out.println("Course      : " + shortCourse);
        System.out.println("=========================================");
    }

}
