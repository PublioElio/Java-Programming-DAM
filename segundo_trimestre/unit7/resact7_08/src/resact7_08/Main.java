package resact7_08;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FMTurner test = new FMTurner();
        System.out.println(test.display());
        test.down();
        System.out.println(test.display());
    }

}
