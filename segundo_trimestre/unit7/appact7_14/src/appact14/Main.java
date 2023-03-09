package appact14;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cambio c = new Cambio();
        String cambio = c.calcularCambio(1.2);
        System.out.println(cambio);
    }
    
}
