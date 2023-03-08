package animales;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Mamifero extends Animal {

    private boolean HEMBRA;

    public Mamifero(String nombre, double altura, double peso, double velocidad,
            int edad, String sexo) {
        super(nombre, altura, peso, velocidad, edad);

        this.HEMBRA = "hembra".equals(sexo.toLowerCase());

    }

    public String comer(String comida) {
        return (this.getNombre() + " está comiendo " + comida + ".");
    }

    public String amamantar() {
        String resultado;
        if (HEMBRA) {
            resultado = this.getNombre()
                    + " amamanta a sus crías, ¡qué escena más tierna!";
        } else {
            resultado = this.getNombre()
                    + " es macho, no puede amamantar a sus crías.";
        }
        return (resultado);
    }

    public String rascarse() {
        return (this.getNombre() + " se rasca.");
    }

    public boolean isHEMBRA() {
        return HEMBRA;
    }

    @Override
    public String toString() {
        return ("Este animal se llama: " + this.getNombre()
                + "\nMide: " + this.getAltura()
                + "m\nPesa: " + this.getPeso()
                + "kg\nAlcanza una velocidad máxima de: " + this.getVelocidad()
                + "km/h\nTiene " + this.getEdad()
                + " años\n¿Es una hembra?: " + this.HEMBRA);
    }

}
