package Composition;

public class CompositionDEMO {
    public static void main(String[] args) {
        House house = new House("Thourayuth" , "3" , "Kompot proving");
        house.addRoom("Living Room", 30);
        house.addRoom("Bedroom", 20);
        house.addRoom("Kitchen", 15);

        house.show();
    }
}
