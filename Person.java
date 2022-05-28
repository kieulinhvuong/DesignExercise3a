public class Person {
    private String name;
    private int phoneNumber;
    private int homeNumber;
    private int officeNumber;

    public Person (String name, int phoneNumber, int homeNumber, int officeNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.homeNumber = homeNumber;
        this.officeNumber = officeNumber;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public String toString() {
        return String.format("%s, phone number: %d, home number: %d, office number: %d", 
        name, phoneNumber, homeNumber, officeNumber);
    }
}
