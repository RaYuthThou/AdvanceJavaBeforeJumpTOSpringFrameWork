package SchoolSystem;

public class Student {
    private final String id;
    private final String name;
    private final String subject;
    private final String clasS;

    public Student(String id, String name, String subject, String clasS) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.clasS = clasS;
    }

    public void displayInfo() {
        System.out.println("========== Student Information ==========");
        System.out.println("ID      : " + id);
        System.out.println("Name    : " + name);
        System.out.println("Subject : " + subject);
        System.out.println("Class   : " + clasS);
        System.out.println("=========================================");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getClasS() {
        return clasS;
    }
}
