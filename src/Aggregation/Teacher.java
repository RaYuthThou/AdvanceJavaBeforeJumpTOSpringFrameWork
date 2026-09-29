package Aggregation;

public class Teacher {
    private String name;
    private String age;
    private String subject;

    public Teacher(String name, String age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }
    public void displayInfo(){

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Subject : " + subject);

    }
}
