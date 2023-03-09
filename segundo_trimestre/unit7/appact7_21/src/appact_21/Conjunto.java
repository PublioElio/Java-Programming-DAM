package appact_21;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Conjunto {

    private int numElementos;
    private int[] conjunto;

    public Conjunto(int tamanyo) {
        tamanyo = tamanyo > 0 ? tamanyo : 10;
        this.conjunto = new int[tamanyo];
        this.numElementos = 0;
    }

    public Conjunto() {
        this(10);
    }

    public boolean pertenece(int num) {
        boolean pertenece = false;
        for (int i = 0; i < numElementos && !pertenece; i++) {
            pertenece = conjunto[i] == num;
        }
        return (pertenece);
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < numElementos; i++) {
            s += conjunto[i] + ", ";
        }
        return (s);
    }

    public int numeroElementos() {
        return (numElementos);
    }

    public boolean insertar(int nuevo) {
        boolean insertado = false;
        if (!pertenece(nuevo)) {
            conjunto[numElementos] = nuevo;
            numElementos++;
            insertado = true;
        }
        return (insertado);
    }

    public boolean insertar(Conjunto otro) {
        boolean insertado = false;
        if ((otro.numElementos + this.numElementos) <= conjunto.length) {
            insertado = true;
            for (int i = 0; i < otro.numElementos && insertado; i++) {
                insertado = insertar(otro.conjunto[i]);
            }
        }
        return (insertado);
    }

    public boolean eliminarElemento(int elemento) {
        boolean eliminado = false;
        for (int i = 0; i < numElementos; i++) {
            if (conjunto[i] == elemento) {
                if (i != conjunto.length - 1) {
                    conjunto[i] = conjunto[i + 1];
                    elemento = conjunto[i];
                }
                eliminado = true;
            }
        }
        numElementos = eliminado ? numElementos - 1 : numElementos;
        return (eliminado);
    }

    private int contarRepetidos(Conjunto otro) {
        int repetidos = 0;
        for (int i = 0; i < otro.numElementos; i++) {
            repetidos = pertenece(otro.conjunto[i]) ? repetidos + 1 : repetidos;
        }
        return (repetidos);
    }

    public boolean eliminarConjunto(Conjunto otro) {
        boolean eliminado = false;
        if (otro.numElementos <= numElementos) {
            for (int i = 0; i < otro.numElementos; i++) {
                eliminado = eliminarElemento(otro.conjunto[i]);
            }
        }
        return (eliminado);
    }

    public static boolean incluido(Conjunto c1, Conjunto c2) {
        return (c2.contarRepetidos(c1) == c1.numElementos);
    }

    public static Conjunto union(Conjunto c1, Conjunto c2) {
        int tamanyoNuevo = c1.numElementos + (c2.numElementos 
                - c1.contarRepetidos(c2));
        Conjunto nuevo = new Conjunto(tamanyoNuevo);
        nuevo.insertar(c1);
        for (int i = 0; i < c2.numElementos; i++) {
            nuevo.insertar(c2.conjunto[i]);
        }
        return (nuevo);
    }

    public static Conjunto interseccion(Conjunto c1, Conjunto c2) {
        Conjunto nuevo = new Conjunto(c1.contarRepetidos(c2));
        for (int i = 0; i < c1.numElementos; i++) {
            if (c2.pertenece(c1.conjunto[i])) {
                nuevo.insertar(c1.conjunto[i]);
            }
        }
        return (nuevo);
    }

    public static Conjunto diferencia(Conjunto c1, Conjunto c2) {
        Conjunto nuevo = union(c1, c1);
        nuevo.eliminarConjunto(c2);
        return (nuevo);
    }
}
