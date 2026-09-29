package Association.UndirectionalType;

public class Person {
    private String name;
    private String age;
    private Passport passport;
    public Person(String name, String age , Passport passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }
    public void displayInfo(Passport passport){
        System.out.println("Name :" + name
                          +"Age :" + age);
        System.out.println("========================================");
        System.out.println();
        passport.displayInfo();
    }
}
