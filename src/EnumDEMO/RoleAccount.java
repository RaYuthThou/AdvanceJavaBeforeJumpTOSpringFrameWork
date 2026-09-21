package EnumDEMO;

public class RoleAccount {
    enum Role {
//      Enum String
        ADMIN("Administrator"),
        USER("Normal User"),
        MANAGER("Manager");
//        String variable
        private String description;

//        Enum Constructure
        Role(String description){
            this.description = description;
        }
    public String getRoleDescription(){ return this.description; }
    }
    public static void main(String[] args){
         Role role = Role.ADMIN;
         System.out.println("Role : " + role);
         System.out.println("Description : " + role.getRoleDescription());
    }
}
