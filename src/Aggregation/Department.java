package Aggregation;
import java.util.ArrayList;
import java.util.List;
public class Department {
    private String nameDepartment;
    private String building;
    private List<Teacher> teachers;

    public Department(String nameDepartment, String building, List<Teacher> teachers) {
        this.nameDepartment = nameDepartment;
        this.building = building;
        this.teachers = teachers;
    }
    public void displayInfoDepartment(){
        System.out.println("================= Department Information ================= ");
        System.out.println("Department Name : " + nameDepartment);
        System.out.println("Building : " + building);
        System.out.println("======================================================== ");
        System.out.println("================= Teacher Information ================= ");
        for(Teacher teacher : teachers){
            teacher.displayInfo();
        }
        System.out.println("======================================================== ");

    }
}
