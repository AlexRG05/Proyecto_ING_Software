package modelo;

/**
 *
 * @authors Alexander, Minoru
 */
public class Programa {
    private String nombre;
    private String rutaArchivo;

    public Programa(
            String nombre,
            String rutaArchivo) {

        this.nombre = nombre;
        this.rutaArchivo = rutaArchivo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }
}
