package maquinaria;

import personal.Maquinista;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Tren {

    private Locomotora locomotora;
    private Vagon[] vagones;
    private Maquinista responsable;
    private int numVagones;

    public Tren(Locomotora locomotora, Maquinista responsable) {
        this.locomotora = locomotora;
        this.responsable = responsable;
        this.vagones = new Vagon[5];
        this.numVagones = 0;
    }

    public void engancharVagon(int cargaMax, int cargaActual, 
            String mercancia) {
        if (getNumVagones() < 5) {
            Vagon vagon = new Vagon(getNumVagones(), cargaMax, cargaActual,
                    mercancia);
            getVagones()[getNumVagones()] = vagon;
            setNumVagones(getNumVagones() + 1);
        }
    }

    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public Vagon[] getVagones() {
        return vagones;
    }

    public void setVagones(Vagon[] vagones) {
        this.vagones = vagones;
    }

    public Maquinista getResponsable() {
        return responsable;
    }

    public void setResponsable(Maquinista responsable) {
        this.responsable = responsable;
    }

    public int getNumVagones() {
        return numVagones;
    }

    public void setNumVagones(int numVagones) {
        this.numVagones = numVagones;
    }

}
