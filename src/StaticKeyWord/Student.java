package StaticKeyWord;

public class Student {
    private String name;
    private String gender;
    private int grade;
    static int numberoFStudent;
    public Student(String name, String gender, int grade) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student[" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", grade=" + grade +
                ", Number of Student=" + numberoFStudent +
                ']';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public static void print(){
        System.out.println("Number of Student=" + numberoFStudent);
    }
}
