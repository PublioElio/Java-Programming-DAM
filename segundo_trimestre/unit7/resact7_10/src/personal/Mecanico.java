package personal;

import java.util.Arrays;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Mecanico {

    private String nombre;
    private String telefono;
    private String especialidad = "Frenos";
    private static String[] ESPECIALIDADES = {"Frenos", "Hidráulica",
        "Electricidad", "Motor"};

    public Mecanico(String nombre, String telefono, String especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        if (Arrays.asList(ESPECIALIDADES).contains(especialidad)) {
            this.especialidad = especialidad;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        if (Arrays.asList(ESPECIALIDADES).contains(especialidad)) {
            this.especialidad = especialidad;
        }
    }
}
