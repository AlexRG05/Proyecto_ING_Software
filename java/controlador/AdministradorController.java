package controlador;

import servicio.ProyectoService;

public class AdministradorController {

    public static void main(String[] args) {

        ProyectoService service =
                new ProyectoService();

        boolean creado =
                service.registrarProyecto(
                        1001,
                        "Sistema Factory",
                        "Gestión de proyectos");

        if (creado) {

            System.out.println(
                    "Proyecto registrado correctamente");
        } else {

            System.out.println(
                    "No se pudo registrar");
        }
    }
}
