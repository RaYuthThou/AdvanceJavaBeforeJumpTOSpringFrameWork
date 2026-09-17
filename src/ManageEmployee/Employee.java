package ManageEmployee;

public class Employee {
    protected String name;
    protected String age;
    protected double salary;

    public Employee(String name, String age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void work(){
        System.out.println("Employee is working......");
    }
    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age  + " Years old");
        System.out.println("Salary : $" + this.salary);
    }
// Getter
    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
//    Setter

    public void setAge(String age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
