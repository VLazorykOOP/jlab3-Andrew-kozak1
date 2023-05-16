package lab3;
class Organization {
    String name;
    String address;

    public Organization(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void Show() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
