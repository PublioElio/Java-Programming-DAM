package appact_15;

import java.util.Arrays;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Calendario {

    private int anyo;
    private int mes;
    private int dia;
    private static final int[] MESES_30_DIAS = {4, 6, 9, 11};

    public Calendario(int anyo, int mes, int dia) {
        this.anyo = anyo != 0 ? anyo : 1;
        this.mes = mes >= 1 && mes <= 12 ? mes : 1;
        if (mes == 2) {
            this.dia = dia >= 1 && dia <= 28 ? dia : 1;
        } else if (Arrays.binarySearch(MESES_30_DIAS, mes) >= 0) {
            this.dia = dia >= 1 && dia <= 30 ? dia : 1;
        } else {
            this.dia = dia >= 1 && dia <= 31 ? dia : 1;
        }
    }

    public void incrementarDia() {
        if (mes == 2 && dia == 28) {
            mes = 3;
            dia = 1;
        } else if (Arrays.binarySearch(MESES_30_DIAS, mes) >= 0
                && dia == 30) {
            mes++;
            dia = 1;
        } else if (dia == 31) {
            mes++;
            dia = 1;
        } else {
            dia++;
        }
    }

    public void incrementarMes() {
        mes = mes == 12 ? 1 : mes + 1;
        dia = (mes == 2 && dia > 28) || (Arrays.binarySearch(MESES_30_DIAS,
                mes) < 0 && dia > 30) ? 1 : dia;
    }

    public void incrementarAnyo(int anyos) {
        if (anyo < 0 && (anyo + anyos) >= 0) {
            anyo++;
        }
        setAnyo(anyo + anyos);
    }

    public String mostrar() {
        String s = anyo + "";
        s = mes < 10 ? s + "/0" + mes : s + "/" + mes;
        s = dia < 10 ? s + "/0" + dia : s + "/" + dia;
        return (s);
    }

    public boolean iguales(Calendario otraFecha) {
        return ((otraFecha.getAnyo() == anyo) && (otraFecha.getMes() == mes) && 
                (otraFecha.getDia() == dia));
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo != 0 ? anyo : 1;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes >= 1 && mes <= 12 ? mes : 1;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (mes == 2) {
            this.dia = dia >= 1 && dia <= 28 ? dia : 1;
        } else if (Arrays.binarySearch(MESES_30_DIAS, mes) >= 0) {
            this.dia = dia >= 1 && dia <= 30 ? dia : 1;
        } else {
            this.dia = dia >= 1 && dia <= 31 ? dia : 1;
        }
    }

}
