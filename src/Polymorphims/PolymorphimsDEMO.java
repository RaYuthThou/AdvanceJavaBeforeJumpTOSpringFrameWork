package Polymorphims;
class father
{
    public void role(){
        System.out.println("This is father class");
    }
}
class child
extends father{
//    Method overriding that run time polymorphism
    @Override
    public void role(){
        System.out.println("This is child class");
    }
}
class infor{
//    Compile time polymorphism
    private String email;
    private String password;
    private String name;
    private String age;
    private String location;
    public infor(){
        email = "not found";
        password = "not found";
        name = "not found";
        age = "not found";
        location = "not found";
    }
    public void information(String email , String password){
        this.email = email;
        this.password = password;
    }
    public void information(String name , String age , String location){
        this.name = name;
        this.age = age;
        this.location = location;
    }


   public void display(){
        System.out.println("[ " + name + "," + age + "," + location + ","
        + email + "," + password + "]");
   }
}



public class PolymorphimsDEMO {
    public static void main(String[] args) {
       infor info1 = new infor();
       info1.information("Thourayuth" , "18" , "Kompot");
       info1.information("Admin123@gmail.com" , "Admin123");
       info1.display();
    }
}
