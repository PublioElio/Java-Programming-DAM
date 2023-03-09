package resactf7_11;

import java.util.Arrays;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Lista {

    private Integer[] tabla;

    public Lista() {
        tabla = new Integer[0];
    }

    public int contarElementos() {
        return (tabla.length);
    }

    public void insertarInicio(Integer elemento) {
        tabla = Arrays.copyOf(tabla, +1);
        System.arraycopy(tabla, 0, tabla, 1, 
                tabla.length - 1);
    }
}
