package TaskOne;

public class Contact {

    private String name;

    private int phoneNumber;

    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String mail) {
        this.email = mail;
    }

    public Contact(String name, int phoneNumber, String mail) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = mail;
    }

    public void displayInfo() {
        System.out.print(name + " " + phoneNumber + " " + email);
    }
}
