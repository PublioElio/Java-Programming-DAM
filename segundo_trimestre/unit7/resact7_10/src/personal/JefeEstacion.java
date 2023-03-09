package personal;

import java.time.LocalDate;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class JefeEstacion {

    private String nombre;
    private String dni;
    private final LocalDate NOMBRAMIENTO;

    public JefeEstacion(String nombre, String dni, LocalDate nombramiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.NOMBRAMIENTO = nombramiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getNOMBRAMIENTO() {
        return NOMBRAMIENTO;
    }
}
