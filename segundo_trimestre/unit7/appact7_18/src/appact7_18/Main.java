package appact7_18;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola c = new Cola();
        c.push(2);
        c.push(584);
        c.push(255);
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
    }
    
}
