package AbstractDemo;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Animal can eat..");
    }

    public abstract void makeSound();

    public void display()
    {
        System.out.println("Name : " + name + "Age : " + age);
    }

}

