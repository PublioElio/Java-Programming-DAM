package animales;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Animal {

    private String nombre;
    private double altura;
    private double peso;
    private int edad;
    private double velocidad;

    public Animal(String nombre, double altura, double peso, double velocidad,
            int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.velocidad = velocidad;
        this.edad = edad;
    }

    public Animal(String nombre, double altura, double peso, double velocidad) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.velocidad = velocidad;
        this.edad = 0;
    }

    public void crecer(double tamanyo) {
        this.altura += tamanyo;
    }

    public void envejecer(int anyos) {
        this.edad += anyos;
    }

    public double moverse(int horas) {
        return (this.velocidad * (int) horas);
    }

    @Override
    public String toString() {
        return ("Este animal se llama: " + this.nombre
                + "\nMide: " + this.altura
                + "m\nPesa: " + this.peso
                + "kg\nAlcanza una velocidad máxima de: " + this.velocidad
                + "km/h\nTiene " + this.edad + " años\n");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
}
