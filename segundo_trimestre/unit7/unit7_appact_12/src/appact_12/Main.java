package appact_12;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QadraticCalc e = new QadraticCalc(-5, 2, 1);
        double[] res = e.getResult();
        System.out.println("Positive discriminant?: " + e.isPositiveDisc());
        System.out.println("First result: " + res[0] + "\nSecond result: " + res[1]);
        

    }

}
