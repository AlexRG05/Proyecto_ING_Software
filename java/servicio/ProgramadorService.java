package servicio;
import modelo.Programa;
/**
 *
 * @authors Alexander Minoru
 */

public class ProgramadorService {

    public void subirPrograma(
            String nombre,
            String ruta) {

        Programa programa =
                new Programa(nombre, ruta);

        System.out.println(
                "Programa registrado: "
                        + programa.getNombre());

        System.out.println(
                "Archivo: "
                        + programa.getRutaArchivo());
    }
}