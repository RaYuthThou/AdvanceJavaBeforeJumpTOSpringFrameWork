package Composition;
import java.util.ArrayList;
import java.util.List;

public class House {
        private String ownerName;
        private String numberOfFloat;
        private String address;
        private List<Room> rooms;

    public House(String ownerName, String numberOfFloat, String address) {
        this.ownerName = ownerName;
        this.numberOfFloat = numberOfFloat;
        this.address = address;
        this.rooms = new ArrayList<>();
    }
    public void addRoom(String type , float area) {
        rooms.add(new Room(type , area));
    }
    public float getTotalArea(){
        float total = 0;

        for(Room room : rooms){
            total +=room.getArea();
        }
        return total;
    }
    public void show() {
        System.out.println("House at " + address);
        System.out.println("Owner Name " + ownerName);
        System.out.println("Number of Floor " + numberOfFloat);
        for (Room room : rooms) {
            System.out.println(" - " + room.toString());
        }
        System.out.println("Total area: " + getTotalArea() + " m²");
    }

}

