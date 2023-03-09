package maquinaria;

import personal.Mecanico;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Locomotora {

    private String matricula;
    private int potencia;
    private int anyoFabricacion;
    private Mecanico mecanico;

    public Locomotora(String matricula, int potencia, int anyoFabricacion, 
            Mecanico mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anyoFabricacion = anyoFabricacion;
        this.mecanico = mecanico;
    }
}
