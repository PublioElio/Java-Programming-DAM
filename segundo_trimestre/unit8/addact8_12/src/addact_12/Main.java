package addact_12;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro("123456", "La Ruta Prohibida", 
                2007);
        Libro libro2 = new Libro("112233", "Los Otros", 
                2016);
        Libro libro3 = new Libro("456789", "La rosa del mundo", 
                1995);
        Revista revista1 = new Revista("444555", "Año Cero", 
                2019, 344);
        Revista revista2 = new Revista("002244", 
                "National Geographic", 2003, 255);
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
        System.out.println(revista1.toString());
        System.out.println(revista2.toString());
        libro2.presta();
        if (libro2.estaPrestado()) {
            System.out.println("El libro está prestado");
        }
        libro2.presta();
        libro2.devuelve();
        if (libro2.estaPrestado()) {
            System.out.println("El libro está prestado");
        }
        libro3.presta();
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
    }

}
