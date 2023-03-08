package terminales;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Terminal {

    private String numero;
    private int totalSegundosAcumulados;

    public Terminal(String numero) {
        this.numero = numero;
        this.totalSegundosAcumulados = 0;
    }

    public void llama(Terminal numero, int segundos) {
        this.totalSegundosAcumulados += segundos;
        numero.totalSegundosAcumulados += segundos;
    }

    @Override
    public String toString() {
        return ("Nº " + this.numero + " - " + this.totalSegundosAcumulados
                + "s de conversación");
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getTotalSegundosAcumulados() {
        return totalSegundosAcumulados;
    }

    public void setTotalSegundosAcumulados(int totalSegundosAcumulados) {
        this.totalSegundosAcumulados = totalSegundosAcumulados;
    }
}
