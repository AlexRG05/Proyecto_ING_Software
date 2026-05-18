package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Proyecto;
import util.Conexion;

/**
 *
 * @author Alexander Manuel
 */
public class ProyectoDao {


    public boolean guardar(
            Proyecto proyecto) {


        String sql = """
                     INSERT INTO proyectos(
                     id,
                     nombre,
                     descripcion)
                     VALUES(?,?,?)
                     """;


        try (

                Connection con =
                        Conexion.getConexion();

                PreparedStatement ps =
                        con.prepareStatement(sql)

        ) {


            ps.setInt(
                    1,
                    proyecto.getId());

            ps.setString(
                    2,
                    proyecto.getNombre());

            ps.setString(
                    3,
                    proyecto.getDescripcion());


            return
                    ps.executeUpdate() > 0;


        } catch (SQLException e) {


            System.out.println(
                    e.getMessage());
        }


        return false;
    }
}
