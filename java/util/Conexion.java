package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alexander Manuel
 */
public class Conexion {


    private static final String URL =
            "jdbc:sqlite:factory.db";


    public static Connection getConexion() {


        try {

            return DriverManager.getConnection(
                    URL);

        } catch (SQLException e) {

            System.out.println(
                    e.getMessage());

            return null;
        }
    }
}
