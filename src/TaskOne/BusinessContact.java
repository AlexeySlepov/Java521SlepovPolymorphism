package TaskOne;

public class BusinessContact extends Contact {

    public String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public BusinessContact(String name, int phoneNumber, String mail, String companyName) {
        super(name, phoneNumber, mail);
        this.companyName = companyName;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println( " " + companyName);
    }
}
