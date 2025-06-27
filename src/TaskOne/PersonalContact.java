package TaskOne;

public class PersonalContact extends Contact {

    public String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PersonalContact(String name, int phoneNumber, String mail, String address) {
        super(name, phoneNumber, mail);
        this.address = address;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println( " " + address);
    }
}
