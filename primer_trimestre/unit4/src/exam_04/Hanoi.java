package exam_04;

/**
 * Este programa imprime por pantalla los pasos para completar la torre de Hanoi
 * mediante recursividad
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Hanoi {

    static void hanoi(int numDiscos, String origen, String auxiliar, String destino) {
        if (numDiscos == 1) {
            System.out.println("Pasa el disco de " + origen + "a" + destino);
        } else {
            hanoi(numDiscos - 1, origen, destino, auxiliar);
            System.out.println("Pasa el disco de " + origen + "a" + destino);
            hanoi(numDiscos - 1, auxiliar, origen, destino);
        }

    }

    public static void main(String[] args) {
        hanoi(4, "A", "B", "C");

    }

}
