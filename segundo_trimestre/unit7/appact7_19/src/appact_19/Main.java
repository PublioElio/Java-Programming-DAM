package appact_19;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila c = new Pila();
        c.push(2);
        c.push(487);
        c.push(8975);
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
    }

}
