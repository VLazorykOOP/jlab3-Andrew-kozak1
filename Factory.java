package lab3;
class Factory extends Organization {
    int numberOfEmployees;

    public Factory(String name, String address, int numberOfEmployees) {
        super(name, address);
        this.numberOfEmployees = numberOfEmployees;
    }

    public void Show() {
        super.Show();
        System.out.println("Number of employees: " + numberOfEmployees);
    }
}
