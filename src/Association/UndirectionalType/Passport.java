package Association.UndirectionalType;

public class Passport {
    private String passportsNumber;
    private String country;
    private String issueDate;

    public Passport(String passportsNumber, String country, String issueDate) {
        this.passportsNumber = passportsNumber;
        this.country = country;
        this.issueDate = issueDate;
    }
    public void displayInfo(){
        System.out.println("Passports Number : " + passportsNumber +
                           "Country : " + country +
                           "Issue Date : " + issueDate);
    }
}
