package appact14;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Cambio {

    private final double[] MONEDAS = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5,
        0.20, 0.10, 0.05, 0.02, 0.01};

    public Cambio() {
    }

    public String calcularCambio(double cantidad) {
        double[] desgloseCantidad = new double[15];
        cantidad = cantidad < 0 ? 0 : cantidad;
        String devolucion = "Hay que devolver: ";
        String billete, moneda;

        for (int i = 0; i < MONEDAS.length; i++) {
            if (cantidad >= MONEDAS[i]) {
                desgloseCantidad[i] = Math.floor(cantidad / MONEDAS[i]);
                cantidad -= (desgloseCantidad[i] * MONEDAS[i]);
            }
        }

        for (int i = 0; i < MONEDAS.length; i++) {
            if (desgloseCantidad[i] > 0) {
                billete = desgloseCantidad[i] > 1 ? "billetes" : "billete";
                moneda = desgloseCantidad[i] > 1 ? "monedas" : "moneda";
                if (MONEDAS[i] > 2) {
                    devolucion += (int) desgloseCantidad[i] + " " + billete
                            + " de " + (int) MONEDAS[i] + "€, ";
                } else if (MONEDAS[i] >= 1) {
                    devolucion += (int) desgloseCantidad[i] + " " + moneda
                            + " de " + (int) MONEDAS[i] + "€, ";
                } else {
                    devolucion += (int) desgloseCantidad[i] + " " + moneda
                            + " de " + MONEDAS[i] + "€, ";
                }
            }
        }
        return (devolucion);
    }
}
