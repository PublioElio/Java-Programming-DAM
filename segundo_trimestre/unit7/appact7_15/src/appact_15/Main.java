package appact_15;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendario cal = new Calendario(-222, 5, 31);
        Calendario cal2 = new Calendario(-222, 4, 31);
        System.out.println(cal.mostrar());
        cal.incrementarDia();
        System.out.println(cal.mostrar());
        cal.incrementarAnyo(500);
        System.out.println(cal.mostrar());
        System.out.println(cal.iguales(cal2));
    }
    
}
