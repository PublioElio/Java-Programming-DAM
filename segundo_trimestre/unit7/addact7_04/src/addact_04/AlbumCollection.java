package addact_04;

/**
 * Realiza el programa “Colección de discos” por tu cuenta, mirando lo menos
 * posible el ejemplo que se proporciona. Pruébalo primero para ver cómo
 * funciona y luego intenta implementarlo tú mismo.
 *
 * Ejercicio 4 Modifica el programa “Colección de discos” como se indica a
 * continuación: a) Mejora la opción “Nuevo disco” de tal forma que cuando se
 * llenen todas las posiciones del array, el programa muestre un mensaje de
 * error. No se permitirá introducir los datos de ningún disco hasta que no se
 * borre alguno de la lista. b) Mejora la opción “Borrar” de tal forma que se
 * verifique que el código introducido por el usuario existe. c) Modifica el
 * programa de tal forma que el código del disco sea único, es decir que no se
 * pueda repetir. d) Crea un submenú dentro dentro de “Listado” de tal forma que
 * exista un listado completo, un listado por autor (todos los discos que ha
 * publicado un determinado autor), un listado por género (todos los discos de
 * un género de- terminado) y un listado de discos cuya duración esté en un
 * rango determinado
 *
 * por el usuario.
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class AlbumCollection {

    private Album[] collection;
    private int totalAlbums;

    public AlbumCollection(int length) {
        length = length < 3 ? 3 : length;
        this.collection = new Album[length];
        this.totalAlbums = 0;
    }

    public int searchAlbum(Album a) {
        int pos = -1;
        for (int i = 0; (pos != -1) && (i < totalAlbums); i++) {
            pos = this.collection[i].getCode().equals(a.getCode())
                    ? i : pos;
        }
        return (pos);
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.totalAlbums; i++) {
            s += this.collection[i].toString();
        }
        return (s);
    }

}
