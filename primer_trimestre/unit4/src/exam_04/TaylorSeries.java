package exam_04;

/**
 * This program calculates the Taylor series of a given number
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class TaylorSeries {

    /**
     * Esta función calcula la potencia de un número
     *
     * @param base el número al que queremos calcular la potencia
     * @param exponente el número al que es elevada la base
     * @return la base elevada al exponente
     */
    static double potencia(double base, double exponente) {
        double resultado = 1;
        if (exponente == 0) {
            resultado = 1;
        } else {
            for (int i = 1; i <= exponente; i++) {
                resultado *= base;
            }
        }
        return (resultado);
    }

    /**
     * Esta funcion calcula el factorial de un número
     *
     * @param numero
     * @return el factorial del número recibido como parámetro
     */
    static double factorial(double numero) {
        double factorial = 1;
        if (numero >= 2) {
            while (numero >= 1) {
                factorial *= numero;
                numero--;
            }
        }
        return (factorial);
    }

    /**
     * Esta función calcula el exponencial de un número
     *
     * @param numero
     * @param precision el número de veces que ha de realizarse una serie de
     * Taylor
     * @return
     */
    static double exponencial(double numero, double precision) {
        double resultado = 1;
        for (int incremento = 1; incremento <= precision; incremento++) {
            resultado += series(numero, incremento);
        }
        return (resultado);
    }

    /**
     * Esta función calcula la serie de Taylor
     *
     * @param numero
     * @param incremento será la potencia a la que es elevada el número recibido
     * como parámetro y el factorial que dividirá el resultado de la potencia
     * @return el resultado de una serie
     */
    static double series(double numero, double incremento) {
        return (potencia(numero, incremento)
                / factorial(incremento));
    }

    public static void main(String[] args) {

        for (int precision = 1; precision <= 10; precision++) {

            System.out.println("\n\n-- PRECISION " + precision + " --");
            System.out.printf("Con precision " + precision + 
                    " el e elevado a 1 es: " + exponencial(1, precision));
            System.out.printf("\nCon precision " + precision +
                    " el e elevado a 2 es: " + exponencial(2, precision));
            System.out.printf("\nCon precision " + precision +
                    " el e elevado a 5 es: " + exponencial(5, precision));
        }
    }

}
