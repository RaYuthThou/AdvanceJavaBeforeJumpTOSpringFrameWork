package Aggregation;
import java.util.List;
import java.util.ArrayList;

public class AggregationDEMO {
    public static void main(String[] args){
        Teacher teacher1 =
                new Teacher("Dara", "25", "Java");

        Teacher teacher2 =
                new Teacher("Sokha", "30", "Database");

        List<Teacher> teachers = new ArrayList<>();

        teachers.add(teacher1);
        teachers.add(teacher2);

        Department department =
                new Department("IT", "Building A", teachers);

        department.displayInfoDepartment();

    }
}
