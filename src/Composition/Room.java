package Composition;

public class Room {
    private String type;
    private float area;

    public Room(String type, float area) {
        this.type = type;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Room{" +
                "type='" + type + '\'' +
                ", area=" + area +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}
