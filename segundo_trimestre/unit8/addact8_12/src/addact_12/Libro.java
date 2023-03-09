package addact_12;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Libro extends Publicacion implements Prestable {

    private boolean prestado;

    public Libro(String isbn, String nombre, int anyo_publicacion) {
        super(isbn, nombre, anyo_publicacion);
        this.prestado = false;
    }

    @Override
    public void presta() {
        if (!this.prestado) {
            this.prestado = true;
        }
    }

    @Override
    public void devuelve() {
        this.prestado = false;
    }

    @Override
    public boolean estaPrestado() {
        return this.prestado;
    }

    @Override
    public String toString() {
        String situacion = this.prestado ? "(prestado)" : "(no prestado)";
        return ("ISBN: " + this.getISBN()
                + ", título: " + this.getTITULO()
                + ", año de publicacion: "
                + this.getANYO_PUBLICACION() + " " + situacion);
    }

}
