package addact_12;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Publicacion {

    private final String ISBN;
    private final String TITULO;
    private final int ANYO_PUBLICACION;

    public Publicacion(String isbn, String titulo, int anyo_publicacion) {
        this.ISBN = isbn;
        this.TITULO = titulo;
        this.ANYO_PUBLICACION = anyo_publicacion;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTITULO() {
        return TITULO;
    }

    public int getANYO_PUBLICACION() {
        return ANYO_PUBLICACION;
    }

    @Override
    public String toString() {
        return ("ISBN: " + this.getISBN()
                + ", título: " + this.getTITULO()
                + ", año de publicacion: "
                + this.getANYO_PUBLICACION());
    }
}
