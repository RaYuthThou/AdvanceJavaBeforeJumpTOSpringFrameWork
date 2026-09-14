package SchoolSystem;

public class ClassRoom {
    private final String name;
    private final String building;

    public ClassRoom(String name, String building) {
        this.name = name;
        this.building = building;
    }

    public void displayClassRoom() {
        System.out.println("========== Building Information ==========");
        System.out.println("Name     : " + name);
        System.out.println("Building : " + building);
        System.out.println("==========================================");
    }

    public String getName() {
        return name;
    }

    public String getBuilding() {
        return building;
    }
}
