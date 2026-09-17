package ManageEmployee;

public class Manager extends Employee {
    public Manager(String name , String age , double salary){
        super(name , age , salary);
    }
    @Override
    public void work(){
        System.out.println("Manager is working....");
    }
    public void ManagerWork(){
        System.out.println("Manager is mapping the people....");
    }

}
