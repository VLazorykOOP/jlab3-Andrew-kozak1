package lab3;
class InsuranceCompany extends Organization {
    int numberOfPolicies;

    public InsuranceCompany(String name, String address, int numberOfPolicies) {
        super(name, address);
        this.numberOfPolicies = numberOfPolicies;
    }

    public void Show() {
        super.Show();
        System.out.println("Number of policies: " + numberOfPolicies);
    }
}
