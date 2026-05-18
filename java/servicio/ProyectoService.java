package servicio;
import dao.ProyectoDao;
import modelo.Proyecto;
/**
 *
 * @authors Alexander, Manuel
 */

public class ProyectoService {

    private ProyectoDao dao;

    public ProyectoService() {
        dao = new ProyectoDao();
    }

    public boolean registrarProyecto(
            int id,
            String nombre,
            String descripcion) {

        if (nombre.isBlank()) {

            System.out.println("Nombre inválido");
            return false;
        }

        Proyecto proyecto = new Proyecto();

        return dao.guardar(proyecto);
    }
}