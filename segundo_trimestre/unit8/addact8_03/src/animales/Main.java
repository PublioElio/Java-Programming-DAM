package animales;

import java.util.Scanner;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // probando clase Animal
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a probar la clase animal: ");
        Animal cocodrilo = new Animal("Guancho", 3.3, 500,
                17, 10);
        System.out.println(cocodrilo.toString());
        double tamanyo = 0.25;
        int anyos = 2;
        int horas;
        cocodrilo.crecer(tamanyo);
        cocodrilo.envejecer(anyos);
        System.out.println("Si " + cocodrilo.getNombre() + " crece "
                + tamanyo + " m, pasará a medir " + cocodrilo.getAltura() + " m.");
        System.out.println("Si " + cocodrilo.getNombre() + " envejece "
                + anyos + " años, pasará a tener " + cocodrilo.getEdad() + " años.");
        System.out.print("¿Cuántas horas ha estado moviéndose "
                + cocodrilo.getNombre() + "? ");
        horas = sc.nextInt();
        System.out.println(cocodrilo.getNombre() + " se ha movido "
                + cocodrilo.moverse(horas) + " km.");

        // probando clase Mamífero
        System.out.println("\nVamos a probar la clase mamífero: ");
        Mamifero vaca = new Mamifero("Milka", 1.25, 600,
                40, 6, "HEMBRA");
        System.out.println(vaca.toString());
        System.out.print("¿Qué le das de comer a " + vaca.getNombre() + "? ");
        sc.nextLine();
        String comida = sc.nextLine();
        System.out.println(vaca.comer(comida));
        System.out.println(vaca.rascarse());
        System.out.println(vaca.amamantar());

        // probando clase Ave
        System.out.println("\nVamos a probar la clase ave: ");
        Ave aguila = new Ave("Eagly", 0.95, 7,
                120, 20, "macho", true);
        System.out.println(aguila.toString());
        System.out.println(aguila.ponerHuevo());
        System.out.println(aguila.mudarPlumas());
        aguila.despegar();
        System.out.println("¿" + aguila.getNombre() + " está en el suelo? "
                + aguila.isEnTierra());
        aguila.aterrizar();
        System.out.println("¿" + aguila.getNombre() + " está en el suelo? "
                + aguila.isEnTierra());

        // probando clase Gato
        System.out.println("\nVamos a probar la clase gato: ");
        Gato fritz = new Gato("Fritz", 0.23, 4,
                48, 6, "macho", "atigrado");
        System.out.println(fritz.toString());
        System.out.println(fritz.maullar());
        System.out.println(fritz.usarArenero());
        System.out.println(fritz.afilarseLasUnyas());

        // probando clase Perro
        System.out.println("\nVamos a probar la clase perro: ");
        Perro odie = new Perro("Odie", 0.56, 35,
                50, 6, "macho", "dálmata");
        System.out.println(odie.toString());
        System.out.println(odie.ladrar());
        System.out.println(odie.aullar());
        System.out.println(odie.marcarTerritorio());

        // probando clase Canario
        System.out.println("\nVamos a probar la clase canario: ");
        Canario piolin = new Canario("Piolin", 0.13, 0.03,
                15, 4, "hembra", "amarillo");
        System.out.println(piolin.toString());
        System.out.println(piolin.cantar());
        System.out.println(piolin.comerAlpiste());

        // probando clase Pingüino
        System.out.println("\nVamos a probar la clase pingüino: ");
        Pinguino skipper = new Pinguino("Skipper", 1.05, 43,
                40, 6, "macho");
        System.out.println(skipper.toString());
        skipper.sumergirse();
        System.out.println("¿" + skipper.getNombre() + " está en el agua? " 
                + skipper.isEstaNadando());
        skipper.salirDelAgua();
        System.out.println("¿" + skipper.getNombre() + " está en el agua? " 
                + skipper.isEstaNadando());
        System.out.println(skipper.atraparPescado());
    }

}
