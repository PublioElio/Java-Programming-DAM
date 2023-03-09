package appact_16;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this(0.0, 0.0);
    }

    public void desplazaX(double dx) {
        setX(x + dx);
    }

    public void desplazaY(double dy) {
        setY(y + dy);
    }

    public void desplaza(double dx, double dy) {
        desplazaX(dx);
        desplazaY(dy);
    }

    public double distanciaEuclidea(Punto otro) {
        return (Math.sqrt(Math.pow((x - otro.x), 2) + 
                Math.pow((y - otro.y), 2)));
    }

    @Override
    public String toString() {
        String s = "x = " + x + " y = " + y;
        return (s);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}
