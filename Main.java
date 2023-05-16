package lab3;
public class Main {
    public static void main(String[] args) {
        // Створюємо масив типу базового класу
        Organization[] organizations = new Organization[3];

        // Створюємо об'єкти для кожного класу і додаємо їх до масиву
        InsuranceCompany insuranceCompany = new InsuranceCompany("AIG", "New York", 500);
        organizations[0] = insuranceCompany;

        OilAndGasCompany oilAndGasCompany = new OilAndGasCompany("Shell", "London", "Oil");
        organizations[1] = oilAndGasCompany;

        Factory factory = new Factory("Toyota", "Japan", 10000);
        organizations[2] = factory;

        // Друк масиву з використанням методу Show()
        for (Organization organization : organizations) {
            organization.Show();
            System.out.println();
        }
    }
}
