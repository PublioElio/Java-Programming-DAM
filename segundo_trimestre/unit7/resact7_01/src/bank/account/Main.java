package bank.account;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Main {

    public static void main(String[] args) {
        // inyección de dependencia
        Manager manager = new Manager("Sam Raimi", "358358358");
        BankAccount test = new BankAccount("78958758P",
                "Bruce Campbell", "Blumhouse Bank", manager,
                800);
        BankAccount test2 = new BankAccount("69857482R",
                "John Carpenter");

        System.out.println(test.showInfo());
        System.out.println(test2.showInfo());

    }

}
