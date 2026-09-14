package Composition;
import java.util.ArrayList;
import java.util.List;

public class House {

    private class room{
        private String roomName;

        public room(String roomName){
            this.roomName = roomName;
        }

        public void display(){
            System.out.println("Room Name : " + this.roomName);
        }

    }
    private List<room> rooms = new ArrayList<>();
    public void addRoom(String roomName){
        rooms.add(new room(roomName));
    }
    public void DisplayRoom(){
        for(room Room : rooms){
            Room.display();
        }
    }

}

