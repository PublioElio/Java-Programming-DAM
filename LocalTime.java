package localtime;

/**
 * Este programa imprime por consola la hora local
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class LocalTime {

    public static void main(String[] args) {
        java.time.LocalTime whatTimeIs = java.time.LocalTime.now();
        System.out.println("La hora del sistema es: " + whatTimeIs);
    } 
}
