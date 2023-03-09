package appact_16;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto p = new Punto(-14, -16);
        Punto p1 = new Punto(5, 28);
        p.desplazaX(-5);
        System.out.println(p.toString());
        double distancia = p.distanciaEuclidea(p1);
        System.out.println(distancia);
    }

}
