package bank.account;

/**
 * This is an example of a class for a bank account
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class BankAccount {

    private String dni;
    private String holderName;
    private String bankName;
    private double balance;
    private Manager manager;

    BankAccount(String dni, String holderName, String bankName, Manager manager,
            double balance) {
        this.dni = dni;
        this.holderName = holderName;
        this.bankName = bankName;
        this.manager = manager;
        this.balance = balance;
    }

    BankAccount(String dni, String holderName) {
        this(dni, holderName, "Reinaissance Bank", null, 0);
    }

    boolean discharge(double amount) {
        boolean dischargeDone = amount < this.balance;
        if (dischargeDone) {
            this.balance -= amount;
        }
        return dischargeDone;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    String showInfo() {
        String s;
        if (this.manager == null) {
            s = "Bank name: " + this.bankName + "\nAccount holder: "
                    + this.holderName + "\nDNI: " + this.dni + "\nBalance: "
                    + this.balance;
        } else {
            s = "Bank name: " + this.bankName + "\nAccount holder: "
                    + this.holderName + "\nDNI: " + this.dni + "\nBalance: "
                    + this.balance + "\nManager: " + this.manager.getName();
        }
        return s;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

}
