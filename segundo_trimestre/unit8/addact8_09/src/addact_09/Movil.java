package addact_09;

import java.text.DecimalFormat;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Movil extends Terminal {

    private String tarifa;
    private double totalFactura;
    private final DecimalFormat formateador
            = new DecimalFormat("######0.00");

    public Movil(String numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa;
        this.totalFactura = 0;
    }

    public Movil(String numero) {
        super(numero);
        this.tarifa = "rata";
    }

    @Override
    public void llama(Terminal numero, int segundos) {
        this.setTotalSegundosAcumulados(this.getTotalSegundosAcumulados()
                + segundos);
        numero.setTotalSegundosAcumulados(numero.getTotalSegundosAcumulados()
                + segundos);

        this.totalFactura += (this.obtenerCosteTarifa()
                * ((double) segundos / 60));
    }

    private int obtenerCosteTarifa() {
        int coste;
        coste = switch (this.getTarifa()) {
            case "mono" ->
                12;
            case "bisonte" ->
                30;
            default ->
                6;
        };
        return (coste);
    }

    @Override
    public String toString() {
        return ("Nº " + this.getNumero() + " - "
                + this.getTotalSegundosAcumulados()
                + "s de conversación - tarificados "
                + formateador.format(this.totalFactura / 100) + " euros");
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
    }

}
