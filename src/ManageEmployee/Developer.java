package ManageEmployee;

public class Developer  extends Employee{
    public Developer(String name , String age , double salary){
        super(name , age , salary);
    }
    @Override
    public void work(){
        System.out.println("Developer is working....");
    }
    public void writeCode(){
        System.out.println("Developer is writing java....");
    }
}
