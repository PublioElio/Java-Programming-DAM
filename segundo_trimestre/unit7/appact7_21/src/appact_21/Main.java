package appact_21;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conjunto c = new Conjunto(7); // conjunto de prueba 1
        System.out.println(c.insertar(14));
        System.out.println(c.insertar(98));
        System.out.println(c.insertar(32));
        System.out.println(c.insertar(45));
        System.out.println(c.toString());
        Conjunto c2 = new Conjunto(7);
        System.out.println(c2.insertar(98));
        System.out.println(c2.insertar(32));
        System.out.println(c2.insertar(45));
        System.out.println(c2.toString());
        Conjunto c3 = Conjunto.diferencia(c, c2);
        System.out.println(c3.toString());

    }

}
