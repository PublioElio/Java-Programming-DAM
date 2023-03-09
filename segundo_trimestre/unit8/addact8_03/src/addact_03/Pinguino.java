package addact_03;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Pinguino extends Ave {

    private boolean estaNadando;

    public Pinguino(String nombre, double altura, double peso, double velocidad,
            int edad, String sexo) {
        super(nombre, altura, peso, velocidad, edad, sexo, false);
        this.estaNadando = false;
    }

    public void sumergirse() {
        if (!this.estaNadando) {
            this.estaNadando = true;
        }
    }

    public void salirDelAgua() {
        if (this.estaNadando) {
            this.estaNadando = false;
        }
    }

    public String atraparPescado() {
        String resultado;
        if (this.estaNadando) {
            resultado = this.getNombre() + " atrapó un pescado.";
        } else {
            resultado = "Antes tiene que meterse en el agua.";
        }
        return (resultado);
    }

    public boolean isEstaNadando() {
        return estaNadando;
    }
}
