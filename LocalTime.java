package localtime;

/**
 * This program prints the local time by console
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class LocalTime {

    public static void main(String[] args) {
        java.time.LocalTime whatTimeIs = java.time.LocalTime.now();
        System.out.println("System local time is: " + whatTimeIs);
    } 
}
