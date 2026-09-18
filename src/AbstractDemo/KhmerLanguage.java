package AbstractDemo;

public abstract class KhmerLanguage extends Language{
    public KhmerLanguage()
    {
        super(100);
    }
    public KhmerLanguage(int years){
        super(years);
    }
//    another Abstract class
    @Override
    public void display(){
        System.out.println("This is in Khmer Languages Class");
    }
}
