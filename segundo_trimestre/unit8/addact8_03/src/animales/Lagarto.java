package animales;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Lagarto extends Animal {

    private boolean HEMBRA;

    public Lagarto(String nombre, double altura, double peso, double velocidad,
            int edad, String sexo) {
        super(nombre, altura, peso, velocidad, edad);
        this.HEMBRA = "hembra".equals(sexo.toLowerCase());
    }

    public String mudarPiel() {
        return (this.getNombre() + " acaba de mudar la piel.");
    }

    public String ponerHuevo() {
        String resultado;
        if (HEMBRA) {
            resultado = this.getNombre()
                    + " pone un huevo.";
        } else {
            resultado = this.getNombre()
                    + " es macho, no puede poner huevos.";
        }
        return (resultado);
    }

    public String sisear() {
        return (this.getNombre() + " sisea.");
    }

}
