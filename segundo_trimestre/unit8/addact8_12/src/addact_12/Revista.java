package addact_12;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Revista extends Publicacion {

    private int num;

    public Revista(String isbn, String nombre, int anyo_publicacion, int num) {
        super(isbn, nombre, anyo_publicacion);
        this.num = num;
    }
}
