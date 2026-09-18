package AbstractDemo;

public abstract class Language {
    private int year;
//    Constructure no have parameter
    protected Language(){
        this.year = 1200;
    }
//    Constructure with Parameter
    protected Language(int year){
        this.year = year;
    }
    protected abstract void display();
    public void info(){
        System.out.println("This Language is invented in " + year);
    }
}
