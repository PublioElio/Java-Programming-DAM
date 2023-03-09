package bank.account;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Manager {

    private String name;
    private String phone;
    private double maxAmount;

    Manager(String name, String phone, double maxAmount) {
        this.name = name;
        this.phone = phone;
        this.maxAmount = maxAmount;
    }

    Manager(String name, String phone) {
        this(name, phone, 10_000);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public double getMaximumAuthorizedAmount() {
        return maxAmount;
    }

    public void setMaximumAuthorizedAmount(double maximumAuthorizedAmount) {
        this.maxAmount = maximumAuthorizedAmount;
    }

}
