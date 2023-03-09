package appact_17;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Main {

    public static void main(String[] args) {
        String texto = Cesar.cifrar(3, "Estos son mis principios, "
                + "si no le gustan, tengo otros.");
//        Cesar c = new Cesar(25, "A");
//        String texto = Cesar.cifrar(25, "A");
//        String frase = c.cifrar();
        System.out.println(texto);
    }

}
