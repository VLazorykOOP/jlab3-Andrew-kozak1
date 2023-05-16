package lab3;
class OilAndGasCompany extends Organization {
    String type;

    public OilAndGasCompany(String name, String address, String type) {
        super(name, address);
        this.type = type;
    }

    public void Show() {
        super.Show();
        System.out.println("Type: " + type);
    }
}
