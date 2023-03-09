package addact_03;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Ave extends Animal {

    private boolean HEMBRA;
    private boolean puedeVolar;
    private boolean enTierra;

    public Ave(String nombre, double altura, double peso, double velocidad,
            int edad, String sexo, Boolean puedeVolar) {
        super(nombre, altura, peso, velocidad, edad);

        this.HEMBRA = "hembra".equals(sexo.toLowerCase());
        this.puedeVolar = puedeVolar;

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

    public String mudarPlumas() {
        return (this.getNombre() + " acaba de mudar las plumas.");
    }

    public void despegar() {
        if (puedeVolar && enTierra) {
            this.enTierra = false;
        }
    }

    public void aterrizar() {
        if (!this.enTierra) {
            this.enTierra = true;
        }
    }

    @Override
    public String toString() {
        return ("Este animal se llama: " + this.getNombre()
                + "\nMide: " + this.getAltura()
                + "m\nPesa: " + this.getPeso()
                + "kg\nAlcanza una velocidad máxima de: " + this.getVelocidad()
                + "km/h\nTiene " + this.getEdad()
                + " años\n¿Es una hembra?: " + this.isHEMBRA()
                + "\n¿Puede volar? " + this.isPuedeVolar());
    }

    public boolean isHEMBRA() {
        return HEMBRA;
    }

    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    public boolean isEnTierra() {
        return enTierra;
    }

}
