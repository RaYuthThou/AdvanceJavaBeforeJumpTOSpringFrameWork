package Association.UndirectionalType;
import java.util.ArrayList;
import java.util.List;

public class AssociationDEMO {
    public static void main(String[] args) {
             Passport passport = new Passport("E392334" , "Cambodia" , "2030.07.19");
             Person person = new Person("Thou rayuth" , "21" , passport);
             person.displayInfo(passport);
    }
}
