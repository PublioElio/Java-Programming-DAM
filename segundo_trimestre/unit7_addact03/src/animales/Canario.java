package animales;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Canario extends Ave {

    private String color;

    public Canario(String nombre, double altura, double peso, double velocidad,
            int edad, String sexo, String color) {
        super(nombre, altura, peso, velocidad, edad, sexo, true);
        this.color = color;
    }

    public Canario(String nombre, double altura, double peso, double velocidad,
            int edad, String sexo) {
        super(nombre, altura, peso, velocidad, edad, sexo, true);
        this.color = "amarillo";
    }

    public String cantar() {
        return ("Pio.");
    }

    public String comerAlpiste() {
        return (this.getNombre() + " come alpiste.");
    }

    @Override
    public String toString() {
        return ("Este animal se llama: " + this.getNombre()
                + "\nMide: " + this.getAltura()
                + "m\nPesa: " + this.getPeso()
                + "kg\nAlcanza una velocidad máxima de: " + this.getVelocidad()
                + "km/h\nTiene " + this.getEdad()
                + " años\n¿Es una hembra?: " + this.isHEMBRA()
                + "\nEs de color: " + this.getColor());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
