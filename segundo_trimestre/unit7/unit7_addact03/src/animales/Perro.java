package animales;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Perro extends Mamifero {

    private String raza;

    public Perro(String nombre, double altura, double peso, double velocidad,
            int edad, String sexo, String raza) {
        super(nombre, altura, peso, velocidad, edad, sexo);
        this.raza = raza;
    }

    public Perro(String nombre, double altura, double peso, double velocidad,
            int edad, String sexo) {
        super(nombre, altura, peso, velocidad, edad, sexo);
        this.raza = "común";
    }

    public String ladrar() {
        return ("Guau.");
    }

    public String aullar() {
        return (this.getNombre() + " aúlla.");
    }

    public String marcarTerritorio() {
        return (this.getNombre() + " ha marcado el territorio.");
    }

    @Override
    public String toString() {
        return ("Este animal se llama: " + this.getNombre()
                + "\nMide: " + this.getAltura()
                + "m\nPesa: " + this.getPeso()
                + "kg\nAlcanza una velocidad máxima de: " + this.getVelocidad()
                + "km/h\nTiene " + this.getEdad()
                + " años\n¿Es una hembra?: " + this.isHEMBRA()
                + "\nEs de raza: " + this.getRaza());
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
