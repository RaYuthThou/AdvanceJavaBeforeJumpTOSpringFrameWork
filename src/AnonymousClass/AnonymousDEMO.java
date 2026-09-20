package AnonymousClass;

public class AnonymousDEMO {
    Shape shape = new Shape(){
        @Override
        public  void draw(){
           System.out.println("Drawing the Something");
        }
    };
    public void display(){
        shape.draw();
    }
    public static void main(String[] args){
            AnonymousDEMO anonymousDEMO = new AnonymousDEMO();
            anonymousDEMO.display();
    }
}
